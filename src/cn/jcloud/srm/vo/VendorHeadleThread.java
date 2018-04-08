package cn.jcloud.srm.vo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient3.HttpTransportPropertiesImpl.Authenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.jcloud.srm.beans.sap.IfSRM2SAPVendorRequest;
import cn.jcloud.srm.client.sap.vendor.DT_HEADER;
import cn.jcloud.srm.client.sap.vendor.DT_VENDOR;
import cn.jcloud.srm.client.sap.vendor.MT_VENDOR;
import cn.jcloud.srm.client.sap.vendor.SI_SRM2SAP_VENDOR_OUTServiceStub;
import cn.jcloud.srm.client.sap.vendor.VENDOR_RES_type0;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月12日 下午4:33:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class VendorHeadleThread implements Runnable {
	private static final Logger LOGGER = LoggerFactory.getLogger(VendorHeadleThread.class);
	private VendorInfoService service;
	private IfSRM2SAPVendorRequest request;
	private SynchronousStateService stateService;
	private SynchronousState state;
	private String receiver;

	public VendorHeadleThread(VendorInfoService service, IfSRM2SAPVendorRequest request,
			SynchronousStateService stateService, SynchronousState state, String receiver) {
		super();
		this.service = service;
		this.request = request;
		this.stateService = stateService;
		this.state = state;
		this.receiver = receiver;
	}

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		if (request.getEndTime().equals("") || request.getEndTime() == null) {
			request.setEndTime(sdf.format(new Date()));
		}
		try {
			List<VendorInfo> vendorInfos = service.getByUpdateTime(request.getStartTime(), request.getEndTime(), request.getType());
			int zise = vendorInfos.size();
			VENDOR_RES_type0[] list = new VENDOR_RES_type0[zise];
			for (int i = 0; i < zise; i++) {
				VENDOR_RES_type0 response = new VENDOR_RES_type0();
				VendorInfo vendorInfo = vendorInfos.get(i);
				response.setLIFNR(vendorInfo.getVendorCode() == null ? "" : vendorInfo.getVendorCode());
				response.setNAME(vendorInfo.getVendorName() == null ? "" : vendorInfo.getVendorName());
				response.setMCOD1(vendorInfo.getVendorShortName() == null ? "" : vendorInfo.getVendorShortName());
				response.setSTRAS(vendorInfo.getAddressAddr() == null ? "" : vendorInfo.getAddressAddr());
				response.setREGIO(vendorInfo.getFactoryProvince() == null ? "":""+vendorInfo.getFactoryProvince());
				response.setORT01(vendorInfo.getFactoryAddress() == null ? "" : vendorInfo.getFactoryAddress());
				response.setPSTLZ(vendorInfo.getPostcode() == null ? "" : vendorInfo.getPostcode());
				response.setFAX_NUMBER(vendorInfo.getFax() == null ? "" : vendorInfo.getFax());
				response.setTEL_NUMBER(vendorInfo.getTelephone() == null ? "" : vendorInfo.getTelephone());
				response.setSMTP_ADDR(vendorInfo.getVendorMail() == null ? "" : vendorInfo.getVendorMail());
				response.setTELF1(vendorInfo.getTelephone() == null ? "" : vendorInfo.getTelephone());
				response.setSTCD5(vendorInfo.getTaxNumber() == null ? "" : vendorInfo.getTaxNumber());
				response.setOP_TYPE(vendorInfo.getRegTime().getTime() != vendorInfo.getUpdateTime().getTime()
						? "02" : "01");
				response.setFREEUSE1(vendorInfo.getVendor_type() == null ? "" :vendorInfo.getVendor_type());//供应商类型
				response.setFREEUSE2(vendorInfo.getContact() == null ? "" :vendorInfo.getContact());//联系人
				response.setFREEUSE3("1");//状态
				response.setCH_TIME(sdf.format(vendorInfo.getUpdateTime()));
				list[i] = response;
			}
			if (list.length > 0) {
				FileUtils.repSapCity(list);
				SI_SRM2SAP_VENDOR_OUTServiceStub outService = new SI_SRM2SAP_VENDOR_OUTServiceStub(
						InterfaceStringUtils.SAPVENDOR);
				Options options = outService._getServiceClient().getOptions();
				Authenticator auth = new Authenticator();
				auth.setUsername(InterfaceStringUtils.SAPUSERNAME);
				auth.setPassword(InterfaceStringUtils.SAPPASSWORD);
				options.setProperty(HTTPConstants.AUTHENTICATE, auth);
				options.setProperty(HTTPConstants.CHUNKED, "false");
				MT_VENDOR mT_VENDOR = new MT_VENDOR();
				DT_VENDOR dt_VENDOR = new DT_VENDOR();
				DT_HEADER dt_HEADER = new DT_HEADER();
				dt_HEADER.setBUSID("");
				dt_HEADER.setDTSEND(new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date()));
				dt_HEADER.setFREEUSE("");
				dt_HEADER.setMSGID(InterfaceStringUtils.SENDER + UUID.randomUUID().toString().replaceAll("-", ""));
				dt_HEADER.setRECEIVER(receiver);
				dt_HEADER.setSENDER(InterfaceStringUtils.SENDER);
				dt_HEADER.setTLGID("If_SRM2SAP_VENDOR");
				dt_HEADER.setTLGNAME("供应商主数据接收接口");
				dt_VENDOR.setTP_HEADER(dt_HEADER);
				dt_VENDOR.setVENDOR_RES(list);
				mT_VENDOR.setMT_VENDOR(dt_VENDOR);
				state.setSyncStartDate(new Date());
				outService.sI_SRM2SAP_VENDOR_OUT(mT_VENDOR);
				state.setSyncEndDate(new Date());
				state.setOperationState("成功");
				stateService.save(state);
			} else {
				state.setSyncStartDate(new Date());
				state.setSyncEndDate(new Date());
				state.setOperationState("无数据返回");
				stateService.save(state);
			}
			LOGGER.info(InterfaceStringUtils.IFSRM2SAPVENDOR);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPVENDOR, e);
			state.setSyncEndDate(new Date());
			state.setOperationState("失败");
			stateService.save(state);
		}
	}

	public IfSRM2SAPVendorRequest getRequest() {
		return request;
	}

	public void setRequest(IfSRM2SAPVendorRequest request) {
		this.request = request;
	}

	public VendorInfoService getService() {
		return service;
	}

	public void setService(VendorInfoService service) {
		this.service = service;
	}

	public SynchronousStateService getStateService() {
		return stateService;
	}

	public void setStateService(SynchronousStateService stateService) {
		this.stateService = stateService;
	}

	public SynchronousState getState() {
		return state;
	}

	public void setState(SynchronousState state) {
		this.state = state;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

}
