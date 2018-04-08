package cn.jcloud.srm.dao.impl.sap;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.FiInvoiceHandleDao;
import cn.jcloud.srm.entity.sap.FiInvoiceHandle;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月8日 下午4:32:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class FiInvoiceHandleDaoImpl extends AbstractBaseDao<FiInvoiceHandle> implements FiInvoiceHandleDao{

	@Override
	protected Class<FiInvoiceHandle> getEntityClass() {
		return FiInvoiceHandle.class;
	}

}
