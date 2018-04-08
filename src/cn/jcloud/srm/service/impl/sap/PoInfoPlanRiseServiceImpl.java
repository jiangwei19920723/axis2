package cn.jcloud.srm.service.impl.sap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.PoInfoPlanRiseDao;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.PoInfoPlanRiseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午2:00:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class PoInfoPlanRiseServiceImpl extends AbstractbaseService<PoInfoPlanRise, BaseDao<PoInfoPlanRise>> implements PoInfoPlanRiseService {
	@Override
	public PoInfoPlanRise getByDocNumber(String docNumber) {
		return ((PoInfoPlanRiseDao) dao).findByDocNumber(docNumber);
	}

	@Override
	public PoInfoPlanRise getByCode(String code) {
		return ((PoInfoPlanRiseDao) dao).findByCode(code);
	}

	@Override
	@Transactional(readOnly=false)
	public int deleteById(int id) {
		return ((PoInfoPlanRiseDao) dao).deleteById(id);
	}

}
