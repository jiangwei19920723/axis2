package cn.jcloud.srm.dao.impl.sap;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.PoInfoPlanRiseDao;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午1:58:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoInfoPlanRiseDaoImpl extends AbstractBaseDao<PoInfoPlanRise> implements PoInfoPlanRiseDao {

	@Override
	public PoInfoPlanRise findByDocNumber(String docNumber) {
		Query query = getSession().createQuery("from PoInfoPlanRise where docNumber =:docNumber");
		query.setParameter("docNumber", docNumber);
		return (PoInfoPlanRise) query.uniqueResult();
	}

	@Override
	protected Class<PoInfoPlanRise> getEntityClass() {
		return PoInfoPlanRise.class;
	}
	
	@Override
	public PoInfoPlanRise findById(int id) {
		Query query = getSession().createQuery("from PoInfoPlanRise where id =:id");
		query.setParameter("id", id);
		return (PoInfoPlanRise) query.uniqueResult();
	}

	@Override
	public PoInfoPlanRise findByCode(String code) {
		Query query = getSession().createQuery("from PoInfoPlanRise where purchasePlanNumber =:code");
		query.setParameter("code", code);
		return (PoInfoPlanRise) query.uniqueResult();
	}

	@Override
	public int deleteById(int id) {
		Query query = getSession().createQuery("delete from PoInfoPlanRise where id =:id");
		query.setParameter("id", id);
		return query.executeUpdate();
	}

}
