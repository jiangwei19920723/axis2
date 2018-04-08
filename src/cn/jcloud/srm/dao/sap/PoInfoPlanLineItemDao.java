package cn.jcloud.srm.dao.sap;

import java.util.Date;
import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����4:55:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoInfoPlanLineItemDao extends BaseDao<PoInfoPlanLineItem> {
	public List<PoInfoPlanLineItem> findByOmCode(String code);
	public List<PoInfoPlanLineItem> findByHeadId(int headId);
	public List<PoInfoPlanLineItem> findByStates(int state,int booleanStatus);
	
	public List<PoInfoPlanLineItem> findByExistPlanLine(int headerId, String lineCode, Date deliveryDate,
			String deliveryLocation, String approvalNumber);

	public int updateOldPlanLine(int headerId, String lineCode, Date deliveryDate, String deliveryLocation,
			String approvalNumber);
}
