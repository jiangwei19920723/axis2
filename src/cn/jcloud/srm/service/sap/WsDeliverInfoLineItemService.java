package cn.jcloud.srm.service.sap;

import java.util.List;

import cn.jcloud.srm.entity.sap.WsDeliverInfoLineItem;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月7日 下午8:22:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface WsDeliverInfoLineItemService extends BaseService<WsDeliverInfoLineItem> {
	public List<WsDeliverInfoLineItem> getByOmCode(String code);
}
