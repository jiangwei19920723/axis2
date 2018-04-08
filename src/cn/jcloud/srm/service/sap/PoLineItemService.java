package cn.jcloud.srm.service.sap;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.entity.sap.PoLineItem;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月26日 下午3:56:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoLineItemService extends BaseService<PoLineItem>{
	public List<PoLineItem> getByHeadId(int headId);
	public List<PoLineItem> getByHeadIdAndDeleteState(int headId,int deleteState);
	public PoLineItem getByHeaderIdAndLineCode(int headId, String lineCode);
	
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount);
	public List<PoLineItem> getByHeadLine(String headLine);
	
	public List<PoLineItem> getByHeadLineAndDeleteState(String headLine, int deleteState);
}
