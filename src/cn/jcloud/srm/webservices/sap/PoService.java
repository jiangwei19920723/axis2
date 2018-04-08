package cn.jcloud.srm.webservices.sap;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.sap.IFSAP2SRMPoRequest;
import cn.jcloud.srm.beans.sap.IfSAP2SRMPoLineItem;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.entity.sap.PoLineItem;
import cn.jcloud.srm.entity.sap.PoRise;
import cn.jcloud.srm.entity.srm.PoLineItem_R;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.sap.MtlItemsService;
import cn.jcloud.srm.service.sap.PoLineItemService;
import cn.jcloud.srm.service.sap.PoRiseService;
import cn.jcloud.srm.service.srm.PoLineItem_RService;

/**
 * @author 蒋维
 * @date 创建时间：2017年12月26日 下午3:58:15
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Service("PoService")
@Scope("prototype")
public class PoService {
	private static final Logger LOGGER = LoggerFactory.getLogger(PoService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private PoRiseService riseService;
	@Autowired
	private PoLineItemService itemService;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private PoLineItem_RService itemrService;
	@Autowired
	private MtlItemsService mtlItemsService;
	@Autowired
	private WebServiceHandleException handleException;

	public MsgResult ifSAP2SRMPo(Header header, IFSAP2SRMPoRequest request) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(request);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSAP2SRMPOPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSAP2SRMPO);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		state.setSyncStartDate(new Date());
		MsgResult result = new MsgResult();
		List<PoRise> list = new ArrayList<>();
		try {
			handleException.ifSAP2SRMPoHandle(request,result);
			List<PoLineItem> poInfos = new ArrayList<>();
			for (IfSAP2SRMPoLineItem item : request.getItems()) {
				if ("1".equals(item.getFreeUse1())) {
					add(request, item, list, poInfos);
				} else if ("2".equals(item.getFreeUse1())) {
					modify(request, item, list, poInfos);
				} else if ("3".equals(item.getFreeUse1())) {
					close(request, item);
				} else if ("4".equals(item.getFreeUse1())) {
					delete(request, item);
				} else {
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + " 操作方式不正确！");
				}
			}
			itemService.saves(poInfos);
			for (PoLineItem item : poInfos) {
				PoLineItem_R item_R = new PoLineItem_R();
				BeanUtils.copyProperties(item, item_R);
				item_R.setId(0);
				itemrService.save(item_R);
			}
			List<PoRise> poRises = riseService.getByCode(request.getEbeln());
			if (poRises.size() > 0) {
				for (PoRise poRise : poRises) {
					List<PoLineItem> items = itemService.getByHeadIdAndDeleteState(poRise.getId(), 0);
					if (items == null || items.isEmpty()) {
						poRise.setDelete_status(1);
						riseService.update(poRise);
					}
				}
			}
		} catch (Exception e) {
			if (list.size() > 0) {
				for (PoRise rise : list) {
					List<PoLineItem> items = itemService.getByHeadId(rise.getId());
					if (items == null || items.isEmpty()) {
						riseService.delete(rise);
					}
				}
			}
			LOGGER.error(InterfaceStringUtils.IFSAP2SRMPO, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			result.setZtype('E');
			result.setZmessage(e.getMessage());
			return result;
		}
		LOGGER.info(InterfaceStringUtils.IFSAP2SRMPO);
		state.setSyncEndDate(new Date());
		state.setOperationState("采购协议号：" + request.getEbeln() + "成功");
		stateService.save(state);
		result.setZtype('S');
		result.setZmessage("成功");
		return result;
	}

	private void add(IFSAP2SRMPoRequest request, IfSAP2SRMPoLineItem item, List<PoRise> headers, List<PoLineItem> lines)
			throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		// 1、组装唯一标识：供应商编码+采购计划协议号+需求日期+仓库编码+保管员+工厂
		String srmKey = request.getLifnr() + request.getEbeln() + item.getEindt() + item.getLgort()
				+ item.getStocker_code() + item.getWerks();
		PoRise rise = riseService.getBySrmKey(srmKey);
		if (rise == null) {
			if ("0".equals(item.getMenge())) {
				return;
			}
			rise = new PoRise();
			rise.setOrder_type(request.getPo_type());
			rise.setBusiness_type(request.getYw_typpe());
			rise.setLab_type(item.getLab_type());
			rise.setOm_code(request.getLifnr());
			VendorInfo info = infoService.getByCode(request.getLifnr());
			rise.setOm_name(info.getVendorName());
			rise.setVendor_id(info.getVendorId().intValue());
			rise.setDoc_number(request.getDocnum());
			rise.setCreate_date(sdf.parse(request.getLabdate()));
			rise.setPurchase_plan_number(request.getEbeln());
			rise.setDelivery_date(sdf.parse(item.getEindt()));
			rise.setCollect_location(item.getLgort());
			rise.setCollect_location_name(item.getLgort_name());
			rise.setStocker_code(item.getStocker_code());
			rise.setCollect_factory(item.getWerks());
			String deliverDate = request.getCdate() + request.getCtime();
			sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			rise.setDeliver_date(sdf.parse(deliverDate));
			rise.setDistribution_head_status(0);
			sdf = new SimpleDateFormat("yyyyMMdd");
			rise.setSrmkey(srmKey);
			rise.setCreate_time(new Date());
			rise.setDelete_status(0);
			rise.setClose_status(0);
			rise.setModify_status(0);
			String number = "" + (riseService.getCountByCode(request.getLifnr()) + 1);
			while (number.length() < 5) {
				number = "0" + number;
			}
			sdf = new SimpleDateFormat("yy");
			rise.setSrm_pm_code("JMP" + sdf.format(new Date())
					+ request.getLifnr().substring(request.getLifnr().length() - 4, request.getLifnr().length())
					+ number);
			riseService.save(rise);
			headers.add(rise);
		}

		PoLineItem poInfo = itemService.getByHeaderIdAndLineCode(rise.getId(), item.getEbelp());
		if (poInfo != null) {
			throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料重复添加！");
		}
		poInfo = new PoLineItem();

		sdf = new SimpleDateFormat("yyyyMMdd");
		poInfo.setHead_line(request.getEbeln() + item.getEbelp());
		poInfo.setVersion(item.getAbruf());
		poInfo.setPurchase_plan_project_number(item.getEbelp());
		poInfo.setMeasurement_unit(item.getMeis());
		poInfo.setCar_type(item.getCar_type());
		MtlItems mtlItems = mtlItemsService.getByCode(item.getMatnr());
		poInfo.setMateriel_name(mtlItems.getDescriptions());
		poInfo.setMateriel_code(mtlItems.getItemCode());
		poInfo.setMateriel_id(mtlItems.getItemId());
		poInfo.setPurchasing_group(mtlItems.getPurchasing_group());
		poInfo.setDelivery_number(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
		poInfo.setLeast_counts(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
		poInfo.setHead_id(rise.getId());
		poInfo.setHead_id(rise.getId());
		poInfo.setState(0);
		poInfo.setPurchase_plan_type(1);
		poInfo.setBoolean_status(0);
		poInfo.setDistribution_status(0);
		poInfo.setCollection_count(BigDecimal.valueOf(0));
		poInfo.setQualified_number(BigDecimal.valueOf(0));
		poInfo.setIllqualified_number(BigDecimal.valueOf(0));
		poInfo.setPassage_number(BigDecimal.valueOf(0));
		poInfo.setReceipts_counts(BigDecimal.valueOf(0));
		poInfo.setDelete_status(0);
		poInfo.setClose_status(0);
		poInfo.setChange_status(0);

		lines.add(poInfo);
	}

	private void delete(IFSAP2SRMPoRequest request, IfSAP2SRMPoLineItem item) throws Exception {
		/*// 1、组装唯一标识：供应商编码+采购计划协议号+需求日期+仓库编码
		String srmKey = request.getLifnr() + request.getEbeln() + item.getEindt() + item.getLgort()
				+ item.getStocker_code() + item.getWerks();
		PoRise rise = riseService.getBySrmKey(srmKey);
		if (rise == null) {
			return;
		}*/
		
		List<PoLineItem> poInfos = itemService.getByHeadLineAndDeleteState(request.getEbeln()+item.getEbelp(), 0);

		if (poInfos == null || poInfos.size() == 0) {
			return;
		}

		for (PoLineItem poInfo :poInfos) {
			// 1、判断是否已发货，如果已发货，返回异常
			if (poInfo.getCollection_count().doubleValue() > 0.0D) {
				throw new Exception(
						"采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + ",供应商已发货，不能进行删除操作！");
			}
			// 2、更改行删除状态
			poInfo.setDelete_status(1);
			itemService.update(poInfo);
		}
	}

	private void close(IFSAP2SRMPoRequest request, IfSAP2SRMPoLineItem item) throws Exception {
		// 1、组装唯一标识：供应商编码+采购计划协议号+需求日期+仓库编码
		/*String srmKey = request.getLifnr() + request.getEbeln() + item.getEindt() + item.getLgort()
				+ item.getStocker_code() + item.getWerks();
		PoRise rise = riseService.getBySrmKey(srmKey);
		if (rise == null) {
			return;
		}*/

		List<PoLineItem> poInfos = itemService.getByHeadLine(request.getEbeln()+item.getEbelp());

		for (PoLineItem poInfo :poInfos) {
			if (poInfo == null) {
				return;
			}
			poInfo.setDelivery_number(poInfo.getCollection_count());
			poInfo.setLeast_counts(BigDecimal.valueOf(0));
			poInfo.setClose_status(1);
			itemService.update(poInfo);
		}
	}

	private void modify(IFSAP2SRMPoRequest request, IfSAP2SRMPoLineItem item, List<PoRise> headers,
			List<PoLineItem> lines) throws Exception {
		// 1、组装唯一标识：供应商编码+采购计划协议号+需求日期+仓库编码
		// 2、查找对应头信息，如果没有，则新建头信息
		// 3、根据行key找到行信息，对比行的头ID是否等于第二步的头ID
		// 4、如果不同：判断是否已经发货，如果已发货，返回错误。如未发货，修改行中的头ID
		// 3、行信息，增加一个key字段：采购计划协议号+行项目号
		// 4、根据行key，查找行信息，如果没有，则新建；

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		// 1、组装唯一标识：供应商编码+采购计划协议号+需求日期+仓库编码
		String srmKey = request.getLifnr() + request.getEbeln() + item.getEindt() + item.getLgort()
				+ item.getStocker_code() + item.getWerks();
		PoRise rise = riseService.getBySrmKey(srmKey);
		if (rise == null) {
			if ("0".equals(item.getMenge())) {
				return;
			}
			rise = new PoRise();
			rise.setOrder_type(request.getPo_type());
			rise.setBusiness_type(request.getYw_typpe());
			rise.setLab_type(item.getLab_type());
			rise.setOm_code(request.getLifnr());
			VendorInfo info = infoService.getByCode(request.getLifnr());
			rise.setOm_name(info.getVendorName());
			rise.setVendor_id(info.getVendorId().intValue());
			rise.setDoc_number(request.getDocnum());
			rise.setCreate_date(sdf.parse(request.getLabdate()));
			rise.setPurchase_plan_number(request.getEbeln());
			rise.setDelivery_date(sdf.parse(item.getEindt()));
			rise.setCollect_location(item.getLgort());
			rise.setCollect_location_name(item.getLgort_name());
			rise.setStocker_code(item.getStocker_code());
			rise.setCollect_factory(item.getWerks());
			String deliverDate = request.getCdate() + request.getCtime();
			sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			rise.setDeliver_date(sdf.parse(deliverDate));
			rise.setDistribution_head_status(0);
			sdf = new SimpleDateFormat("yyyyMMdd");
			rise.setSrmkey(srmKey);
			rise.setCreate_time(new Date());
			rise.setDelete_status(0);
			rise.setClose_status(0);
			rise.setModify_status(0);
			String number = "" + (riseService.getCountByCode(request.getLifnr()) + 1);
			while (number.length() < 5) {
				number = "0" + number;
			}
			sdf = new SimpleDateFormat("yy");
			rise.setSrm_pm_code("JMP" + sdf.format(new Date())
					+ request.getLifnr().substring(request.getLifnr().length() - 4, request.getLifnr().length())
					+ number);
			riseService.save(rise);
			headers.add(rise);

			PoLineItem poInfo = itemService.getByHeadLineAndDeleteState(request.getEbeln() + item.getEbelp(),0).get(0);
			if (poInfo == null) {
				poInfo = new PoLineItem();
			}
			if (poInfo.getHead_id() !=0 && poInfo.getHead_id() !=rise.getId()) {
				if (poInfo.getCollection_count().intValue()>0) {
					throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "已发货，不能修改！");
				}
			}
			if (poInfo.getId() != 0 && !poInfo.getMateriel_code().equals(item.getMatnr())) {
				throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料发生变化！");
			}
			sdf = new SimpleDateFormat("yyyyMMdd");
			poInfo.setVersion(item.getAbruf());
			poInfo.setPurchase_plan_project_number(item.getEbelp());
			poInfo.setMeasurement_unit(item.getMeis());
			poInfo.setCar_type(item.getCar_type());
			MtlItems mtlItems = mtlItemsService.getByCode(item.getMatnr());
			poInfo.setMateriel_name(mtlItems.getDescriptions());
			poInfo.setMateriel_code(mtlItems.getItemCode());
			poInfo.setMateriel_id(mtlItems.getItemId());
			poInfo.setPurchasing_group(mtlItems.getPurchasing_group());
			poInfo.setDelivery_number(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
			poInfo.setLeast_counts(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
			poInfo.setHead_id(rise.getId());
			if (poInfo.getId() == 0) {
				poInfo.setHead_id(rise.getId());
				poInfo.setHead_line(request.getEbeln() + item.getEbelp());
				poInfo.setState(0);
				poInfo.setPurchase_plan_type(1);
				poInfo.setBoolean_status(0);
				poInfo.setDistribution_status(0);
				poInfo.setCollection_count(BigDecimal.valueOf(0));
				poInfo.setQualified_number(BigDecimal.valueOf(0));
				poInfo.setIllqualified_number(BigDecimal.valueOf(0));
				poInfo.setPassage_number(BigDecimal.valueOf(0));
				poInfo.setReceipts_counts(BigDecimal.valueOf(0));
				poInfo.setDelete_status(0);
				poInfo.setClose_status(0);
				poInfo.setChange_status(0);
				lines.add(poInfo);
			} else {
				if (poInfo.getLeast_counts().doubleValue() < (poInfo.getDelivery_number().doubleValue()
						- Double.parseDouble(item.getMenge()))) {
					throw new Exception(
							"采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料已发送数量大于修改后需求数量！");
				}

				poInfo.setLeast_counts(BigDecimal.valueOf(poInfo.getLeast_counts().doubleValue()
						+ Double.parseDouble(item.getMenge()) - poInfo.getDelivery_number().doubleValue()));
				poInfo.setDistribution_status(0);
				poInfo.setChange_status(1);
				poInfo.setDelete_status(0);
				poInfo.setClose_status(0);
				itemService.update(poInfo);
				PoLineItem_R item_R = new PoLineItem_R();
				BeanUtils.copyProperties(poInfo, item_R);
				item_R.setId(0);
				itemrService.save(item_R);
			}
			return;
		}

		PoLineItem poInfo = itemService.getByHeadLineAndDeleteState(request.getEbeln() + item.getEbelp(),0).get(0);
		if (poInfo != null && poInfo.getVersion().equals(item.getAbruf())) {
			return;
		}
		if (poInfo == null) {
			poInfo = new PoLineItem();
		}

		if (poInfo.getId() != 0 && !poInfo.getMateriel_code().equals(item.getMatnr())) {
			throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料发生变化！");
		}
		sdf = new SimpleDateFormat("yyyyMMdd");
		poInfo.setVersion(item.getAbruf());
		poInfo.setPurchase_plan_project_number(item.getEbelp());
		poInfo.setMeasurement_unit(item.getMeis());
		poInfo.setCar_type(item.getCar_type());
		MtlItems mtlItems = mtlItemsService.getByCode(item.getMatnr());
		poInfo.setMateriel_name(mtlItems.getDescriptions());
		poInfo.setMateriel_code(mtlItems.getItemCode());
		poInfo.setMateriel_id(mtlItems.getItemId());
		poInfo.setPurchasing_group(mtlItems.getPurchasing_group());
		poInfo.setDelivery_number(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
		poInfo.setLeast_counts(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
		poInfo.setHead_id(rise.getId());
		if (poInfo.getId() == 0) {
			poInfo.setHead_id(rise.getId());
			poInfo.setHead_line(request.getEbeln() + item.getEbelp());
			poInfo.setState(0);
			poInfo.setPurchase_plan_type(1);
			poInfo.setBoolean_status(0);
			poInfo.setDistribution_status(0);
			poInfo.setCollection_count(BigDecimal.valueOf(0));
			poInfo.setQualified_number(BigDecimal.valueOf(0));
			poInfo.setIllqualified_number(BigDecimal.valueOf(0));
			poInfo.setPassage_number(BigDecimal.valueOf(0));
			poInfo.setReceipts_counts(BigDecimal.valueOf(0));
			poInfo.setDelete_status(0);
			poInfo.setClose_status(0);
			poInfo.setChange_status(0);
			lines.add(poInfo);
		} else {
			if (poInfo.getLeast_counts().doubleValue() < (poInfo.getDelivery_number().doubleValue()
					- Double.parseDouble(item.getMenge()))) {
				throw new Exception(
						"采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料已发送数量大于修改后需求数量！");
			}

			poInfo.setLeast_counts(BigDecimal.valueOf(poInfo.getLeast_counts().doubleValue()
					+ Double.parseDouble(item.getMenge()) - poInfo.getDelivery_number().doubleValue()));
			poInfo.setDistribution_status(0);
			poInfo.setChange_status(1);
			poInfo.setDelete_status(0);
			poInfo.setClose_status(0);
			itemService.update(poInfo);
			PoLineItem_R item_R = new PoLineItem_R();
			BeanUtils.copyProperties(poInfo, item_R);
			item_R.setId(0);
			itemrService.save(item_R);
		}
	}
}
