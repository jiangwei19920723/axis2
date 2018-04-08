package cn.jcloud.srm.dao.impl.sap;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.WsDeliverInfoLineItemDao;
import cn.jcloud.srm.entity.sap.WsDeliverInfoLineItem;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月7日 下午8:16:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class WsDeliverInfoLineItemDaoImpl extends AbstractBaseDao<WsDeliverInfoLineItem> implements WsDeliverInfoLineItemDao {
	@Override
	protected Class<WsDeliverInfoLineItem> getEntityClass() {
		return WsDeliverInfoLineItem.class;
	}

	@Override
	public List<WsDeliverInfoLineItem> findByOmCode(String code) {
		Query query = getSession().createQuery("from WsDeliverInfoLineItem where omCode =:code");
		query.setParameter("code", code);
		return query.list();
	}
	
	
}
