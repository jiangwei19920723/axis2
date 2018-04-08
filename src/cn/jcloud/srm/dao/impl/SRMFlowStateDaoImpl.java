package cn.jcloud.srm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.SRMFlowStateDao;
import cn.jcloud.srm.entity.SRMFlowState;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月20日 下午3:42:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class SRMFlowStateDaoImpl extends AbstractBaseDao<SRMFlowState> implements SRMFlowStateDao {

	@Override
	public List<SRMFlowState> findByHandle(int handle) {
		Query query = getSession().createQuery("from SRMFlowState where handle =:handle");
		query.setParameter("handle", handle);
		return query.list();
	}

	@Override
	protected Class<SRMFlowState> getEntityClass() {
		return SRMFlowState.class;
	}

	@Override
	public SRMFlowState findById(long flowId) {
		Query query = getSession().createQuery("from SRMFlowState where flowId =:id");
		query.setParameter("id", flowId);
		return (SRMFlowState) query.uniqueResult();
	}

	@Override
	public void updates(List<SRMFlowState> flowStates) {
		for (SRMFlowState srmFlowState : flowStates) {
			getSession().update(srmFlowState);
		}
	}
}
