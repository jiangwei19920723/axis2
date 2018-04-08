package cn.jcloud.srm.dao.sap;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.PoRise;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月26日 下午3:46:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoRiseDao extends BaseDao<PoRise> {
	public List<PoRise> findByCode(String code);
	public PoRise findBySrmKey(String srmKey);
	public long countByCode(String code);
	public PoRise findByPlanId(int id);
}
