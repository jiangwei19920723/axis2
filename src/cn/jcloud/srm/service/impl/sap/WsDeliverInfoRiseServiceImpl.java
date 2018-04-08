package cn.jcloud.srm.service.impl.sap;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.WsDeliverInfoRiseDao;
import cn.jcloud.srm.entity.sap.WsDeliverInfoRise;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.WsDeliverInfoRiseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 下午2:28:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class WsDeliverInfoRiseServiceImpl extends AbstractbaseService<WsDeliverInfoRise, BaseDao<WsDeliverInfoRise>> implements WsDeliverInfoRiseService {

	@Override
	public WsDeliverInfoRise getByDocNumber(String docNumber) {
		return ((WsDeliverInfoRiseDao) dao).findByDocNumber(docNumber);
	}

}
