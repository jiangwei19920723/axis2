package cn.jcloud.srm.service.impl.sap;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.PoInfoPlanLineItemDao;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.PoInfoPlanLineItemService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����5:17:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class PoInfoPlanLineItemServiceImpl extends AbstractbaseService<PoInfoPlanLineItem, BaseDao<PoInfoPlanLineItem>> implements PoInfoPlanLineItemService{
	@Override
	public List<PoInfoPlanLineItem> getByOmCode(String code) {
		return ((PoInfoPlanLineItemDao) dao).findByOmCode(code);
	}

	@Override
	public List<PoInfoPlanLineItem> getByStates(int state, int booleanStatus) {
		return ((PoInfoPlanLineItemDao) dao).findByStates(state, booleanStatus);
	}

	@Override
	public List<PoInfoPlanLineItem> getByHeadId(int headId) {
		return ((PoInfoPlanLineItemDao) dao).findByHeadId(headId);
	}

	@Override
	public boolean checkExistPlanLine(int headerId, String lineCode, Date deliveryDate,
			String deliveryLocation, String approvalNumber) {
		List<PoInfoPlanLineItem> existed = ((PoInfoPlanLineItemDao) dao).findByExistPlanLine(headerId, lineCode, deliveryDate, deliveryLocation, approvalNumber);
		return existed != null && !existed.isEmpty();
	}

	@Override
	@Transactional(readOnly=false)
	public int updateOldPlanLine(int headerId, String lineCode, Date deliveryDate, String deliveryLocation,
			String approvalNumber) {
		return ((PoInfoPlanLineItemDao) dao).updateOldPlanLine(headerId, lineCode, deliveryDate, deliveryLocation, approvalNumber);
	}

}
