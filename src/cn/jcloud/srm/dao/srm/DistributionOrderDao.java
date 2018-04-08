package cn.jcloud.srm.dao.srm;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.srm.DistributionOrder;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月9日 下午2:25:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface DistributionOrderDao extends BaseDao<DistributionOrder> {
	public List<DistributionOrder> findBySendStatus(int send_status);
	public DistributionOrder findByDistributionCode(String distribution_code);
	public void updates(List<DistributionOrder> orders);
	public DistributionOrder findByInfoPlanRiseIdAndDistributionTypeAndPrintStatus(Long info_plan_rise_id,Integer distribution_type,Integer print_status);
}
