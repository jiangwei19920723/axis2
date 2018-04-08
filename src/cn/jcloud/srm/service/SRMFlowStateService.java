package cn.jcloud.srm.service;

import java.util.List;

import cn.jcloud.srm.entity.SRMFlowState;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月20日 下午3:48:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface SRMFlowStateService extends BaseService<SRMFlowState> {
	public List<SRMFlowState> getByHandle(int handle);
	public SRMFlowState getById(long flowId);
	public void updates(List<SRMFlowState> flowStates);
}
