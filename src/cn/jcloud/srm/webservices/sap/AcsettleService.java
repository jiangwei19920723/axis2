package cn.jcloud.srm.webservices.sap;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.sap.IfSRM2SAPAcsettleRequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.sap.FiSettlementInfoService;
import cn.jcloud.srm.service.sap.MtlItemsService;
import cn.jcloud.srm.vo.AcsettleHeadleThread;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月8日 上午9:41:36
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Service("AcsettleService")
@Scope("prototype")
public class AcsettleService {
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private FiSettlementInfoService service;
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private MtlItemsService mtlItemsService;
	@Autowired
	private WebServiceHandleException handleException;
	public void ifSRM2SAPAcsettle(Header header, List<IfSRM2SAPAcsettleRequest> requests) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPACSETTLEPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPACSETTLE);
		state.setSyncOrAsyn(InterfaceStringUtils.ASYN);
		taskExecutor.execute(new AcsettleHeadleThread(requests, service, stateService,infoService,mtlItemsService, state,header.getSender(),handleException));
	}
}
