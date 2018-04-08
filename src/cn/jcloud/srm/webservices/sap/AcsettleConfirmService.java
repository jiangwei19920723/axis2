package cn.jcloud.srm.webservices.sap;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.sap.IfSRM2SAPAcsettleConfirmRequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.sap.FiSettlementInfo;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.sap.FiSettlementInfoService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月15日 上午10:06:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("AcsettleConfirmService")
public class AcsettleConfirmService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AcsettleConfirmService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private FiSettlementInfoService service;
	public void ifSRM2SAPAcsettleConfirm(Header header,IfSRM2SAPAcsettleConfirmRequest request){
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(request);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRMPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM);
		state.setSyncOrAsyn(InterfaceStringUtils.ASYN);
		state.setSyncStartDate(new Date());
		try {
			FiSettlementInfo info = service.getByReceivingVoucherAndReceivingLineItem(request.getZ_belnr(), request.getZ_buzei());
			if (info == null) {
				throw new Exception("物料采购结算信息不存在！");
			}
			if (request.getZtype()=='S') {
				info.setPushState("1");
			}else {
				info.setPushState("9");
				throw new Exception("物料采购信息确认失败！");
			}
			info.setPushNumber(info.getPushNumber()+1);
			service.update(info);
			state.setSyncEndDate(new Date());
			state.setOperationState("成功");
			stateService.save(state);
			LOGGER.info(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM,e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
		}
	}
}
