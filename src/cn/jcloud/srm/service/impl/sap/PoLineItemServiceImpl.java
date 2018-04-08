package cn.jcloud.srm.service.impl.sap;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.PoLineItemDao;
import cn.jcloud.srm.entity.sap.PoLineItem;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.PoLineItemService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月26日 下午3:56:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class PoLineItemServiceImpl extends AbstractbaseService<PoLineItem, BaseDao<PoLineItem>> implements PoLineItemService {

	@Override
	public List<PoLineItem> getByHeadId(int headId) {
		return ((PoLineItemDao)dao).findByHeadId(headId);
	}

	@Override
	public PoLineItem getByHeaderIdAndLineCode(int headId, String lineCode) {
		return ((PoLineItemDao) dao).findByHeaderIdAndLineCode(headId, lineCode);
	}
	
	@Override
	@Transactional(readOnly=false)
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount) {
		return ((PoLineItemDao) dao).updateCountByLineId(lineId, collection_count, recCount, quaCount, illquaCount);
	}

	@Override
	public List<PoLineItem> getByHeadLine(String headLine) {
		return ((PoLineItemDao) dao).findByHeadLine(headLine);
	}

	@Override
	public List<PoLineItem> getByHeadIdAndDeleteState(int headId, int deleteState) {
		return ((PoLineItemDao) dao).findByHeadIdAndDeleteState(headId,deleteState);
	}

	@Override
	public List<PoLineItem> getByHeadLineAndDeleteState(String headLine, int deleteState) {
		return ((PoLineItemDao) dao).findByHeadLineAndDeleteState(headLine, deleteState);
	}
}
