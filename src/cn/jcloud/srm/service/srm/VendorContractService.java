package cn.jcloud.srm.service.srm;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.entity.srm.VendorContract;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:26:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface VendorContractService extends BaseService<VendorContract> {
	public List<VendorContract> getByStatus(Integer send_status);
	public VendorContract getById(BigDecimal id);
}
