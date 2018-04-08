package cn.jcloud.srm.dao.sap;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem2;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����4:55:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoInfoPlanLineItem2Dao extends BaseDao<PoInfoPlanLineItem2> {
	public List<PoInfoPlanLineItem2> findByOmCode(String code);
	public List<PoInfoPlanLineItem2> findByCode(String code);
	public List<PoInfoPlanLineItem2> findByHeadId(int headId);
	public PoInfoPlanLineItem2 findByHeaderIdAndLineCode(int headId, String lineCode);
	
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount);
}
