package cn.jcloud.srm.service.impl.srm;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.srm.VendorContractMtlDao;
import cn.jcloud.srm.entity.srm.VendorContractMtl;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.srm.VendorContractMtlService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:33:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class VendorContractMtlServiceImpl extends AbstractbaseService<VendorContractMtl, BaseDao<VendorContractMtl>> implements VendorContractMtlService {

	@Override
	public List<VendorContractMtl> getByHeadId(Long contract_id) {
		return ((VendorContractMtlDao)dao).getByHeadId(contract_id);
	}

}
