package cn.jcloud.srm.service.impl.srm;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.srm.DistributionOrderItemDao;
import cn.jcloud.srm.entity.srm.DistributionOrderItem;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.srm.DistributionOrderItemService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月9日 下午2:41:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class DistributionOrderItemServiceImpl extends AbstractbaseService<DistributionOrderItem, BaseDao<DistributionOrderItem>> implements DistributionOrderItemService {

	@Override
	public List<DistributionOrderItem> getByHeadId(long distribution_order_id) {
		return ((DistributionOrderItemDao)dao).findByHeadId(distribution_order_id);
	}

	@Override
	public DistributionOrderItem getByHeadIdAndLineCode(long distributionOrderId, String lineCode) {
		return ((DistributionOrderItemDao)dao).findByHeadIdAndLineCode(distributionOrderId, lineCode);
	}

}
