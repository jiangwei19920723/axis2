package cn.jcloud.srm.dao;

import java.util.List;

import cn.jcloud.srm.entity.SRMFlowState;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月20日 下午3:41:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface SRMFlowStateDao extends BaseDao<SRMFlowState>{
	public List<SRMFlowState> findByHandle(int handle);
	public SRMFlowState findById(long flowId);
	public void updates(List<SRMFlowState> flowStates);
}
