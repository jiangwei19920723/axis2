package cn.jcloud.srm.quartz;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.ArrayOfDeliveryOrderItem;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.ArrayOfDeliveryOrderStruct;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.DeliveryOrderItem;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.DeliveryOrderStruct;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.ReturnDeliveryOrderResult;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.WebServiceUtils;
import cn.jcloud.srm.entity.srm.DistributionOrder;
import cn.jcloud.srm.entity.srm.DistributionOrderItem;
import cn.jcloud.srm.service.srm.DistributionOrderItemService;
import cn.jcloud.srm.service.srm.DistributionOrderService;

/**
 * @author 蒋维
 * @date 创建时间：2017年11月9日 下午2:44:07
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class SendMESDeliverynote {
	private static final Logger LOGGER = LoggerFactory.getLogger(SendMESDeliverynote.class);
	@Autowired
	private DistributionOrderService orderService;
	@Autowired
	private DistributionOrderItemService itemService;

	public void run() {
		List<DistributionOrder> beans = orderService.getBySendStatus(0);
		if (beans.size() == 0) {
			return;
		}
		GetDeliveryOrderDataResponse result = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		try {
			ArrayOfDeliveryOrderStruct item = new ArrayOfDeliveryOrderStruct();
			// 添加状态为1的
			for (DistributionOrder bean : beans) {
				DeliveryOrderStruct struct = new DeliveryOrderStruct();
				struct.setMaterialPlan_code(bean.getOriginal_plan_number());
				struct.setNeed_time(sdf.format(bean.getSend_date()));// yyyy-MM-dd
																		// hh:mm
				struct.setAsnid(bean.getDistribution_code());
				struct.setStorage_location(bean.getStorage_location());
				struct.setSupplyer_code(bean.getOm_code());
				struct.setSupplyer_name(bean.getOm_name());
				List<DistributionOrderItem> list = itemService.getByHeadId(bean.getDistribution_order_id());
				struct.setWh_code(bean.getDelivery_location_code());
				struct.setWh_name(bean.getDelivery_location());
				struct.setStocker_code(bean.getManager());
				struct.setWorkshop_code(bean.getWorkspace_code());
				struct.setWorkshop_name(bean.getWorkspace());
				struct.setStation_code(bean.getWorkstation_code());
				struct.setStation_name(bean.getWorkstation());
				struct.setFREEUSE1(bean.getDocument_type());
				struct.setFREEUSE2("0");
				struct.setFREEUSE3(bean.getPrint_status() + "");
				ArrayOfDeliveryOrderItem item1 = new ArrayOfDeliveryOrderItem();
				for (DistributionOrderItem itemBean : list) {
					DeliveryOrderItem orderItem = new DeliveryOrderItem();
					orderItem.setMaterialPlan_line(itemBean.getPurchase_plan_itemnumber());
					orderItem.setMater_code(itemBean.getMateriel_number());
					orderItem.setMater_name(itemBean.getMateriel_describe());
					orderItem.setUnit(itemBean.getMeasurement_unit());
					orderItem.setNeed_count(itemBean.getDelivery_number().toString());
					orderItem.setOrder_this(itemBean.getCollection_count().toString());
					orderItem.setVin(itemBean.getVin());
					orderItem.setCar_type(itemBean.getCar_type());
					item1.addDeliveryOrderItem(orderItem);
				}
				struct.setItemList(item1);
				item.addDeliveryOrderStruct(struct);
				LOGGER.info(InterfaceStringUtils.MESDELIVERYNOTE + ",asnid:" + struct.getAsnid() + ",json:"
						+ JSON.toJSONString(struct));
			}
			List<DistributionOrder> beans2 = orderService.getBySendStatus(2);
			if (beans2.size() > 0) {
				// 添加状态为2的
				for (DistributionOrder bean : beans2) {
					DeliveryOrderStruct struct = new DeliveryOrderStruct();
					struct.setMaterialPlan_code(bean.getOriginal_plan_number());
					struct.setNeed_time(sdf.format(bean.getSend_date()));// yyyy-MM-dd
																			// hh:mm
					struct.setAsnid(bean.getDistribution_code());
					struct.setStorage_location(bean.getStorage_location());
					struct.setSupplyer_code(bean.getOm_code());
					struct.setSupplyer_name(bean.getOm_name());
					List<DistributionOrderItem> list = itemService.getByHeadId(bean.getDistribution_order_id());
					struct.setWh_code(bean.getDelivery_location_code());
					struct.setWh_name(bean.getDelivery_location());
					struct.setStocker_code(bean.getManager());
					struct.setWorkshop_code(bean.getWorkspace_code());
					struct.setWorkshop_name(bean.getWorkspace());
					struct.setStation_code(bean.getWorkstation_code());
					struct.setStation_name(bean.getWorkstation());
					struct.setFREEUSE1(bean.getDocument_type());
					struct.setFREEUSE2("1");
					struct.setFREEUSE3(bean.getPrint_status() + "");
					ArrayOfDeliveryOrderItem item1 = new ArrayOfDeliveryOrderItem();
					for (DistributionOrderItem itemBean : list) {
						DeliveryOrderItem orderItem = new DeliveryOrderItem();
						orderItem.setMaterialPlan_line(itemBean.getPurchase_plan_itemnumber());
						orderItem.setMater_code(itemBean.getMateriel_number());
						orderItem.setMater_name(itemBean.getMateriel_describe());
						orderItem.setUnit(itemBean.getMeasurement_unit());
						orderItem.setNeed_count(itemBean.getDelivery_number().toString());
						orderItem.setOrder_this(itemBean.getCollection_count().toString());
						orderItem.setVin(itemBean.getVin());
						orderItem.setCar_type(itemBean.getCar_type());
						item1.addDeliveryOrderItem(orderItem);
					}
					struct.setItemList(item1);
					item.addDeliveryOrderStruct(struct);
					LOGGER.info(InterfaceStringUtils.MESDELIVERYNOTE + ",asnid:" + struct.getAsnid() + ",json:"
							+ JSON.toJSONString(struct));
				}
			}
			result = WebServiceUtils.toDeliverynote(item);
			for (ReturnDeliveryOrderResult reslut1 : result.getGetDeliveryOrderDataResult()
					.getReDeliveryOrderResultList().getReturnDeliveryOrderResult()) {
				if (reslut1.getZTYPE().intValue() == 1) {
					for (DistributionOrder bean : beans) {
						if (bean.getDistribution_code().equals(reslut1.getAsnid())) {
							bean.setSend_status(1);
							orderService.update(bean);
						}
					}
					for (DistributionOrder bean : beans2) {
						if (bean.getDistribution_code().equals(reslut1.getAsnid())) {
							bean.setSend_status(1);
							orderService.update(bean);
						}
					}
				} else {
					for (DistributionOrder bean : beans) {
						if (bean.getDistribution_code().equals(reslut1.getAsnid())) {
							bean.setSend_status(9);
							orderService.update(bean);
							LOGGER.info(InterfaceStringUtils.MESDELIVERYNOTE + ",asnid:" + reslut1.getAsnid() + "msg:"
									+ reslut1.getZMESSAGE());
						}
					}
					for (DistributionOrder bean : beans2) {
						if (bean.getDistribution_code().equals(reslut1.getAsnid())) {
							bean.setSend_status(9);
							orderService.update(bean);
							LOGGER.info(InterfaceStringUtils.MESDELIVERYNOTE + ",asnid:" + reslut1.getAsnid() + "msg:"
									+ reslut1.getZMESSAGE());
						}
					}
				}
			}
			LOGGER.info(InterfaceStringUtils.MESDELIVERYNOTE);
		} catch (RemoteException e) {
			LOGGER.error(InterfaceStringUtils.MESDELIVERYNOTE, e);
		}
	}
}
