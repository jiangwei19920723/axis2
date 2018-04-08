package cn.jcloud.srm.dao.srm;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.srm.DistributionOrderItem;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月9日 下午2:35:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface DistributionOrderItemDao extends BaseDao<DistributionOrderItem> {
	public List<DistributionOrderItem> findByHeadId(long distribution_order_id);
	
	public DistributionOrderItem findByHeadIdAndLineCode(long distributionOrderId, String lineCode);
}
