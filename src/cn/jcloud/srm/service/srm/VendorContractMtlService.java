package cn.jcloud.srm.service.srm;

import java.util.List;

import cn.jcloud.srm.entity.srm.VendorContractMtl;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:32:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface VendorContractMtlService extends BaseService<VendorContractMtl> {
	public List<VendorContractMtl> getByHeadId(Long contract_id);
}
