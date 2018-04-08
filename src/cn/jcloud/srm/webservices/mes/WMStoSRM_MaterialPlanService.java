package cn.jcloud.srm.webservices.mes;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.mes.WMStoSRM_MaterialPlanRequest;
import cn.jcloud.srm.beans.mes.WMStoSRM_MaterialPlanRequestItem;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MaterialPlanMsgResult;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.mes.MaterialPlanItem;
import cn.jcloud.srm.entity.mes.MaterialPlanRise;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.entity.srm.DistributionOrder;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.mes.MaterialPlanItemService;
import cn.jcloud.srm.service.mes.MaterialPlanRiseService;
import cn.jcloud.srm.service.sap.MtlItemsService;
import cn.jcloud.srm.service.srm.DistributionOrderService;

/**
 * @author 蒋维
 * @date 创建时间：2017年10月31日 下午4:22:42
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Service("WMStoSRM_MaterialPlanService")
@Scope("prototype")
public class WMStoSRM_MaterialPlanService {
	private static final Logger LOGGER = LoggerFactory.getLogger(WMStoSRM_MaterialPlanService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private MaterialPlanRiseService riseService;
	@Autowired
	private MaterialPlanItemService itemService;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private MtlItemsService mtlItemsService;
	@Autowired
	private DistributionOrderService distributionOrderService;
	@Autowired
	private WebServiceHandleException handleException;

	public MaterialPlanMsgResult WMStoSRM_MaterialPlan(Header header, List<WMStoSRM_MaterialPlanRequest> requests) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.WMSTOSRMMATERIALPLANPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.WMSTOSRMMATERIALPLAN);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		List<MaterialPlanItem> materialPlanItems = new ArrayList<>();
		MaterialPlanMsgResult result = new MaterialPlanMsgResult();
		try {
			handleException.WMStoSRM_MaterialPlanHandle(requests);
			for (WMStoSRM_MaterialPlanRequest request : requests) {
				if (request.getFreeUse2().equals("1")) {
					MaterialPlanRise materialPlanRise = riseService.getByCode(request.getMaterialPlan_code());
					DistributionOrder order = distributionOrderService
							.getByInfoPlanRiseIdAndDistributionTypeAndPrintStatus((long) materialPlanRise.getId(), 0,
									1);
					if (order != null) {
						throw new Exception("已在配送中，禁止修改！");
					}
					List<MaterialPlanItem> list = itemService.getByHeadId(materialPlanRise.getId());
					if (list != null && list.size() > 0) {
						for (MaterialPlanItem item : list) {
							for (WMStoSRM_MaterialPlanRequestItem materialPlanItem : request.getItems()) {
								if (item.getMaterial_plan_line().equals(materialPlanItem.getMaterialPlan_line())) {
									itemService.updateCancelStatusByLineId(item.getId(),
											Integer.parseInt(materialPlanItem.getFreeUse1()));
								}
							}
						}
					}
					continue;
				}
				MaterialPlanRise materialPlanRise = riseService.getByCode(request.getMaterialPlan_code());
				if (materialPlanRise == null) {
					materialPlanRise = new MaterialPlanRise();
					materialPlanRise.setCreate_date(new Date());
					materialPlanRise.setMaterial_plan_code(request.getMaterialPlan_code());
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
					materialPlanRise.setNeed_time(sdf.parse(request.getNeed_time()));
					materialPlanRise.setStorage_location(request.getStorage_location());
					materialPlanRise.setWh_code(request.getWh_code());
					materialPlanRise.setWh_name(request.getWh_name());
					materialPlanRise.setSend_to("2000");
					materialPlanRise.setWorkshop_code(request.getWorkshop_code());
					materialPlanRise.setWorkshop_name(request.getWorkshop_name());
					materialPlanRise.setVendor_code(request.getSupplyer_code());
					materialPlanRise.setStocker_code(request.getStocker_code());
					materialPlanRise.setStation_code(request.getStation_code());
					materialPlanRise.setStation_name(request.getStation_name());
					VendorInfo info = infoService.getByCode(request.getSupplyer_code());
					materialPlanRise.setVendor_id(info.getVendorId());
					materialPlanRise.setVendor_name(info.getVendorName());
					materialPlanRise.setDocument_type(request.getFreeUse1());
					materialPlanRise.setDistribution_status(0);
					riseService.save(materialPlanRise);
				}
				for (WMStoSRM_MaterialPlanRequestItem item : request.getItems()) {
					MaterialPlanItem materialPlanItem = new MaterialPlanItem();
					materialPlanItem.setMaterial_plan_line(item.getMaterialPlan_line());
					materialPlanItem.setMaterial_code(item.getMater_code());
					MtlItems mtlItems = mtlItemsService.getByCode(item.getMater_code());
					materialPlanItem.setMaterial_id(mtlItems.getItemId());
					materialPlanItem.setPurchasing_group(mtlItems.getPurchasing_group());
					materialPlanItem.setMaterial_name(mtlItems.getDescriptions());
					materialPlanItem.setCar_type(item.getCar_type());
					materialPlanItem.setNeed_count(BigDecimal.valueOf(Double.parseDouble(item.getNeed_count())));
					materialPlanItem.setLeast_counts(BigDecimal.valueOf(Double.parseDouble(item.getNeed_count())));
					materialPlanItem.setUnit(item.getUnit());
					materialPlanItem.setDistribution_status(0);
					materialPlanItem.setVin(item.getVin());
					materialPlanItem.setCancel_status(Integer.parseInt(item.getFreeUse1()));
					materialPlanItem.setHead_id(materialPlanRise.getId());
					materialPlanItem.setReceipts_counts(BigDecimal.valueOf(0));
					materialPlanItem.setCollection_count(BigDecimal.valueOf(0));
					materialPlanItem.setQualified_number(BigDecimal.valueOf(0));
					materialPlanItem.setIllqualified_number(BigDecimal.valueOf(0));
					materialPlanItem.setPassage_number(BigDecimal.valueOf(0));
					materialPlanItems.add(materialPlanItem);
				}
			}
			itemService.saves(materialPlanItems);

		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.WMSTOSRMMATERIALPLAN, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			List<String> codes = new ArrayList<>();
			for (WMStoSRM_MaterialPlanRequest request : requests) {
				codes.add(request.getMaterialPlan_code());
			}
			result.setMaterialPlan_codes(codes);
			result.setZmessage(e.getMessage());
			result.setZtype('0');
			return result;
		}
		LOGGER.info(InterfaceStringUtils.WMSTOSRMMATERIALPLAN);
		state.setSyncEndDate(new Date());
		state.setOperationState("要料计划编号:" + requests.get(0).getMaterialPlan_code() + ",成功");
		stateService.save(state);
		List<String> codes = new ArrayList<>();
		for (WMStoSRM_MaterialPlanRequest request : requests) {
			codes.add(request.getMaterialPlan_code());
		}
		result.setMaterialPlan_codes(codes);
		result.setZmessage("成功");
		result.setZtype('1');
		return result;
	}
}
