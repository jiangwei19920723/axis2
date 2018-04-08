package cn.jcloud.srm.service.impl.mes;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.mes.MaterialPlanRiseDao;
import cn.jcloud.srm.entity.mes.MaterialPlanRise;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.mes.MaterialPlanRiseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:37:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class MaterialPlanRiseServiceImpl extends AbstractbaseService<MaterialPlanRise, BaseDao<MaterialPlanRise>> implements MaterialPlanRiseService {

	@Override
	public MaterialPlanRise getByCode(String code) {
		return ((MaterialPlanRiseDao)dao).findByCode(code);
	}

	@Override
	public MaterialPlanRise getByPlanId(int id) {
		return ((MaterialPlanRiseDao)dao).findByPlanId(id);
	}

}
