package cn.jcloud.srm.webservices.sap;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.sap.IfSRM2SAPVendorRequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.vo.VendorHeadleThread;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��5�� ����10:09:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("VendorService")
@Scope("prototype")
public class VendorService {
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private VendorInfoService service;
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	public void ifSRM2SAPVendor(Header header, IfSRM2SAPVendorRequest request){
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(request);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPVENDORPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPVENDOR);
		state.setSyncOrAsyn(InterfaceStringUtils.ASYN);
		taskExecutor.execute(new VendorHeadleThread(service,request,stateService,state,header.getSender()));
	}
}
