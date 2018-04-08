package cn.jcloud.srm.service.impl.sap;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.MtlItemsDao;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.MtlItemsService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月18日 下午8:21:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class MtlItemsServiceImpl extends AbstractbaseService<MtlItems, BaseDao<MtlItems>> implements MtlItemsService {
	@Override
	@Transactional(readOnly=false)
	public void updates(List<MtlItems> items) {
		((MtlItemsDao) dao).updates(items);
	}

	@Override
	public MtlItems getByCode(String code) {
		return ((MtlItemsDao) dao).findByCode(code);
	}
	

 
}
