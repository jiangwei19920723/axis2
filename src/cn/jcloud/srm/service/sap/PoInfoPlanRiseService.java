package cn.jcloud.srm.service.sap;

import cn.jcloud.srm.entity.sap.PoInfoPlanRise;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午1:59:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoInfoPlanRiseService extends BaseService<PoInfoPlanRise> {
	public PoInfoPlanRise getByDocNumber(String docNumber);
	public PoInfoPlanRise getByCode(String code);
	public int deleteById(int id);
}
