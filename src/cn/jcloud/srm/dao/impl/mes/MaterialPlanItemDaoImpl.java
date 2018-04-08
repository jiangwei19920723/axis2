package cn.jcloud.srm.dao.impl.mes;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.mes.MaterialPlanItemDao;
import cn.jcloud.srm.entity.mes.MaterialPlanItem;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:35:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class MaterialPlanItemDaoImpl extends AbstractBaseDao<MaterialPlanItem> implements MaterialPlanItemDao {

	@Override
	protected Class<MaterialPlanItem> getEntityClass() {
		return MaterialPlanItem.class;
	}

	@Override
	public List<MaterialPlanItem> findByHeadId(int head_id) {
		Query query = getSession().createQuery("from MaterialPlanItem where head_id=:head_id");
		query.setParameter("head_id", head_id);
		return query.list();
	}

	@Override
	public List<MaterialPlanItem> findByCode(String code) {
		Query query = getSession().createQuery("from MaterialPlanItem where material_plan_line=:code");
		query.setParameter("code", code);
		return query.list();
	}

	@Override
	public MaterialPlanItem findByHeaderIdAndLineCode(int headerId, String lineCode) {
		Query query = getSession().createQuery("from MaterialPlanItem where head_id=:head_id and material_plan_line=:code");
		query.setParameter("head_id", headerId);
		query.setParameter("code", lineCode);
		return (MaterialPlanItem) query.uniqueResult();
	}

	@Override
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount) {
		Query queryObjec = getSession().createQuery("update MaterialPlanItem set receipts_counts=receipts_counts+:receipts_counts, qualified_number=qualified_number+:qualified_number, illqualified_number=illqualified_number+:illqualified_number, passage_number=passage_number-:passage_number, least_counts=least_counts+:least_counts where id=:id");
		queryObjec.setParameter("receipts_counts", recCount);
		queryObjec.setParameter("qualified_number", quaCount);
		queryObjec.setParameter("illqualified_number", illquaCount);
		queryObjec.setParameter("passage_number", collection_count);
		queryObjec.setParameter("least_counts", BigDecimal.valueOf(collection_count.doubleValue()-quaCount.doubleValue()));
		queryObjec.setParameter("id", lineId);
		return queryObjec.executeUpdate();
	}

	@Override
	public int updateCancelStatusByLineId(int lineId, int cancel_status) {
		Query queryObjec = getSession().createQuery("update MaterialPlanItem set cancel_status=:cancel_status where id=:id");
		queryObjec.setParameter("cancel_status", cancel_status);
		queryObjec.setParameter("id", lineId);
		return queryObjec.executeUpdate();
	}

}
