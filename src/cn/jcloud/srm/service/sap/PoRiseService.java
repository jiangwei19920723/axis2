package cn.jcloud.srm.service.sap;

import java.util.List;

import cn.jcloud.srm.entity.sap.PoRise;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月26日 下午3:50:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoRiseService extends BaseService<PoRise> {
	public List<PoRise> getByCode(String code);
	public PoRise getBySrmKey(String srmKey);
	public long getCountByCode(String code);
	public PoRise getByPlanId(int id);
}
