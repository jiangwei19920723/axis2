package cn.jcloud.srm.dao.mes;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.mes.MaterialPlanItem;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:34:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface MaterialPlanItemDao extends BaseDao<MaterialPlanItem> {
	public List<MaterialPlanItem> findByHeadId(int head_id);
	public List<MaterialPlanItem> findByCode(String code);
	public MaterialPlanItem findByHeaderIdAndLineCode(int headerId, String lineCode);
	
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount);
	public int updateCancelStatusByLineId(int lineId,int cancel_status);
}
