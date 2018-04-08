package cn.jcloud.srm.service.mes;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.entity.mes.MaterialPlanItem;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:37:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface MaterialPlanItemService extends BaseService<MaterialPlanItem> {
	public List<MaterialPlanItem> getByHeadId(int head_id);
	public List<MaterialPlanItem> getByCode(String code);
	public MaterialPlanItem getByHeaderIdAndLineCode(int headerId, String lineCode);
	
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount);
	public int updateCancelStatusByLineId(int lineId,int cancel_status);
}
