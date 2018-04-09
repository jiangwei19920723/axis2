package cn.jcloud.srm.service.impl.cs.sap;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jcloud.srm.beans.cs.mes.WMStoSRM_3PLRequest;
import cn.jcloud.srm.beans.cs.mes.WMStoSRM_3PLRequestItem;
import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.VendorInfoDao;
import cn.jcloud.srm.dao.sap.MtlItemsDao;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.cs.sap.PoInventoryOrder;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.cs.sap.PoInventoryOrderService;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 上午11:59:02
* @version 1.0
*/
@Service
public class PoInventoryOrderServiceImpl extends AbstractbaseService<PoInventoryOrder, BaseDao<PoInventoryOrder>> implements PoInventoryOrderService {
	@Autowired
	private VendorInfoDao vendorInfoDao;
	@Autowired
	private MtlItemsDao mtlItemsDao;
	@Override
	public void saveByWebService(WMStoSRM_3PLRequest request) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		Date sendTime = null;
		try {
			sendTime = sdf.parse(request.getSend_date()+request.getSend_time());
		} catch (ParseException e) {
		}
		for (WMStoSRM_3PLRequestItem item : request.getList()) {
			PoInventoryOrder order = new PoInventoryOrder();
			order.setCompany_id(0l);//根据采购组织表获取
			order.setPurchase_org_id(Long.parseLong(request.getPro_org()));
			order.setPurchase_group_id(Long.parseLong(item.getPro_group()));
			VendorInfo vendorInfo = vendorInfoDao.fingByCode(item.getVendor_code());
			order.setVendor_id(vendorInfo.getVendorId().longValue());
			order.setVendor_code(item.getVendor_code());
			order.setVendor_name(vendorInfo.getVendorName());
			MtlItems mtlItems = mtlItemsDao.findByCode(item.getItems_code());
			order.setItems_id((long)mtlItems.getItemId());
			order.setItems_code(mtlItems.getItemCode());
			order.setItems_name(mtlItems.getDescriptions());
			order.setPlan_code(request.getItems_plan_code());
			order.setSap_send_time(sendTime);
			order.setPlan_line_code(item.getItems_plan_line());
			try {
				order.setNeed_date(sdf.parse(request.getNeed_time()));
			} catch (ParseException e) {
			}
			order.setNeed_count(BigDecimal.valueOf(Double.parseDouble(item.getNeed_count())));
			order.setItems_unit(item.getUnit());
			order.setReceive_depot_code(item.getWh_code());
			order.setReceive_depot(item.getWh_name());
			order.setWorkshop_code(item.getWorkshop_code());
			order.setWorkshop_name(item.getWorkshop_name());
			order.setStation_code(item.getStation_code());
			order.setStation_name(item.getStation_name());
			order.setCar_type(item.getCar_type());
			order.setVin(item.getVin());
			save(order);
		}
	}

}
