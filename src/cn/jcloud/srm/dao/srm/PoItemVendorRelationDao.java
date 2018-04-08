package cn.jcloud.srm.dao.srm;

import java.math.BigDecimal;
import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.srm.PoItemVendorRelation;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:15:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PoItemVendorRelationDao extends BaseDao<PoItemVendorRelation> {
	public List<PoItemVendorRelation> findByStatus(Integer send_status);
	public PoItemVendorRelation findById(BigDecimal id);
}
