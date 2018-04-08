package cn.jcloud.srm.dao.impl.srm;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.VendorContractMtlDao;
import cn.jcloud.srm.entity.srm.VendorContractMtl;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:30:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class VendorContractMtlDaoImpl extends AbstractBaseDao<VendorContractMtl> implements VendorContractMtlDao {

	@Override
	public List<VendorContractMtl> getByHeadId(Long contract_id) {
		Query query = getSession().createQuery("from VendorContractMtl where contract_id=:contract_id");
		query.setParameter("contract_id", contract_id);
		return query.list();
	}

	@Override
	protected Class<VendorContractMtl> getEntityClass() {
		return VendorContractMtl.class;
	}

}
