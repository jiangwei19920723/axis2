package cn.jcloud.srm.service.cs.sap;

import cn.jcloud.srm.beans.cs.mes.WMStoSRM_3PLRequest;
import cn.jcloud.srm.entity.cs.sap.PoInventoryOrder;
import cn.jcloud.srm.service.BaseService;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 上午11:58:01
* @version 1.0
*/
public interface PoInventoryOrderService extends BaseService<PoInventoryOrder> {
	public void saveByWebService(WMStoSRM_3PLRequest request);
}
