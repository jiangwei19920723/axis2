package cn.jcloud.srm.service.srm;

import java.util.List;

import cn.jcloud.srm.entity.srm.DistributionOrder;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月9日 下午2:30:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface DistributionOrderService extends BaseService<DistributionOrder> {
	public List<DistributionOrder> getBySendStatus(int send_status);
	public DistributionOrder getByDistributionCode(String distribution_code);
	public void updates(List<DistributionOrder> orders);
	public DistributionOrder getByInfoPlanRiseIdAndDistributionTypeAndPrintStatus(Long info_plan_rise_id,Integer distribution_type,Integer print_status);

}
