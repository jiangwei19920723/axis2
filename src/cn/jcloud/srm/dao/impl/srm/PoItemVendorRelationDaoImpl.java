package cn.jcloud.srm.dao.impl.srm;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.PoItemVendorRelationDao;
import cn.jcloud.srm.entity.srm.PoItemVendorRelation;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:16:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoItemVendorRelationDaoImpl extends AbstractBaseDao<PoItemVendorRelation> implements PoItemVendorRelationDao {

	@Override
	public List<PoItemVendorRelation> findByStatus(Integer send_status) {
		Query query = getSession().createQuery("from PoItemVendorRelation where send_status=:send_status");
		query.setParameter("send_status", send_status);
		return query.list();
	}

	@Override
	protected Class<PoItemVendorRelation> getEntityClass() {
		return PoItemVendorRelation.class;
	}

	@Override
	public PoItemVendorRelation findById(BigDecimal id) {
		Query query = getSession().createQuery("from PoItemVendorRelation where id=:id");
		query.setParameter("id", id);
		return (PoItemVendorRelation) query.uniqueResult();
	}

}
