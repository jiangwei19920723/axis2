package cn.jcloud.srm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.SRMFlowStateDao;
import cn.jcloud.srm.entity.SRMFlowState;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.SRMFlowStateService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月20日 下午3:50:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class SRMFlowStateServiceImpl extends AbstractbaseService<SRMFlowState, BaseDao<SRMFlowState>> implements SRMFlowStateService {

	@Override
	public List<SRMFlowState> getByHandle(int handle) {
		return ((SRMFlowStateDao)dao).findByHandle(handle);
	}

	@Override
	public SRMFlowState getById(long flowId) {
		return ((SRMFlowStateDao)dao).findById(flowId);
	}

	@Override
	@Transactional(readOnly=false)
	public void updates(List<SRMFlowState> flowStates) {
		((SRMFlowStateDao)dao).updates(flowStates);
	}

}
