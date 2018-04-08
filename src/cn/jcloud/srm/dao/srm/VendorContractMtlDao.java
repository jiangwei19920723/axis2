package cn.jcloud.srm.dao.srm;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.srm.VendorContractMtl;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:29:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface VendorContractMtlDao extends BaseDao<VendorContractMtl> {
	public List<VendorContractMtl> getByHeadId(Long contract_id);
}
