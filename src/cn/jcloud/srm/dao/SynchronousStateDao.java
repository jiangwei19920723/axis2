package cn.jcloud.srm.dao;

import cn.jcloud.srm.entity.SynchronousState;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 上午11:11:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface SynchronousStateDao extends BaseDao<SynchronousState> {
	public SynchronousState findFirstByInterfaceName(String interfaceName);
}
