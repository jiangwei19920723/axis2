package cn.jcloud.srm.dao.impl.srm;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.DistributionOrderDao;
import cn.jcloud.srm.entity.srm.DistributionOrder;

/**
 * @author 蒋维
 * @date 创建时间：2017年11月9日 下午2:26:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Repository
public class DistributionOrderDaoImpl extends AbstractBaseDao<DistributionOrder> implements DistributionOrderDao {

	@Override
	public List<DistributionOrder> findBySendStatus(int send_status) {
		Query query = getSession().createQuery("from DistributionOrder where send_status=:send_status");
		query.setParameter("send_status", send_status);
		return query.list();
	}

	@Override
	protected Class<DistributionOrder> getEntityClass() {
		return DistributionOrder.class;
	}

	@Override
	public DistributionOrder findById(int id) {
		Query query = getSession().createQuery("from DistributionOrder where distribution_order_id=:id");
		query.setParameter("id", id);
		return (DistributionOrder) query.uniqueResult();
	}

	@Override
	public DistributionOrder findByDistributionCode(String distribution_code) {
		Query query = getSession().createQuery("from DistributionOrder where distribution_code=:distribution_code");
		query.setParameter("distribution_code", distribution_code);
		return (DistributionOrder) query.uniqueResult();
	}

	@Override
	public void updates(List<DistributionOrder> orders) {
		for (DistributionOrder distributionOrder : orders) {
			update(distributionOrder);
		}
	}

	@Override
	public DistributionOrder findByInfoPlanRiseIdAndDistributionTypeAndPrintStatus(Long info_plan_rise_id,
			Integer distribution_type, Integer print_status) {
		Query query = getSession().createQuery(
				"from DistributionOrder where info_plan_rise_id=:info_plan_rise_id and distribution_type=:distribution_type and print_status=:print_status");
		query.setParameter("info_plan_rise_id", info_plan_rise_id);
		query.setParameter("distribution_type", distribution_type);
		query.setParameter("print_status", print_status);
		return (DistributionOrder) query.uniqueResult();
	}

}
