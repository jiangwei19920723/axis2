package cn.jcloud.srm.dao.impl.sap;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.PoInfoPlanLineItemDao;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����5:06:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoInfoPlanLineItemDaoImpl extends AbstractBaseDao<PoInfoPlanLineItem> implements PoInfoPlanLineItemDao{

	@Override
	protected Class<PoInfoPlanLineItem> getEntityClass() {
		return PoInfoPlanLineItem.class;
	}

	@Override
	public List<PoInfoPlanLineItem> findByOmCode(String code) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem where omCode =:code");
		query.setParameter("code", code);
		return query.list();
	}

	@Override
	public List<PoInfoPlanLineItem> findByStates(int state, int booleanStatus) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem where state =:state and booleanStatus=:booleanStatus");
		query.setParameter("state", state);
		query.setParameter("booleanStatus", booleanStatus);
		return query.list();
	}
	
	@Override
	public PoInfoPlanLineItem findById(int id) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem where id =:id");
		query.setParameter("id", id);
		return (PoInfoPlanLineItem) query.uniqueResult();
	}

	@Override
	public List<PoInfoPlanLineItem> findByHeadId(int headId) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem where headId =:headId");
		query.setParameter("headId", headId);
		return query.list();
	}

	@Override
	public List<PoInfoPlanLineItem> findByExistPlanLine(int headerId, String lineCode, Date deliveryDate,
			String deliveryLocation, String approvalNumber) {
		Query query = getSession().createQuery("from PoInfoPlanLineItem where headId =:headId and purchasePlanProjectNumber=:lineCode "
				+ " and deliveryDate=:deliveryDate and deliveryLocation=:deliveryLocation and approvalNumber=:approvalNumber");
		query.setParameter("headId", headerId);
		query.setParameter("lineCode", lineCode);
		query.setParameter("deliveryDate", deliveryDate);
		query.setParameter("deliveryLocation", deliveryLocation);
		query.setParameter("approvalNumber", approvalNumber);
		return query.list();
	}

	@Override
	public int updateOldPlanLine(int headerId, String lineCode, Date deliveryDate, String deliveryLocation,
			String approvalNumber) {
		Query query = getSession().createQuery("update PoInfoPlanLineItem set booleanStatus=9,valid_status=0 where headId =:headId and purchasePlanProjectNumber=:lineCode "
				+ " and deliveryDate=:deliveryDate and deliveryLocation=:deliveryLocation and approvalNumber<>:approvalNumber");
		query.setParameter("headId", headerId);
		query.setParameter("lineCode", lineCode);
		query.setParameter("deliveryDate", deliveryDate);
		query.setParameter("deliveryLocation", deliveryLocation);
		query.setParameter("approvalNumber", approvalNumber);
		return query.executeUpdate();
	}

}
