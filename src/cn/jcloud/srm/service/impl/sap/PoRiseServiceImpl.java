package cn.jcloud.srm.service.impl.sap;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.PoRiseDao;
import cn.jcloud.srm.entity.sap.PoRise;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.PoRiseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月26日 下午3:51:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class PoRiseServiceImpl extends AbstractbaseService<PoRise, BaseDao<PoRise>> implements PoRiseService {

	@Override
	public List<PoRise> getByCode(String code) {
		return ((PoRiseDao)dao).findByCode(code);
	}

	@Override
	public PoRise getBySrmKey(String srmKey) {
		return ((PoRiseDao)dao).findBySrmKey(srmKey);
	}

	@Override
	public long getCountByCode(String code) {
		return ((PoRiseDao)dao).countByCode(code);
	}

	@Override
	public PoRise getByPlanId(int id) {
		return ((PoRiseDao)dao).findByPlanId(id);
	}

}
