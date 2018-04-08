package cn.jcloud.srm.service.impl.srm;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.srm.PoItemVendorRelationDao;
import cn.jcloud.srm.entity.srm.PoItemVendorRelation;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.srm.PoItemVendorRelationService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:19:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class PoItemVendorRelationServiceImpl extends AbstractbaseService<PoItemVendorRelation, BaseDao<PoItemVendorRelation>> implements PoItemVendorRelationService {

	@Override
	public List<PoItemVendorRelation> getByStatus(Integer send_status) {
		return ((PoItemVendorRelationDao)dao).findByStatus(send_status);
	}

	@Override
	public PoItemVendorRelation getById(BigDecimal id) {
		return ((PoItemVendorRelationDao)dao).findById(id);
	}

}
