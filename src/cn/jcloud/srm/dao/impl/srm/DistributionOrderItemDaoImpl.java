package cn.jcloud.srm.dao.impl.srm;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.DistributionOrderItemDao;
import cn.jcloud.srm.entity.srm.DistributionOrderItem;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月9日 下午2:36:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class DistributionOrderItemDaoImpl extends AbstractBaseDao<DistributionOrderItem> implements DistributionOrderItemDao {

	@Override
	public List<DistributionOrderItem> findByHeadId(long distribution_order_id) {
		Query query = getSession().createQuery("from DistributionOrderItem where distribution_order_id=:distribution_order_id");
		query.setParameter("distribution_order_id", distribution_order_id);
		return query.list();
	}

	@Override
	protected Class<DistributionOrderItem> getEntityClass() {
		return DistributionOrderItem.class;
	}
	@Override
	public DistributionOrderItem findById(int id) {
		Query query = getSession().createQuery("from DistributionOrderItem where order_item_id=:order_item_id");
		query.setParameter("distribution_order_id", id);
		return (DistributionOrderItem) query.uniqueResult();
	}

	@Override
	public DistributionOrderItem findByHeadIdAndLineCode(long distributionOrderId, String lineCode) {
		Query query = getSession().createQuery("from DistributionOrderItem where distribution_order_id=:distribution_order_id and purchase_plan_itemnumber=:purchase_plan_itemnumber");
		query.setParameter("distribution_order_id", distributionOrderId);
		query.setParameter("purchase_plan_itemnumber", lineCode);
		return (DistributionOrderItem) query.uniqueResult();
	}

}
