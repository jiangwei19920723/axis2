package cn.jcloud.srm.service.impl.sap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.PoInfoPlanRise2Dao;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise2;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.PoInfoPlanRise2Service;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午2:00:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class PoInfoPlanRise2ServiceImpl extends AbstractbaseService<PoInfoPlanRise2, BaseDao<PoInfoPlanRise2>> implements PoInfoPlanRise2Service {
	@Override
	public PoInfoPlanRise2 getByDocNumber(String docNumber) {
		return ((PoInfoPlanRise2Dao) dao).findByDocNumber(docNumber);
	}

	@Override
	public PoInfoPlanRise2 getBySrmKey(String srmKey) {
		return ((PoInfoPlanRise2Dao) dao).findBySrmKey(srmKey);
	}

	@Override
	public long getCountByPlanNum(String planNum) {
		return ((PoInfoPlanRise2Dao) dao).countByPlanNum(planNum);
	}

	@Override
	public PoInfoPlanRise2 getByPlanId(int id) {
		return ((PoInfoPlanRise2Dao) dao).findByPlanId(id);
	}

	@Override
	@Transactional(readOnly=false)
	public int deleteById(int id) {
		return ((PoInfoPlanRise2Dao) dao).deleteById(id);
	}

	@Override
	public long getCountByCode(String code) {
		return ((PoInfoPlanRise2Dao) dao).countByCode(code);
	}

}
