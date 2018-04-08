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

import cn.jcloud.srm.beans.sap.IfSRM2SAPAclabLineItem;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAclabLineItem2;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAclabRequest;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAclabRequest2;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem2;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise2;
import cn.jcloud.srm.entity.srm.PoInfoPlanLineItem2_R;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.sap.MtlItemsService;
import cn.jcloud.srm.service.sap.PoInfoPlanLineItem2Service;
import cn.jcloud.srm.service.sap.PoInfoPlanLineItemService;
import cn.jcloud.srm.service.sap.PoInfoPlanRise2Service;
import cn.jcloud.srm.service.sap.PoInfoPlanRiseService;
import cn.jcloud.srm.service.srm.PoInfoPlanLineItem2_RService;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月7日 下午4:17:55
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Service("AclabService")
@Scope("prototype")
public class AclabService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AclabService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private PoInfoPlanLineItemService itemService;
	@Autowired
	private PoInfoPlanRiseService riseService;
	@Autowired
	private PoInfoPlanLineItem2Service item2Service;
	@Autowired
	private PoInfoPlanLineItem2_RService item2rService;
	@Autowired
	private PoInfoPlanRise2Service rise2Service;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private MtlItemsService mtlItemsService;
	@Autowired
	private WebServiceHandleException handleException;

	public MsgResult ifSRM2SAPAclab(Header header, List<IfSRM2SAPAclabRequest> requests) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPACLABPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPACLAB1);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		state.setSyncStartDate(new Date());
		MsgResult result = new MsgResult();
		List<PoInfoPlanRise> list = new ArrayList<>();
		try {
			handleException.ifSRM2SAPAclabHandle1(requests,result);
			List<PoInfoPlanLineItem> poInfos = new ArrayList<>();
			for (IfSRM2SAPAclabRequest request : requests) {
				PoInfoPlanRise rise = riseService.getByCode(request.getEbeln());
				if (rise == null) {
					rise = new PoInfoPlanRise();
					rise.setOmCode(request.getLifnr());
					VendorInfo info = infoService.getByCode(request.getLifnr());
					rise.setVendorId(info.getVendorId().intValue());
					rise.setOmName(info.getVendorName());
					rise.setDocNumber(request.getDocNum());
					rise.setPurchasePlanNumber(request.getEbeln());
					rise.setCreateDate(sdf.parse(request.getLabDate()));
					rise.setCreate_time(new Date());
					riseService.save(rise);
					list.add(rise);
				}
				for (IfSRM2SAPAclabLineItem item : request.getList()) {
					sdf = new SimpleDateFormat("yyyyMMdd");
					if(itemService.checkExistPlanLine(rise.getId(), item.getEbelp(), sdf.parse(item.getEindt()), item.getLgort(), item.getAbruf())) {
						continue;
					}
					itemService.updateOldPlanLine(rise.getId(), item.getEbelp(), sdf.parse(item.getEindt()), item.getLgort(), item.getAbruf());
					PoInfoPlanLineItem poInfo = new PoInfoPlanLineItem();
					poInfo.setOmCode(request.getLifnr());
					sdf = new SimpleDateFormat("yyyyMMddhhmmss");
					String dateStr = item.getcDate() + item.getcTime();
					poInfo.setDeliverDate(sdf.parse(dateStr));
					sdf = new SimpleDateFormat("yyyyMMdd");
					poInfo.setDeliveryDate(sdf.parse(item.getEindt()));
					poInfo.setApprovalNumber(item.getAbruf());
					poInfo.setPurchasePlanProjectNumber(item.getEbelp());
					poInfo.setLabType(item.getLab_typ());
					poInfo.setDeliveryLocation(item.getLgort());
					poInfo.setMeasurementUnit(item.getMeis());
					poInfo.setMaterielNumber(item.getMatnr());
					MtlItems mtlItems = mtlItemsService.getByCode(item.getMatnr());
					poInfo.setMaterielDescribe(mtlItems.getDescriptions());
					poInfo.setMaterielId(mtlItems.getItemId());
					poInfo.setPurchasing_group(mtlItems.getPurchasing_group());
					poInfo.setDeliveryNumber(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
					poInfo.setLeastCounts(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
					poInfo.setDeliveryLocationName(item.getFreeUse2());
					poInfo.setDate_type(item.getFreeUse3());
					poInfo.setCollectFactory(item.getWerks());
					poInfo.setHeadId(rise.getId());
					poInfo.setState(0);
					poInfo.setPurchasePlanType(1);
					poInfo.setBooleanStatus(0);
					poInfo.setDistributionStatus(0);
					poInfo.setValid_status(1);
					poInfos.add(poInfo);
				}
			}
			itemService.saves(poInfos);
		} catch (Exception e) {
			for (PoInfoPlanRise rise : list) {
				List<PoInfoPlanLineItem> items = itemService.getByHeadId(rise.getId());
				if (items == null || items.isEmpty()) {
					riseService.deleteById(rise.getId());
				}
			}
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPACLAB1, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			result.setZtype('E');
			result.setZmessage(e.getMessage());
			return result;
		}
		LOGGER.info(InterfaceStringUtils.IFSRM2SAPACLAB1);
		state.setSyncEndDate(new Date());
		state.setOperationState("采购协议号" + requests.get(0).getEbeln() +"成功");
		stateService.save(state);
		result.setZtype('S');
		result.setZmessage("成功");
		return result;
	}

	/**
	 * 直供
	 * 
	 * @param header
	 * @param requests
	 * @return
	 */
	public MsgResult ifSRM2SAPAclab2(Header header, List<IfSRM2SAPAclabRequest2> requests) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPACLABPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPACLAB2);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		state.setSyncStartDate(new Date());
		MsgResult result = new MsgResult();
		List<PoInfoPlanRise2> list = new ArrayList<>();
		try {
			handleException.ifSRM2SAPAclabHandle2(requests,result);
			List<PoInfoPlanLineItem2> poInfos = new ArrayList<>();
			for (IfSRM2SAPAclabRequest2 request : requests) {
				for (IfSRM2SAPAclabLineItem2 item : request.getList()) {
					if ("M".equals(item.getFreeUse1().toUpperCase())) {
						continue;
					}
					
					// 1、组装唯一标识：供应商编码+采购计划协议号+需求日期+仓库编码
					String srmKey = request.getLifnr() + request.getEbeln() + item.getEindt() + request.getFreeUse1()+item.getFreeUse1()+item.getFreeUse2();
					PoInfoPlanRise2 rise = rise2Service.getBySrmKey(srmKey);
					if (rise == null) {
						if ("0".equals(item.getMenge())) {
							continue;
						}
						rise = new PoInfoPlanRise2();
						rise.setOmCode(request.getLifnr());
						VendorInfo info = infoService.getByCode(request.getLifnr());
						rise.setVendorId(info.getVendorId().intValue());
						rise.setOmName(info.getVendorName());
						rise.setDocNumber(request.getDocNum());
						rise.setPurchasePlanNumber(request.getEbeln());
						rise.setCreateDate(sdf.parse(request.getLabDate()));
						rise.setDeliveryLocation(request.getLgort());
						rise.setDeliveryLocationName(request.getFreeUse1());
						rise.setDocument_type(request.getFreeUse2());
						rise.setStocker_code(item.getFreeUse2());
						rise.setCollectFactory(request.getWerks());
						rise.setDistribution_head_status(0);
						sdf = new SimpleDateFormat("yyyyMMdd");
						rise.setNeedDate(sdf.parse(item.getEindt()));
						rise.setSrmkey(srmKey);
						rise.setCreate_time(new Date());
						String number = ""+(rise2Service.getCountByCode(request.getLifnr()) + 1);
						while (number.length()<5) {
							number = "0"+number;
						}
						sdf = new SimpleDateFormat("yy");
						rise.setSrmPmCode("JMP" +sdf.format(new Date())+request.getLifnr().substring(request.getLifnr().length()-4, request.getLifnr().length())+number);
						rise2Service.save(rise);
						list.add(rise);
					}

					PoInfoPlanLineItem2 poInfo = item2Service.getByHeaderIdAndLineCode(rise.getId(), item.getEbelp());
					if(poInfo != null && poInfo.getApprovalNumber().equals(item.getAbruf())) {
						continue;
					}
					if (poInfo == null) {
						poInfo = new PoInfoPlanLineItem2();
					}

					if (poInfo.getId() != 0 && !poInfo.getMaterielNumber().equals(item.getMatnr())) {
						throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料发生变化！");
					}
					poInfo.setOmCode(request.getLifnr());
					sdf = new SimpleDateFormat("yyyyMMddhhmmss");
					String dateStr = item.getcDate() + item.getcTime();
					poInfo.setDeliverDate(sdf.parse(dateStr));
					sdf = new SimpleDateFormat("yyyyMMdd");
					poInfo.setDeliveryDate(sdf.parse(item.getEindt()));
					poInfo.setApprovalNumber(item.getAbruf());
					poInfo.setPurchasePlanProjectNumber(item.getEbelp());
					poInfo.setLabType(item.getLab_typ());
					poInfo.setMeasurementUnit(item.getMeis());
					poInfo.setMaterielNumber(item.getMatnr());
					poInfo.setCarType(item.getCar_type());
					MtlItems mtlItems = mtlItemsService.getByCode(item.getMatnr());
					poInfo.setMaterielDescribe(mtlItems.getDescriptions());
					poInfo.setMaterielId(mtlItems.getItemId());
					poInfo.setPurchasing_group(mtlItems.getPurchasing_group());
					poInfo.setDeliveryNumber(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
					poInfo.setLeastCounts(BigDecimal.valueOf(Double.parseDouble(item.getMenge())));
					poInfo.setDate_type(item.getFreeUse1());
					poInfo.setHeadId(rise.getId());
					if (poInfo.getId() == 0) {
						poInfo.setHeadId(rise.getId());
						poInfo.setState(0);
						poInfo.setPurchasePlanType(1);
						poInfo.setBooleanStatus(0);
						poInfo.setDistributionStatus(0);
						poInfo.setChange_status(0);
						poInfo.setCollection_count(BigDecimal.valueOf(0));
						poInfo.setQualified_number(BigDecimal.valueOf(0));
						poInfo.setIllqualified_number(BigDecimal.valueOf(0));
						poInfo.setPassage_number(BigDecimal.valueOf(0));
						poInfo.setReceipts_counts(BigDecimal.valueOf(0));
						poInfos.add(poInfo);
					} else {
						if(poInfo.getLeastCounts().doubleValue()<(poInfo.getDeliveryNumber().doubleValue()-Double.parseDouble(item.getMenge()))) {
							throw new Exception("采购协议号：" + request.getEbeln() + " 采购协议行项目号：" + item.getEbelp() + "物料已发送数量大于修改后需求数量！");
						}
						
						poInfo.setLeastCounts(BigDecimal.valueOf(poInfo.getLeastCounts().doubleValue() + Double.parseDouble(item.getMenge())
									- poInfo.getDeliveryNumber().doubleValue()));
						poInfo.setDistributionStatus(0);
						
						poInfo.setChange_status(1);
						item2Service.update(poInfo);
						PoInfoPlanLineItem2_R item2_R = new PoInfoPlanLineItem2_R();
						BeanUtils.copyProperties(poInfo, item2_R);
						item2_R.setId(0);
						item2rService.save(item2_R);
					}
				}
			}
			item2Service.saves(poInfos);
			for (PoInfoPlanLineItem2 item : poInfos) {
				PoInfoPlanLineItem2_R item2_R = new PoInfoPlanLineItem2_R();
				BeanUtils.copyProperties(item, item2_R);
				item2_R.setId(0);
				item2rService.save(item2_R);
			}
		} catch (Exception e) {
			for (PoInfoPlanRise2 rise : list) {
				List<PoInfoPlanLineItem2> items = item2Service.getByHeadId(rise.getId());
				if (items == null || items.isEmpty()) {
					rise2Service.deleteById(rise.getId());
				}
			}
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPACLAB2, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			result.setZtype('E');
			result.setZmessage(e.getMessage());
			return result;
		}
		LOGGER.info(InterfaceStringUtils.IFSRM2SAPACLAB2);
		state.setSyncEndDate(new Date());
		state.setOperationState("采购协议号" + requests.get(0).getEbeln() +"成功");
		stateService.save(state);
		result.setZtype('S');
		result.setZmessage("成功");
		return result;
	}
}
