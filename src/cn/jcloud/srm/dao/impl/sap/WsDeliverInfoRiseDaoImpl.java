package cn.jcloud.srm.dao.impl.sap;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.WsDeliverInfoRiseDao;
import cn.jcloud.srm.entity.sap.WsDeliverInfoRise;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午2:25:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class WsDeliverInfoRiseDaoImpl extends AbstractBaseDao<WsDeliverInfoRise> implements WsDeliverInfoRiseDao {

	@Override
	public WsDeliverInfoRise findByDocNumber(String docNumber) {
		Query query = getSession().createQuery("from WsDeliverInfoRise where docNumber =:docNumber");
		query.setParameter("docNumber", docNumber);
		return (WsDeliverInfoRise) query.uniqueResult();
	}

	@Override
	protected Class<WsDeliverInfoRise> getEntityClass() {
		return WsDeliverInfoRise.class;
	}

}
