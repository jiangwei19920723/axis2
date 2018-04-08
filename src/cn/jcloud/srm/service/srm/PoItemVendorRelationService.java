package cn.jcloud.srm.service.srm;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.entity.srm.PoItemVendorRelation;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:18:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoItemVendorRelationService extends BaseService<PoItemVendorRelation> {
	public List<PoItemVendorRelation> getByStatus(Integer send_status);
	public PoItemVendorRelation getById(BigDecimal id);
}
