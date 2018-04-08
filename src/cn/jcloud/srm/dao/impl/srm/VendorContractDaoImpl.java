package cn.jcloud.srm.dao.impl.srm;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.VendorContractDao;
import cn.jcloud.srm.entity.srm.VendorContract;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:22:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class VendorContractDaoImpl extends AbstractBaseDao<VendorContract> implements VendorContractDao {

	@Override
	public List<VendorContract> findBystatus(Integer send_status) {
		Query query = getSession().createQuery("from VendorContract where send_status=:send_status");
		query.setParameter("send_status", send_status);
		return query.list();
	}

	@Override
	protected Class<VendorContract> getEntityClass() {
		return VendorContract.class;
	}
	@Override
	public VendorContract findById(BigDecimal id) {
		Query query = getSession().createQuery("from VendorContract where id=:id");
		query.setParameter("id", id);
		return (VendorContract) query.uniqueResult();
	}
}
