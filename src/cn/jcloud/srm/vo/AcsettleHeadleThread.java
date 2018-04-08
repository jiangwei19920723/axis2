package cn.jcloud.srm.vo;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient3.HttpTransportPropertiesImpl.Authenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.jcloud.srm.beans.sap.IfSRM2SAPAcsettleLineItem;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAcsettleRequest;
import cn.jcloud.srm.client.sap.acsettle.ACSETTLE_RES_type0;
import cn.jcloud.srm.client.sap.acsettle.DT_ACSETTLE;
import cn.jcloud.srm.client.sap.acsettle.DT_HEADER;
import cn.jcloud.srm.client.sap.acsettle.MT_ACSETTLE;
import cn.jcloud.srm.client.sap.acsettle.SI_SRM2SAP_ACSETTLE_OUTServiceStub;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.sap.FiSettlementInfo;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.sap.FiSettlementInfoService;
import cn.jcloud.srm.service.sap.MtlItemsService;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月16日 上午10:14:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class AcsettleHeadleThread implements Runnable {
	private static final Logger LOGGER = LoggerFactory.getLogger(AcsettleHeadleThread.class);
	private List<IfSRM2SAPAcsettleRequest> requests;
	private FiSettlementInfoService service;
	private SynchronousStateService stateService;
	private SynchronousState state;
	private String receiver;
	private VendorInfoService infoService;
	private MtlItemsService mtlItemsService;
	private WebServiceHandleException handleException;

	public AcsettleHeadleThread(List<IfSRM2SAPAcsettleRequest> requests, FiSettlementInfoService service, SynchronousStateService stateService,
			VendorInfoService infoService, MtlItemsService mtlItemsService, SynchronousState state, String receiver,
			WebServiceHandleException handleException) {
		super();
		this.requests = requests;
		this.service = service;
		this.stateService = stateService;
		this.state = state;
		this.receiver = receiver;
		this.infoService = infoService;
		this.mtlItemsService = mtlItemsService;
		this.handleException = handleException;
	}

	@Override
	public void run() {
		List<ACSETTLE_RES_type0> list = new ArrayList<>();
		try {
			handleException.ifSRM2SAPAcsettleHandle(requests);
			List<FiSettlementInfo> infos = new ArrayList<>();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			for (IfSRM2SAPAcsettleRequest request : requests) {
				for (IfSRM2SAPAcsettleLineItem requestChild : request.getList()) {
					ACSETTLE_RES_type0 type0 = new ACSETTLE_RES_type0();
					type0.setZ_ZUUID(request.getZuuid());
					type0.setZ_BUKRS(request.getBukrs());
					type0.setZ_LIFNR(request.getLifnr());
					type0.setZ_BELNR(requestChild.getBelnr());
					type0.setZ_BUZEI(requestChild.getBuzei());
					type0.setZ_GJAHR(requestChild.getGjahr());
					list.add(type0);
					FiSettlementInfo info = new FiSettlementInfo();
					info.setOm(request.getLifnr());
					VendorInfo vendorInfo = infoService.getByCode(request.getLifnr());
					info.setVendorId(vendorInfo.getVendorId().intValue());
					info.setFactory(request.getWerks());
					info.setCompanyCode(request.getBukrs());
					info.setSettlementCode(request.getZuuid());
					info.setSettlement_type(request.getFreeUse1());
					info.setCreate_time(new Date());
					info.setKolliNumber(requestChild.getAblad());
					info.setOmDeliveryNumber(requestChild.getAsnNum());
					info.setReceivingVoucher(requestChild.getBelnr());
					info.setReceivingLineItem(requestChild.getBuzei());
					info.setSettlementAmount(BigDecimal.valueOf(Double.parseDouble(requestChild.getDmbtrS())));
					info.setPurchaseOrder(requestChild.getEbeln());
					info.setOrderLineItem(requestChild.getEbelp());
					info.setDocumentYear(requestChild.getGjahr());
					info.setSettlementPrice(BigDecimal.valueOf(Double.parseDouble(requestChild.getKbetrS())));
					info.setMateriel(requestChild.getMatnr());
					MtlItems mtlItems = mtlItemsService.getByCode(requestChild.getMatnr());
					info.setMaterielId(mtlItems.getItemId());
					info.setPurchasing_group(requestChild.getFreeUse4());
					info.setMeasurementUnit(requestChild.getMeins());
					info.setFiNumber(BigDecimal.valueOf(Double.parseDouble(requestChild.getMenge())));
					info.setTaxRate(requestChild.getMwskz());
					info.setFiRows(Integer.parseInt(requestChild.getNum()));
					info.setDeliveryItem(requestChild.getPosnv());
					info.setReturnMark(requestChild.getRetun());
					info.setToLoan(requestChild.getShkzg());
					info.setInwardDeliveryNumber(requestChild.getVbelv());
					info.setVoucherDate(sdf.parse(requestChild.getBlDat()));
					info.setAccountingDate(sdf.parse(requestChild.getBuDat()));
					if (requestChild.getFreeUse1() !=null && !requestChild.getFreeUse1().equals("")) {
						info.setDeducted_amount(BigDecimal.valueOf(Double.parseDouble(requestChild.getFreeUse1())));
					}
					info.setDeduction_mode(requestChild.getFreeUse2());
					info.setPurchasing_organization(requestChild.getFreeUse3());
					info.setOmOperationState("0");
					info.setPushState("0");
					info.setPushNumber(0);
					info.setConfirm(0);
					infos.add(info);
				}
			}
			state.setSyncStartDate(new Date());
			service.saves(infos);
			for (ACSETTLE_RES_type0 type : list) {
				type.setZTYPE("S");
				type.setZMESSAGE("成功");
			}

			state.setSyncEndDate(new Date());
			state.setOperationState("结算编码：" + requests.get(0).getZuuid() + "成功");
			stateService.save(state);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPACSETTLE, e);
			for (ACSETTLE_RES_type0 type : list) {
				type.setZTYPE("E");
				type.setZMESSAGE(e.getMessage());
			}
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
		} finally {
			SI_SRM2SAP_ACSETTLE_OUTServiceStub stub = null;
			try {
				stub = new SI_SRM2SAP_ACSETTLE_OUTServiceStub(InterfaceStringUtils.SAPACSETTLE);
			} catch (AxisFault e) {
				LOGGER.error(InterfaceStringUtils.IFSRM2SAPACSETTLE, e);
			}
			Options options = stub._getServiceClient().getOptions();
			Authenticator auth = new Authenticator();
			auth.setUsername(InterfaceStringUtils.SAPUSERNAME);
			auth.setPassword(InterfaceStringUtils.SAPPASSWORD);
			options.setProperty(HTTPConstants.AUTHENTICATE, auth);
			MT_ACSETTLE mT_ACSETTLE1 = new MT_ACSETTLE();
			DT_ACSETTLE dT_ACSETTLE1 = new DT_ACSETTLE();
			DT_HEADER dt_HEADER = new DT_HEADER();
			dt_HEADER.setBUSID("");
			dt_HEADER.setDTSEND(new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date()));
			dt_HEADER.setFREEUSE("");
			dt_HEADER.setMSGID(InterfaceStringUtils.SENDER + UUID.randomUUID().toString().replaceAll("-", ""));
			dt_HEADER.setRECEIVER(receiver);
			dt_HEADER.setSENDER(InterfaceStringUtils.SENDER);
			dt_HEADER.setTLGID("If_SRM2SAP_ACSETTLE");
			dt_HEADER.setTLGNAME("生产性物料采购结算信息接口");
			dT_ACSETTLE1.setACSETTLE_RES(list.toArray(new ACSETTLE_RES_type0[requests.size()]));
			dT_ACSETTLE1.setTP_HEADER(dt_HEADER);
			mT_ACSETTLE1.setMT_ACSETTLE(dT_ACSETTLE1);
			try {
				stub.sI_SRM2SAP_ACSETTLE_OUT(mT_ACSETTLE1);
				LOGGER.info(InterfaceStringUtils.IFSRM2SAPACSETTLE);
			} catch (RemoteException e) {
				LOGGER.error(InterfaceStringUtils.IFSRM2SAPACSETTLE, e);
			}

		}
	}

	public List<IfSRM2SAPAcsettleRequest> getRequests() {
		return requests;
	}

	public void setRequests(List<IfSRM2SAPAcsettleRequest> requests) {
		this.requests = requests;
	}

	public FiSettlementInfoService getService() {
		return service;
	}

	public void setService(FiSettlementInfoService service) {
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

	public static Logger getLogger() {
		return LOGGER;
	}

	public VendorInfoService getInfoService() {
		return infoService;
	}

	public void setInfoService(VendorInfoService infoService) {
		this.infoService = infoService;
	}

	public MtlItemsService getMtlItemsService() {
		return mtlItemsService;
	}

	public void setMtlItemsService(MtlItemsService mtlItemsService) {
		this.mtlItemsService = mtlItemsService;
	}

	public WebServiceHandleException getHandleException() {
		return handleException;
	}

	public void setHandleException(WebServiceHandleException handleException) {
		this.handleException = handleException;
	}

}
