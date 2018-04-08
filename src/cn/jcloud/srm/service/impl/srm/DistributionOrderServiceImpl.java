package cn.jcloud.srm.service.impl.srm;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.srm.DistributionOrderDao;
import cn.jcloud.srm.entity.srm.DistributionOrder;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.srm.DistributionOrderService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月9日 下午2:32:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class DistributionOrderServiceImpl extends AbstractbaseService<DistributionOrder, BaseDao<DistributionOrder>> implements DistributionOrderService {

	@Override
	public List<DistributionOrder> getBySendStatus(int send_status) {
		return ((DistributionOrderDao)dao).findBySendStatus(send_status);
	}

	@Override
	public DistributionOrder getByDistributionCode(String distribution_code) {
		return ((DistributionOrderDao)dao).findByDistributionCode(distribution_code);
	}

	@Override
	public void updates(List<DistributionOrder> orders) {
		((DistributionOrderDao)dao).updates(orders);
	}

	@Override
	public DistributionOrder getByInfoPlanRiseIdAndDistributionTypeAndPrintStatus(Long info_plan_rise_id,
			Integer distribution_type, Integer print_status) {
		return ((DistributionOrderDao)dao).findByInfoPlanRiseIdAndDistributionTypeAndPrintStatus(info_plan_rise_id, distribution_type, print_status);
	}

}
