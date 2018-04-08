package cn.jcloud.srm.service.sap;

import cn.jcloud.srm.entity.sap.WsDeliverInfoRise;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午2:27:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface WsDeliverInfoRiseService extends BaseService<WsDeliverInfoRise> {
	public WsDeliverInfoRise getByDocNumber(String docNumber);
}
