package cn.jcloud.srm.service.srm;

import java.util.List;

import cn.jcloud.srm.entity.srm.DistributionOrderItem;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月9日 下午2:39:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface DistributionOrderItemService extends BaseService<DistributionOrderItem> {
	public List<DistributionOrderItem> getByHeadId(long distribution_order_id);
	
	public DistributionOrderItem getByHeadIdAndLineCode(long distributionOrderId, String lineCode);

}
