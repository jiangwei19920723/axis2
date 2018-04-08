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

import cn.jcloud.srm.beans.mes.WMStoSRM_ASNRequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.AsnMsgResult;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.mes.AsnInInfo;
import cn.jcloud.srm.entity.mes.MaterialPlanItem;
import cn.jcloud.srm.entity.mes.MaterialPlanRise;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem2;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise2;
import cn.jcloud.srm.entity.sap.PoLineItem;
import cn.jcloud.srm.entity.sap.PoRise;
import cn.jcloud.srm.entity.srm.DistributionOrder;
import cn.jcloud.srm.entity.srm.DistributionOrderItem;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.mes.AsnInInfoService;
import cn.jcloud.srm.service.mes.MaterialPlanItemService;
import cn.jcloud.srm.service.mes.MaterialPlanRiseService;
import cn.jcloud.srm.service.sap.MtlItemsService;
import cn.jcloud.srm.service.sap.PoInfoPlanLineItem2Service;
import cn.jcloud.srm.service.sap.PoInfoPlanRise2Service;
import cn.jcloud.srm.service.sap.PoLineItemService;
import cn.jcloud.srm.service.sap.PoRiseService;
import cn.jcloud.srm.service.srm.DistributionOrderItemService;
import cn.jcloud.srm.service.srm.DistributionOrderService;

