package cn.jcloud.srm.dao.srm;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.srm.VendorContract;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:21:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface VendorContractDao extends BaseDao<VendorContract> {
	public List<VendorContract> findBystatus(Integer send_status);
	public VendorContract findById(BigDecimal id);
}
