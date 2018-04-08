package cn.jcloud.srm.webservices.sap;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.sap.IfSRM2SAPAcinvoiceRequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.sap.FiInvoiceHandle;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.sap.FiInvoiceHandleService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月8日 下午3:57:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("AcinvoiceService")
@Scope("prototype")
public class AcinvoiceService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AcinvoiceService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private FiInvoiceHandleService service;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private WebServiceHandleException handleException;
	public MsgResult ifSRM2SAPAcinvoice(Header header,List<IfSRM2SAPAcinvoiceRequest> requests){
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPACINVOICEPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPACINVOICE);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		state.setSyncStartDate(new Date());
		MsgResult result = new MsgResult();
		try {
			handleException.ifSRM2SAPAcinvoiceHandle(requests);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			List<FiInvoiceHandle> acinvoices = new ArrayList<>();
			for (IfSRM2SAPAcinvoiceRequest request : requests) {
				FiInvoiceHandle acinvoice = new FiInvoiceHandle();
				acinvoice.setCreate_time(sdf.parse(request.getFreeUse1()));
				acinvoice.setReceivingVoucher(request.getBelnr());
				acinvoice.setSystemInvoiceNumber(request.getPelnr());
				acinvoice.setCompanyCode(request.getBukrs());
				acinvoice.setPurchaseOrder(request.getEbeln());
				acinvoice.setDocumentYear(request.getGjahr());
				acinvoice.setOm(request.getLifnr());
				VendorInfo info = infoService.getByCode(request.getLifnr());
				acinvoice.setVendorId(info.getVendorId().intValue());
				acinvoice.setFactory(request.getWerks());
				acinvoice.setPaperInvoiceNumber(request.getXblnr());
				acinvoices.add(acinvoice);
			}
			service.saves(acinvoices);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPACINVOICE,e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			result.setZtype('E');
			result.setZmessage(e.getMessage());
			return result;
		}
		LOGGER.info(InterfaceStringUtils.IFSRM2SAPACINVOICE);
		state.setSyncEndDate(new Date());
		state.setOperationState("系统发票号" + requests.get(0).getPelnr() +"成功");
		stateService.save(state);
		result.setZtype('S');
		result.setZmessage("成功");
		return result;
	}
}