/**
 * @author 蒋维
 * @date 创建时间：2017年11月3日 上午11:32:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Service("WMStoSRM_ASNService")
@Scope("prototype")
public class WMStoSRM_ASNService {
	private static final Logger LOGGER = LoggerFactory.getLogger(WMStoSRM_ASNService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private MaterialPlanRiseService materialPlanRiseService;
	@Autowired
	private MaterialPlanItemService materialPlanItemService;
	@Autowired
	private PoInfoPlanRise2Service poInfoPlanRise2Service;
	@Autowired
	private PoInfoPlanLineItem2Service poInfoPlanLineItem2Service;
	@Autowired
	private MtlItemsService mtlItemsService;
	@Autowired
	private AsnInInfoService service;
	@Autowired
	private PoRiseService poRiseService;
	@Autowired
	private PoLineItemService poLineItemService;
	@Autowired
	private DistributionOrderService orderService;
	@Autowired
	private DistributionOrderItemService itemService;
	@Autowired
	private WebServiceHandleException handleException;

	public AsnMsgResult WMStoSRM_ASN(Header header, List<WMStoSRM_ASNRequest> requests) {
		/* 1、处理接口逻辑（记录日志等基础操作） */

		/* 2、判断数据完整性，剔除错误数据，记录错误结果 */

		/* 3、入库收货单 */

		/* 4、更新ASN配送单信息，实收数量、合格数量、不合格数量、状态 */

		/* 5、更新SAP采购计划或者MES要料计划 */

		/* 5.1、更新实收数量，实收数量=原数量+接口收到的实收数量 */
		/* 5.2、更新合格数量，合格数量=原数量+接口收到的合格数量 */
		/* 5.3、更新不合格数量，不合格数量=原数量+接口收到的不合格数量 */
		/* 5.4、更新待发数量，待发数量=原数量+(ASN配送单发送数量-接口收到的合格数量) */
		/* 5.5、更新在途数量，在途数量=原数量-ASN配送单发送数量 */
		/* 5.6、更新在状态，状态=待发数量是否为0并且在途数量为0 */
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.WMSWMSTOSRMASNPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.WMSWMSTOSRMASN);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		List<AsnInInfo> asnInInfos = new ArrayList<>();
		AsnMsgResult result = new AsnMsgResult();
		try {
			handleException.WMStoSRM_ASNHandle(requests);
			DistributionOrder order = orderService.getByDistributionCode(requests.get(0).getAsnid());
			order.setPrint_status(3);
			MaterialPlanRise materialPlanRise = null;
			PoInfoPlanRise2 poInfoPlanRise2 = null;
			PoRise poRise = null;
			if (0 == order.getDistribution_type().intValue()) {
				materialPlanRise = materialPlanRiseService.getByPlanId(order.getInfo_plan_rise_id().intValue());
			} else {
				if (order.getDistribution_type().intValue() == 2) {
					poRise = poRiseService.getByPlanId(order.getInfo_plan_rise_id().intValue());
				} else if (order.getDistribution_type().intValue() == 1) {
					poInfoPlanRise2 = poInfoPlanRise2Service.getByPlanId(order.getInfo_plan_rise_id().intValue());
				}
			}
			for (WMStoSRM_ASNRequest request : requests) {
				AsnInInfo info = new AsnInInfo();
				info.setAsn_id(request.getAsnid());
				info.setMaterial_plan_code(request.getMaterialPlan_code());
				info.setMaterial_plan_line(request.getMaterialPlan_line());
				info.setIn_number(BigDecimal.valueOf(Double.parseDouble(request.getAct_charger_num())));
				info.setQualified_number(BigDecimal.valueOf(Double.parseDouble(request.getQualified_number())));
				info.setIllqualified_number(BigDecimal.valueOf(Double.parseDouble(request.getIllqualified_number())));
				info.setMaterial_code(request.getMater_code());
				MtlItems item = mtlItemsService.getByCode(request.getMater_code());
				info.setMaterial_id(item.getItemId());
				info.setPurchasing_group(item.getPurchasing_group());
				info.setMaterial_name(item.getDescriptions());
				info.setVendor_code(request.getSupplyer_code());
				VendorInfo vendorInfo = infoService.getByCode(request.getSupplyer_code());
				info.setVendor_id(vendorInfo.getVendorId());
				info.setVendor_name(vendorInfo.getVendorName());
				info.setUnit(request.getUnit());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
				info.setCreate_time(sdf.parse(request.getCreate_time()));
				asnInInfos.add(info);

				DistributionOrderItem asnItem = itemService.getByHeadIdAndLineCode(order.getDistribution_order_id(),
						request.getMaterialPlan_line());
				asnItem.setReceipts_counts(BigDecimal.valueOf(Double.parseDouble(request.getAct_charger_num())));
				asnItem.setQualified_number(BigDecimal.valueOf(Double.parseDouble(request.getQualified_number())));
				asnItem.setIllqualified_number(
						BigDecimal.valueOf(Double.parseDouble(request.getIllqualified_number())));
				itemService.update(asnItem);

				if (materialPlanRise != null) {
					MaterialPlanItem materialPlanItem = materialPlanItemService
							.getByHeaderIdAndLineCode(materialPlanRise.getId(), request.getMaterialPlan_line());
					materialPlanItemService.updateCountByLineId(materialPlanItem.getId(), asnItem.getCollection_count(),
							BigDecimal.valueOf(Double.parseDouble(request.getAct_charger_num())),
							BigDecimal.valueOf(Double.parseDouble(request.getQualified_number())),
							BigDecimal.valueOf(Double.parseDouble(request.getIllqualified_number())));
					List<MaterialPlanItem> items = materialPlanItemService.getByHeadId(materialPlanRise.getId());
					int i = 0;
					for (MaterialPlanItem item1 : items) {
						if (item1.getDistribution_status() == 0) {
							i++;
						}
					}
					if (i == 0) {
						materialPlanRise.setDistribution_status(1);
						materialPlanRiseService.update(materialPlanRise);
					}else {
						if (materialPlanRise.getDistribution_status() != 0) {
							materialPlanRise.setDistribution_status(0);
							materialPlanRiseService.update(materialPlanRise);
						}
					}
				} else if (poInfoPlanRise2 != null) {
					PoInfoPlanLineItem2 infoPlanLineItem2 = poInfoPlanLineItem2Service
							.getByHeaderIdAndLineCode(poInfoPlanRise2.getId(), request.getMaterialPlan_line());
					poInfoPlanLineItem2Service.updateCountByLineId(infoPlanLineItem2.getId(),
							asnItem.getCollection_count(),
							BigDecimal.valueOf(Double.parseDouble(request.getAct_charger_num())),
							BigDecimal.valueOf(Double.parseDouble(request.getQualified_number())),
							BigDecimal.valueOf(Double.parseDouble(request.getIllqualified_number())));
					List<PoInfoPlanLineItem2> item2s = poInfoPlanLineItem2Service.getByHeadId(poInfoPlanRise2.getId());
					int i = 0;
					for (PoInfoPlanLineItem2 item2 : item2s) {
						if (item2.getDistributionStatus() == 0) {
							i++;
						}
					}
					if (i == 0) {
						poInfoPlanRise2.setDistribution_head_status(1);
						poInfoPlanRise2Service.update(poInfoPlanRise2);
					}else {
						if (poInfoPlanRise2.getDistribution_head_status() != 0) {
							poInfoPlanRise2.setDistribution_head_status(0);
							poInfoPlanRise2Service.update(poInfoPlanRise2);
						}
					}
				} else if (poRise != null) {
					PoLineItem lineItem = poLineItemService.getByHeaderIdAndLineCode(poRise.getId(),
							request.getMaterialPlan_line());
					poLineItemService.updateCountByLineId(lineItem.getId(), asnItem.getCollection_count(),
							BigDecimal.valueOf(Double.parseDouble(request.getAct_charger_num())),
							BigDecimal.valueOf(Double.parseDouble(request.getQualified_number())),
							BigDecimal.valueOf(Double.parseDouble(request.getIllqualified_number())));
					List<PoLineItem> items = poLineItemService.getByHeadId(poRise.getId());
					int i = 0;
					for (PoLineItem item3 : items) {
						if (item3.getDistribution_status() == 0) {
							i++;
						}
					}
					if (i == 0) {
						poRise.setDistribution_head_status(1);
						poRiseService.update(poRise);
					}else {
						if (poRise.getDistribution_head_status() != 0) {
							poRise.setDistribution_head_status(0);
							poRiseService.update(poRise);
						}
					}
				}
			}
			service.saves(asnInInfos);
			orderService.update(order);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.WMSWMSTOSRMASN, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			List<String> ids = new ArrayList<>();
			if (requests != null && !requests.isEmpty()) {
				ids.add(requests.get(0).getAsnid());
			}
			result.setAsnids(ids);
			result.setZmessage(e.getMessage());
			result.setZtype('0');
			return result;

		}
		LOGGER.info(InterfaceStringUtils.WMSWMSTOSRMASN);
		state.setSyncEndDate(new Date());
		state.setOperationState("asnid:" + requests.get(0).getAsnid() + "成功");
		stateService.save(state);
		List<String> ids = new ArrayList<>();
		ids.add(requests.get(0).getAsnid());
		result.setAsnids(ids);
		result.setZmessage("成功");
		result.setZtype('1');
		return result;
	}
}
