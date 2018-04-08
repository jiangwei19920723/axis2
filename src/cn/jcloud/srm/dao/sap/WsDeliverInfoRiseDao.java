package cn.jcloud.srm.dao.sap;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.WsDeliverInfoRise;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午2:24:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface WsDeliverInfoRiseDao extends BaseDao<WsDeliverInfoRise> {
	public WsDeliverInfoRise findByDocNumber(String docNumber);
}
