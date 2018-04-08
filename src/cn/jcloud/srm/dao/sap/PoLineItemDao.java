package cn.jcloud.srm.dao.sap;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.PoLineItem;

/**
 * @author 蒋维
 * @date 创建时间：2017年12月26日 下午3:52:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public interface PoLineItemDao extends BaseDao<PoLineItem> {
	public List<PoLineItem> findByHeadId(int headId);

	public PoLineItem findByHeaderIdAndLineCode(int headId, String lineCode);

	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount,
			BigDecimal illquaCount);
	public List<PoLineItem> findByHeadLine(String headLine);

	public List<PoLineItem> findByHeadIdAndDeleteState(int headId, int deleteState);
	
	public List<PoLineItem> findByHeadLineAndDeleteState(String headLine, int deleteState);
}
