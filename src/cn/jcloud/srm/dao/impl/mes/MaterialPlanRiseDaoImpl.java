package cn.jcloud.srm.dao.impl.mes;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.mes.MaterialPlanRiseDao;
import cn.jcloud.srm.entity.mes.MaterialPlanRise;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:35:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class MaterialPlanRiseDaoImpl extends AbstractBaseDao<MaterialPlanRise> implements MaterialPlanRiseDao {

	@Override
	protected Class<MaterialPlanRise> getEntityClass() {
		return MaterialPlanRise.class;
	}

	@Override
	public MaterialPlanRise findByCode(String code) {
		Query query = getSession().createQuery("from MaterialPlanRise where material_plan_code =:code");
		query.setParameter("code", code);
		return (MaterialPlanRise) query.uniqueResult();
	}

	@Override
	public MaterialPlanRise findByPlanId(int id) {
		Query query = getSession().createQuery("from MaterialPlanRise where id =:id");
		query.setParameter("id", id);
		return (MaterialPlanRise) query.uniqueResult();
	}

}
