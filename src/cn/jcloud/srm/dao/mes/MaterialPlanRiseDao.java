package cn.jcloud.srm.dao.mes;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.mes.MaterialPlanRise;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:34:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface MaterialPlanRiseDao extends BaseDao<MaterialPlanRise> {
	public MaterialPlanRise findByCode(String code);
	public MaterialPlanRise findByPlanId(int id);
}
