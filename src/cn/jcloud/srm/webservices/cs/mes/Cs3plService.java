package cn.jcloud.srm.webservices.cs.mes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.jcloud.srm.beans.cs.mes.WMStoSRM_3PLRequest;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.cs.sap.PoInventoryOrderService;
import cn.jcloud.srm.service.mes.MaterialPlanItemService;
import cn.jcloud.srm.service.mes.MaterialPlanRiseService;
import cn.jcloud.srm.service.sap.MtlItemsService;
import cn.jcloud.srm.service.srm.DistributionOrderService;
import cn.jcloud.srm.service.srm.PoAsnLineService;
import cn.jcloud.srm.webservices.mes.WMStoSRM_MaterialPlanService;

/** 
 * 拉动需求
 * @author  蒋维 
 * @date 创建时间：2018年3月30日 上午10:36:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("Cs3plService")
@Scope("prototype")
public class Cs3plService {
	private static final Logger LOGGER = LoggerFactory.getLogger(Cs3plService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private PoAsnLineService poAsnLineService;
	@Autowired
	private PoInventoryOrderService service;
	@Autowired
	private WebServiceHandleException handleException;
	public MsgResult WMStoSRM_3PL(Header header,WMStoSRM_3PLRequest request){
		
		return null;
	}

}
