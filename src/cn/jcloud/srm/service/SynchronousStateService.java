package cn.jcloud.srm.service;

import cn.jcloud.srm.entity.SynchronousState;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 上午11:15:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface SynchronousStateService extends BaseService<SynchronousState> {
	public SynchronousState getFirstByInterfaceName(String interfaceName);
}
