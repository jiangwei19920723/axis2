package cn.jcloud.srm.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.SynchronousStateDao;
import cn.jcloud.srm.entity.SynchronousState;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 上午11:12:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class SynchronousStateDaoImpl extends AbstractBaseDao<SynchronousState> implements SynchronousStateDao {

	@Override
	protected Class<SynchronousState> getEntityClass() {
		return SynchronousState.class;
	}

	@Override
	public SynchronousState findFirstByInterfaceName(String interfaceName) {
		Query query = getSession().createQuery("from SynchronousState where interfaceName=:interfaceName and operationState=:operationState order by createTime desc");
		query.setParameter("interfaceName", interfaceName);
		query.setParameter("operationState", "成功");
		query.setMaxResults(1);
		return (SynchronousState) query.uniqueResult();
	}

}
