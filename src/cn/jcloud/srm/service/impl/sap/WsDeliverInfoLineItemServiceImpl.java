package cn.jcloud.srm.service.impl.sap;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.WsDeliverInfoLineItemDao;
import cn.jcloud.srm.entity.sap.WsDeliverInfoLineItem;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.WsDeliverInfoLineItemService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月7日 下午8:24:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class WsDeliverInfoLineItemServiceImpl extends AbstractbaseService<WsDeliverInfoLineItem, BaseDao<WsDeliverInfoLineItem>> implements WsDeliverInfoLineItemService {
	@Override
	public List<WsDeliverInfoLineItem> getByOmCode(String code) {
		return ((WsDeliverInfoLineItemDao) dao).findByOmCode(code);
	}
	
}
