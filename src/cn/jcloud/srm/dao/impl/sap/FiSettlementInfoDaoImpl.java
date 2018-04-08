package cn.jcloud.srm.dao.impl.sap;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.FiSettlementInfoDao;
import cn.jcloud.srm.entity.sap.FiSettlementInfo;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 上午10:33:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class FiSettlementInfoDaoImpl extends AbstractBaseDao<FiSettlementInfo> implements FiSettlementInfoDao {

	@Override
	protected Class<FiSettlementInfo> getEntityClass() {
		return FiSettlementInfo.class;
	}

	@Override
	public FiSettlementInfo findBysettlementCode(String code) {
		Query query = getSession().createQuery("from FiSettlementInfo where settlementCode =:code");
		query.setParameter("code", code);
		return (FiSettlementInfo) query.uniqueResult();
	}
	
	@Override
	public FiSettlementInfo findById(int id) {
		Query query = getSession().createQuery("from FiSettlementInfo where id =:id");
		query.setParameter("id", id);
		return (FiSettlementInfo) query.uniqueResult();
	}
	@Override
	public List<FiSettlementInfo> findByStates(String pushState, Integer confirm) {
		Query query = getSession().createQuery("from FiSettlementInfo where pushState=:pushState and confirm=:confirm");
		query.setParameter("pushState", pushState);
		query.setParameter("confirm", confirm);
		return query.list();
	}

	@Override
	public FiSettlementInfo findByReceivingVoucherAndReceivingLineItem(String receivingVoucher,
			String receivingLineItem) {
		Query query = getSession().createQuery("from FiSettlementInfo where receivingVoucher=:receivingVoucher and receivingLineItem=:receivingLineItem");
		query.setParameter("receivingVoucher", receivingVoucher);
		query.setParameter("receivingLineItem", receivingLineItem);
		return (FiSettlementInfo) query.uniqueResult();
	}

}
