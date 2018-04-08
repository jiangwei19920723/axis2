package cn.jcloud.srm.service.impl;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.SynchronousStateDao;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.SynchronousStateService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 上午11:15:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class SynchronousStateServiceImpl extends AbstractbaseService<SynchronousState, BaseDao<SynchronousState>> implements SynchronousStateService {

	@Override
	public SynchronousState getFirstByInterfaceName(String interfaceName) {
		return ((SynchronousStateDao)dao).findFirstByInterfaceName(interfaceName);
	}

}
