package cn.jcloud.srm.dao.impl.sap;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.PoInfoPlanLineItem2Dao;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem2;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����5:06:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoInfoPlanLineItem2DaoImpl extends AbstractBaseDao<PoInfoPlanLineItem2> implements PoInfoPlanLineItem2Dao{

	@Override
	protected Class<PoInfoPlanLineItem2> getEntityClass() {
		return PoInfoPlanLineItem2.class;
	}

	@Override
	public List<PoInfoPlanLineItem2> findByOmCode(String code) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem2 where omCode =:code");
		query.setParameter("code", code);
		return query.list();
	}

	@Override
	public List<PoInfoPlanLineItem2> findByHeadId(int headId) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem2 where headId =:headId");
		query.setParameter("headId", headId);
		return query.list();
	}

	@Override
	public List<PoInfoPlanLineItem2> findByCode(String code) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem2 where purchasePlanProjectNumber =:code");
		query.setParameter("code", code);
		return query.list();
	}

	@Override
	public PoInfoPlanLineItem2 findByHeaderIdAndLineCode(int headId, String lineCode) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem2 where headId =:headId and purchasePlanProjectNumber =:code");
		query.setParameter("headId", headId);
		query.setParameter("code", lineCode);
		
		return (PoInfoPlanLineItem2)query.uniqueResult();
	}

	@Override
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount) {
		Query queryObjec = getSession().createQuery("update PoInfoPlanLineItem2 set receipts_counts=receipts_counts+:receipts_counts, qualified_number=qualified_number+:qualified_number, illqualified_number=illqualified_number+:illqualified_number, passage_number=passage_number-:passage_number, leastCounts=leastCounts+:least_counts where id=:id");
		queryObjec.setParameter("receipts_counts", recCount);
		queryObjec.setParameter("qualified_number", quaCount);
		queryObjec.setParameter("illqualified_number", illquaCount);
		queryObjec.setParameter("passage_number", collection_count);
		queryObjec.setParameter("least_counts", BigDecimal.valueOf(collection_count.doubleValue()-quaCount.doubleValue()));
		queryObjec.setParameter("id", lineId);
		return queryObjec.executeUpdate();
	}

}
