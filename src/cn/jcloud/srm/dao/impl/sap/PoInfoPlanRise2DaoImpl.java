package cn.jcloud.srm.dao.impl.sap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.PoInfoPlanRise2Dao;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise2;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午1:58:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoInfoPlanRise2DaoImpl extends AbstractBaseDao<PoInfoPlanRise2> implements PoInfoPlanRise2Dao {

	@Override
	public PoInfoPlanRise2 findByDocNumber(String docNumber) {
		Query query = getSession().createQuery("from PoInfoPlanRise2 where docNumber =:docNumber");
		query.setParameter("docNumber", docNumber);
		return (PoInfoPlanRise2) query.uniqueResult();
	}

	@Override
	protected Class<PoInfoPlanRise2> getEntityClass() {
		return PoInfoPlanRise2.class;
	}

	@Override
	public PoInfoPlanRise2 findBySrmKey(String srmKey) {
		Query query = getSession().createQuery("from PoInfoPlanRise2 where srmkey =:srmkey");
		query.setParameter("srmkey", srmKey);
		return (PoInfoPlanRise2) query.uniqueResult();
	}

	@Override
	public long countByPlanNum(String planNum) {
		Query query = getSession().createQuery("select count(1) from PoInfoPlanRise2 where purchasePlanNumber =:planNum");
		query.setParameter("planNum", planNum);
		return (long) query.uniqueResult();
	}

	@Override
	public PoInfoPlanRise2 findByPlanId(int id) {
		Query query = getSession().createQuery("from PoInfoPlanRise2 where id =:id");
		query.setParameter("id", id);
		return (PoInfoPlanRise2) query.uniqueResult();
	}

	@Override
	public int deleteById(int id) {
		Query query = getSession().createQuery("delete from PoInfoPlanRise2 where id =:id");
		query.setParameter("id", id);
		return query.executeUpdate();
	}

	@Override
	public long countByCode(String code) {
		Query query = getSession().createQuery("select count(1) from PoInfoPlanRise2 where omCode =:code and create_time>:time");
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

}
