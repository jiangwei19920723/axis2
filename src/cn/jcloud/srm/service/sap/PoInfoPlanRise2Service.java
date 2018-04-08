package cn.jcloud.srm.service.sap;

import cn.jcloud.srm.entity.sap.PoInfoPlanRise2;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午1:59:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoInfoPlanRise2Service extends BaseService<PoInfoPlanRise2> {
	public PoInfoPlanRise2 getByDocNumber(String docNumber);
	
	public PoInfoPlanRise2 getBySrmKey(String srmKey);
	
	public long getCountByPlanNum(String planNum);
	
	public long getCountByCode(String code);
	
	public PoInfoPlanRise2 getByPlanId(int id);
	
	public int deleteById(int id);
}
