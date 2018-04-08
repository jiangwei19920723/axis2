package cn.jcloud.srm.service.mes;

import cn.jcloud.srm.entity.mes.MaterialPlanRise;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:37:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface MaterialPlanRiseService extends BaseService<MaterialPlanRise> {
	public MaterialPlanRise getByCode(String code);
	
	public MaterialPlanRise getByPlanId(int id);
}
