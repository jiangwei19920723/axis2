package cn.jcloud.srm.service.impl.srm;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.srm.VendorContractDao;
import cn.jcloud.srm.entity.srm.VendorContract;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.srm.VendorContractService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:27:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class VendorContractServiceImpl extends AbstractbaseService<VendorContract, BaseDao<VendorContract>> implements VendorContractService {

	@Override
	public List<VendorContract> getByStatus(Integer send_status) {
		return ((VendorContractDao)dao).findBystatus(send_status);
	}

	@Override
	public VendorContract getById(BigDecimal id) {
		return ((VendorContractDao)dao).findById(id);
	}

}
