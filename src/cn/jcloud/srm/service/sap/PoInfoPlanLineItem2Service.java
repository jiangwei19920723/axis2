package cn.jcloud.srm.service.sap;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem2;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����5:15:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoInfoPlanLineItem2Service extends BaseService<PoInfoPlanLineItem2> {
	public List<PoInfoPlanLineItem2> getByOmCode(String code);
	public List<PoInfoPlanLineItem2> getByHeadId(int headId);
	public List<PoInfoPlanLineItem2> getByCode(String code);
	
	public PoInfoPlanLineItem2 getByHeaderIdAndLineCode(int headId, String lineCode);
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount);
}
