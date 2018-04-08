package cn.jcloud.srm.dao.sap;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise2;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午1:57:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoInfoPlanRise2Dao extends BaseDao<PoInfoPlanRise2> {
	public PoInfoPlanRise2 findByDocNumber(String docNumber);
	
	public PoInfoPlanRise2 findBySrmKey(String srmKey);
	
	public long countByPlanNum(String planNum);
	
	public long countByCode(String code);
	
	public PoInfoPlanRise2 findByPlanId(int id);
	
	public int deleteById(int id);
}
