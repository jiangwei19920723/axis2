package cn.jcloud.srm.dao.impl.sap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.PoRiseDao;
import cn.jcloud.srm.entity.sap.PoRise;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月26日 下午3:47:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoRiseDaoImpl extends AbstractBaseDao<PoRise> implements PoRiseDao {

	@Override
	public List<PoRise> findByCode(String code) {
		Query query = getSession().createQuery("from PoRise where purchase_plan_number=:code");
		query.setParameter("code", code);
		return query.list();
	}

	@Override
	protected Class<PoRise> getEntityClass() {
		return PoRise.class;
	}

	@Override
	public PoRise findBySrmKey(String srmKey) {
		Query query = getSession().createQuery("from PoRise where srmkey =:srmkey");
		query.setParameter("srmkey", srmKey);
		return (PoRise) query.uniqueResult();
	}

	@Override
	public long countByCode(String code) {
		Query query = getSession().createQuery("select count(1) from PoRise where om_code =:code and create_time>:time");
		query.setParameter("code", code);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
			String date = sdf.format(new Date());
			sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			query.setParameter("time", sdf.parse(date+"0101000000"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return (long) query.uniqueResult();
	}

	@Override
	public PoRise findByPlanId(int id) {
		Query query = getSession().createQuery("from PoRise where id =:id");
		query.setParameter("id", id);
		return (PoRise) query.uniqueResult();
	}

}
