package cn.jcloud.srm.dao.impl.sap;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.PoLineItemDao;
import cn.jcloud.srm.entity.sap.PoLineItem;

/**
 * @author 蒋维
 * @date 创建时间：2017年12月26日 下午3:54:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Repository
public class PoLineItemDaoImpl extends AbstractBaseDao<PoLineItem> implements PoLineItemDao {

	@Override
	public List<PoLineItem> findByHeadId(int headId) {
		Query query = getSession().createQuery("from PoLineItem where head_id=:headId");
		query.setParameter("headId", headId);
		return query.list();
	}

	@Override
	protected Class<PoLineItem> getEntityClass() {
		return PoLineItem.class;
	}

	@Override
	public PoLineItem findByHeaderIdAndLineCode(int headId, String lineCode) {
		Query query = getSession()
				.createQuery("from PoLineItem where head_id =:headId and purchase_plan_project_number =:code");
		query.setParameter("headId", headId);
		query.setParameter("code", lineCode);

		return (PoLineItem) query.uniqueResult();
	}

	@Override
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount,
			BigDecimal illquaCount) {
		Query queryObjec = getSession().createQuery(
				"update PoLineItem set receipts_counts=receipts_counts+:receipts_counts, qualified_number=qualified_number+:qualified_number, illqualified_number=illqualified_number+:illqualified_number, passage_number=passage_number-:passage_number, least_counts=least_counts+:least_counts where id=:id");
		queryObjec.setParameter("receipts_counts", recCount);
		queryObjec.setParameter("qualified_number", quaCount);
		queryObjec.setParameter("illqualified_number", illquaCount);
		queryObjec.setParameter("passage_number", collection_count);
		queryObjec.setParameter("least_counts",
				BigDecimal.valueOf(collection_count.doubleValue() - quaCount.doubleValue()));
		queryObjec.setParameter("id", lineId);
		return queryObjec.executeUpdate();
	}

	@Override
	public List<PoLineItem> findByHeadLine(String headLine) {
		Query query = getSession().createQuery("from PoLineItem where head_line=:head_line");
		query.setParameter("head_line", headLine);
		return query.list();
	}

	@Override
	public List<PoLineItem> findByHeadIdAndDeleteState(int headId, int deleteState) {
		Query query = getSession().createQuery("from PoLineItem where head_id=:headId and delete_status =:delete_status");
		query.setParameter("headId", headId);
		query.setParameter("delete_status", deleteState);
		return query.list();
	}

	@Override
	public List<PoLineItem> findByHeadLineAndDeleteState(String headLine, int deleteState) {
		Query query = getSession().createQuery("from PoLineItem where head_line=:head_line and delete_status=:delete_status");
		query.setParameter("head_line", headLine);
		query.setParameter("delete_status", deleteState);
		return query.list();
	}

}
