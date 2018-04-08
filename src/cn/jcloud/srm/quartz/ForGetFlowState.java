package cn.jcloud.srm.quartz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jcloud.srm.entity.SRMFlowState;
import cn.jcloud.srm.service.SRMFlowStateService;
import cn.jcloud.srm.web.SRMController;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月20日 下午2:41:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class ForGetFlowState {
	private static final Logger LOGGER = LoggerFactory.getLogger(ForGetFlowState.class);
	@Autowired
	private SRMFlowStateService service;
	private SRMController controller = new SRMController();
	public void run(){
		
		List<SRMFlowState> flowStates = service.getByHandle(0);
		List<SRMFlowState> flowStates2 = new ArrayList<>();
		if (flowStates !=null && flowStates.size() > 0) {
			for (SRMFlowState srmFlowState : flowStates) {
				long flowState = controller.getFlowState(srmFlowState.getFlowId());
				if (flowState == 5 || flowState == 15 || flowState == 0 ||flowState == -1) {
					if (flowState == -1) {
						LOGGER.info("OA流程id："+srmFlowState.getFlowId()+" ,为-1");
						continue;						
					}else {
						srmFlowState.setFlowState(flowState);
					}
					srmFlowState.setUpdate_time(new Date());
					srmFlowState.setHandle(1);
					flowStates2.add(srmFlowState);
				}else if (srmFlowState.getFlowState() !=flowState) {
					srmFlowState.setUpdate_time(new Date());
					srmFlowState.setFlowState(flowState);
					flowStates2.add(srmFlowState);
				}
			}
		}
		if (flowStates2.size()>0) {
			service.updates(flowStates2);
		}
	}
}
