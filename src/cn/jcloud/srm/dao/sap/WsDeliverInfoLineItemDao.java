package cn.jcloud.srm.dao.sap;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.WsDeliverInfoLineItem;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月7日 下午8:14:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface WsDeliverInfoLineItemDao extends BaseDao<WsDeliverInfoLineItem> {
	public List<WsDeliverInfoLineItem> findByOmCode(String code);
}
