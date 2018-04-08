package cn.jcloud.srm.service.sap;

import java.util.Date;
import java.util.List;

import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����5:15:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoInfoPlanLineItemService extends BaseService<PoInfoPlanLineItem> {
	public List<PoInfoPlanLineItem> getByOmCode(String code);
	public List<PoInfoPlanLineItem> getByStates(int state,int booleanStatus);
	public List<PoInfoPlanLineItem> getByHeadId(int headId);
	
	public boolean checkExistPlanLine(int headerId, String lineCode, Date deliveryDate, String deliveryLocation, String approvalNumber);
	
	public int updateOldPlanLine(int headerId, String lineCode, Date deliveryDate, String deliveryLocation, String approvalNumber);
}
