package cn.jcloud.srm.dao.sap;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午1:57:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoInfoPlanRiseDao extends BaseDao<PoInfoPlanRise> {
	public PoInfoPlanRise findByDocNumber(String docNumber);
	public PoInfoPlanRise findByCode(String code);
	public int deleteById(int id);
}
