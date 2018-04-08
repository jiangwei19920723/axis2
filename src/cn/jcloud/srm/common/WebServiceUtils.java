package cn.jcloud.srm.common;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient3.HttpTransportPropertiesImpl.Authenticator;

import com.alibaba.fastjson.JSON;

import cn.jcloud.srm.beans.oa.OAMassage;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.ArrayOfDeliveryOrderStruct;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.DeliveryOrderInfo;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.DeliveryOrder_Head;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderData;
import cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse;
import cn.jcloud.srm.client.oa.authority.AuthorityServiceStub;
import cn.jcloud.srm.client.oa.authority.AuthorityServiceStub.Authenticate;
import cn.jcloud.srm.client.oa.authority.AuthorityServiceStub.AuthenticateResponse;
import cn.jcloud.srm.client.oa.authority.AuthorityServiceStub.UserToken;
import cn.jcloud.srm.client.oa.authority.ServiceException;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub.GetFlowState;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub.GetFlowStateResponse;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub.LaunchFormCollaboration;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub.LaunchFormCollaborationResponse;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub.LaunchHtmlCollaboration;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub.LaunchHtmlCollaborationResponse;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub.ServiceResponse;
import cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0;
import cn.jcloud.srm.client.sap.confirm.DT_ACSETTLE_CF_REQ;
import cn.jcloud.srm.client.sap.confirm.DT_HEADER;
import cn.jcloud.srm.client.sap.confirm.MT_ACSETTLE_CF_REQ;
import cn.jcloud.srm.client.sap.confirm.SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub;
import cn.jcloud.srm.client.sap.contract.CONTRACT_HEADER_type0;
import cn.jcloud.srm.client.sap.contract.DT_CONTRACT_REQ;
import cn.jcloud.srm.client.sap.contract.MT_CONTRACT_REQ;
import cn.jcloud.srm.client.sap.contract.MT_CONTRACT_RES;
import cn.jcloud.srm.client.sap.contract.SI_SRM2SAP_CONTRACT_OUTServiceStub;
import cn.jcloud.srm.client.sap.material.DT_MATERIAL_REQUEST;
import cn.jcloud.srm.client.sap.material.MATERIAL_REQ_type0;
import cn.jcloud.srm.client.sap.material.MT_MATERIAL_REQUEST;
import cn.jcloud.srm.client.sap.material.SI_ALL2SAP_MATERIAL_REQUEST_OUTServiceStub;
import cn.jcloud.srm.client.sap.postatus.DT_POSTATUS_REQ;
import cn.jcloud.srm.client.sap.postatus.MT_POSTATUS_REQ;
import cn.jcloud.srm.client.sap.postatus.MT_POSTATUS_RES;
import cn.jcloud.srm.client.sap.postatus.POSTATUS_REQ_type0;
import cn.jcloud.srm.client.sap.postatus.SI_SRM2SAP_POSTATUS_OUTServiceStub;
import cn.jcloud.srm.client.sap.record.DT_INFO_RECORD_REQ;
import cn.jcloud.srm.client.sap.record.INFO_RECORD_REQ_type0;
import cn.jcloud.srm.client.sap.record.MT_INFO_RECORD_REQ;
import cn.jcloud.srm.client.sap.record.MT_INFO_RECORD_RES;
import cn.jcloud.srm.client.sap.record.SI_SRM2SAP_INFO_RECORD_OUTServiceStub;
import cn.jcloud.srm.entity.FileInfo;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月25日 下午1:54:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class WebServiceUtils {
	/**
	 * SAP采购合同接口
	 * 
	 * @param param
	 * @throws RemoteException
	 */
	public static MT_CONTRACT_RES toContract(CONTRACT_HEADER_type0[] param) throws RemoteException {
		SI_SRM2SAP_CONTRACT_OUTServiceStub stub = new SI_SRM2SAP_CONTRACT_OUTServiceStub(
				InterfaceStringUtils.SAPCONTRACT);
		Options options = stub._getServiceClient().getOptions();
		Authenticator auth = new Authenticator();
		auth.setUsername(InterfaceStringUtils.SAPUSERNAME);
		auth.setPassword(InterfaceStringUtils.SAPPASSWORD);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		options.setProperty(HTTPConstants.CHUNKED, "false");
		MT_CONTRACT_REQ mT_CONTRACT_REQ2 = new MT_CONTRACT_REQ();
		DT_CONTRACT_REQ req = new DT_CONTRACT_REQ();
		cn.jcloud.srm.client.sap.contract.DT_HEADER head = new cn.jcloud.srm.client.sap.contract.DT_HEADER();
		head.setBUSID("");
		head.setDTSEND(new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date()));
		head.setFREEUSE("");
		head.setMSGID(InterfaceStringUtils.SENDER + UUID.randomUUID().toString().replaceAll("-", ""));
		head.setRECEIVER(InterfaceStringUtils.RECEIVER);
		head.setSENDER(InterfaceStringUtils.SENDER);
		head.setTLGID("ifsrm2sapcontract");
		head.setTLGNAME(InterfaceStringUtils.IFSRM2SAPCONTRACT);
		req.setTP_HEADER(head);
		req.setCONTRACT_HEADER(param);
		mT_CONTRACT_REQ2.setMT_CONTRACT_REQ(req);
		return stub.sI_SRM2SAP_CONTRACT_OUT(mT_CONTRACT_REQ2);
	}

	/**
	 * MES送货单信息 接口
	 * 
	 * @param item
	 * @return
	 * @throws RemoteException
	 */
	public static GetDeliveryOrderDataResponse toDeliverynote(ArrayOfDeliveryOrderStruct item) throws RemoteException {
		SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub stub = new SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub(
				InterfaceStringUtils.MES_DELIVERYNOTE);
		Options options = stub._getServiceClient().getOptions();
		Authenticator auth = new Authenticator();
		auth.setUsername(InterfaceStringUtils.SAPUSERNAME);
		auth.setPassword(InterfaceStringUtils.SAPPASSWORD);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		options.setProperty(HTTPConstants.CHUNKED, "false");
		GetDeliveryOrderData data = new GetDeliveryOrderData();
		DeliveryOrderInfo info = new DeliveryOrderInfo();
		DeliveryOrder_Head head = new DeliveryOrder_Head();
		head.setBUSID("");
		head.setDTSEND(new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date()));
		head.setFREEUSE1("");
		head.setMSGID(InterfaceStringUtils.SENDER + UUID.randomUUID().toString().replaceAll("-", ""));
		head.setRECEIVER(InterfaceStringUtils.MES_RECEIVER);
		head.setSENDER(InterfaceStringUtils.SENDER);
		head.setTLGID("WMStoSRM_Deliverynote");
		head.setTLGNAME(InterfaceStringUtils.MESDELIVERYNOTE);
		info.setHeader(head);
		info.setStrucList(item);
		data.setP(info);
		return stub.sI_SRM2MES_DeliveryOrderInfo_OUT(data);
	}

	/**
	 * sap生产性物料发货状态接口
	 * 
	 * @param type0
	 * @throws RemoteException
	 */
	public static MT_POSTATUS_RES toPostatus(POSTATUS_REQ_type0[] type0s) throws RemoteException {
		SI_SRM2SAP_POSTATUS_OUTServiceStub stub = new SI_SRM2SAP_POSTATUS_OUTServiceStub(
				InterfaceStringUtils.SAPPOSTATUS);
		Options options = stub._getServiceClient().getOptions();
		Authenticator auth = new Authenticator();
		auth.setUsername(InterfaceStringUtils.SAPUSERNAME);
		auth.setPassword(InterfaceStringUtils.SAPPASSWORD);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		options.setProperty(HTTPConstants.CHUNKED, "false");
		MT_POSTATUS_REQ mT_POSTATUS_REQ2 = new MT_POSTATUS_REQ();
		DT_POSTATUS_REQ param = new DT_POSTATUS_REQ();
		cn.jcloud.srm.client.sap.postatus.DT_HEADER dt_HEADER = new cn.jcloud.srm.client.sap.postatus.DT_HEADER();
		dt_HEADER.setBUSID("");
		dt_HEADER.setDTSEND(new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date()));
		dt_HEADER.setFREEUSE("");
		dt_HEADER.setMSGID(InterfaceStringUtils.SENDER + UUID.randomUUID().toString().replaceAll("-", ""));
		dt_HEADER.setRECEIVER(InterfaceStringUtils.RECEIVER);
		dt_HEADER.setSENDER(InterfaceStringUtils.SENDER);
		dt_HEADER.setTLGID("IF_SRM2SAP_POSTATUS");
		dt_HEADER.setTLGNAME(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM);
		param.setTP_HEADER(dt_HEADER);
		param.setPOSTATUS_REQ(type0s);
		mT_POSTATUS_REQ2.setMT_POSTATUS_REQ(param);
		return stub.sI_SRM2SAP_POSTATUS_OUT(mT_POSTATUS_REQ2);
	}

	/**
	 * sap生产性物料采购结算信息确认接口
	 * 
	 * @param type0
	 * @throws RemoteException
	 */
	public static void toAcsettleConfirm(ACSETTLE_CONFIRM_REQ_type0 type0) throws RemoteException {
		SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub stub = new SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub(
				InterfaceStringUtils.SAPACSETTLECONFIRM);
		Options options = stub._getServiceClient().getOptions();
		Authenticator auth = new Authenticator();
		auth.setUsername(InterfaceStringUtils.SAPUSERNAME);
		auth.setPassword(InterfaceStringUtils.SAPPASSWORD);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		options.setProperty(HTTPConstants.CHUNKED, "false");
		MT_ACSETTLE_CF_REQ mT_ACSETTLE_CF_REQ1 = new MT_ACSETTLE_CF_REQ();
		DT_ACSETTLE_CF_REQ dt_ACSETTLE_CF_REQ = new DT_ACSETTLE_CF_REQ();
		dt_ACSETTLE_CF_REQ.setACSETTLE_CONFIRM_REQ(new ACSETTLE_CONFIRM_REQ_type0[] { type0 });
		DT_HEADER dt_HEADER = new DT_HEADER();
		dt_HEADER.setBUSID("");
		dt_HEADER.setDTSEND(new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date()));
		dt_HEADER.setFREEUSE("");
		dt_HEADER.setMSGID(InterfaceStringUtils.SENDER + UUID.randomUUID().toString().replaceAll("-", ""));
		dt_HEADER.setRECEIVER(InterfaceStringUtils.RECEIVER);
		dt_HEADER.setSENDER(InterfaceStringUtils.SENDER);
		dt_HEADER.setTLGID("IF_SRM2SAP_ACSETTLE_CONFIRM");
		dt_HEADER.setTLGNAME(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM);
		dt_ACSETTLE_CF_REQ.setTP_HEADER(dt_HEADER);
		mT_ACSETTLE_CF_REQ1.setMT_ACSETTLE_CF_REQ(dt_ACSETTLE_CF_REQ);
		stub.sI_SRM2SAP_ACSETTLE_CF_REQ_OUT(mT_ACSETTLE_CF_REQ1);
	}

	/**
	 * sap生产性物料主数据接收接口
	 * 
	 * @param type0
	 * @throws RemoteException
	 */
	public static void toMaterial(MATERIAL_REQ_type0 type0) throws RemoteException {
		SI_ALL2SAP_MATERIAL_REQUEST_OUTServiceStub stub = new SI_ALL2SAP_MATERIAL_REQUEST_OUTServiceStub(
				InterfaceStringUtils.SAPMATERIAL);
		Options options = stub._getServiceClient().getOptions();
		Authenticator auth = new Authenticator();
		auth.setUsername(InterfaceStringUtils.SAPUSERNAME);
		auth.setPassword(InterfaceStringUtils.SAPPASSWORD);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		options.setProperty(HTTPConstants.CHUNKED, "false");
		MT_MATERIAL_REQUEST mT_MATERIAL_SRM_REQ1 = new MT_MATERIAL_REQUEST();
		DT_MATERIAL_REQUEST dt_MATERIAL_SRM_REQ = new DT_MATERIAL_REQUEST();
		dt_MATERIAL_SRM_REQ.setMATERIAL_REQ(type0);
		cn.jcloud.srm.client.sap.material.DT_HEADER dt_HEADER = new cn.jcloud.srm.client.sap.material.DT_HEADER();
		dt_HEADER.setBUSID("");
		dt_HEADER.setDTSEND(new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date()));
		dt_HEADER.setFREEUSE("");
		dt_HEADER.setMSGID(InterfaceStringUtils.SENDER + UUID.randomUUID().toString().replaceAll("-", ""));
		dt_HEADER.setRECEIVER(InterfaceStringUtils.RECEIVER);
		dt_HEADER.setSENDER(InterfaceStringUtils.SENDER);
		dt_HEADER.setTLGID("IF_SRM2SAP_MATERIAL");
		dt_HEADER.setTLGNAME(InterfaceStringUtils.IFSRM2SAPMATERIAL);

		dt_MATERIAL_SRM_REQ.setTP_HEADER(dt_HEADER);
		mT_MATERIAL_SRM_REQ1.setMT_MATERIAL_REQUEST(dt_MATERIAL_SRM_REQ);
		stub.sI_ALL2SAP_MATERIAL_REQUEST_OUT(mT_MATERIAL_SRM_REQ1);
	}

	/**
	 * sap生产性物料采购信息记录接收接口
	 * 
	 * @param type0s
	 * @return
	 * @throws RemoteException
	 */
	public static MT_INFO_RECORD_RES toRecord(INFO_RECORD_REQ_type0[] type0s) throws RemoteException {
		SI_SRM2SAP_INFO_RECORD_OUTServiceStub stub = new SI_SRM2SAP_INFO_RECORD_OUTServiceStub(
				InterfaceStringUtils.SAPRECORD);
		Options options = stub._getServiceClient().getOptions();
		Authenticator auth = new Authenticator();
		auth.setUsername(InterfaceStringUtils.SAPUSERNAME);
		auth.setPassword(InterfaceStringUtils.SAPPASSWORD);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		options.setProperty(HTTPConstants.CHUNKED, "false");
		options.setTimeOutInMilliSeconds(60000L);
		MT_INFO_RECORD_REQ mT_INFO_RECORD_REQ2 = new MT_INFO_RECORD_REQ();
		DT_INFO_RECORD_REQ dt_INFO_RECORD_RES = new DT_INFO_RECORD_REQ();
		dt_INFO_RECORD_RES.setINFO_RECORD_REQ(type0s);
		cn.jcloud.srm.client.sap.record.DT_HEADER dt_HEADER = new cn.jcloud.srm.client.sap.record.DT_HEADER();
		dt_HEADER.setBUSID("");
		dt_HEADER.setDTSEND(new SimpleDateFormat("yyyyMMddhhmmssSSS").format(new Date()));
		dt_HEADER.setFREEUSE("");
		dt_HEADER.setMSGID(InterfaceStringUtils.SENDER + UUID.randomUUID().toString().replaceAll("-", ""));
		dt_HEADER.setRECEIVER(InterfaceStringUtils.RECEIVER);
		dt_HEADER.setSENDER(InterfaceStringUtils.SENDER);
		dt_HEADER.setTLGID("IF_SRM2SAP_INFO.RECORD");
		dt_HEADER.setTLGNAME(InterfaceStringUtils.IFSRM2SAPINFORECORD);
		dt_INFO_RECORD_RES.setTP_HEADER(dt_HEADER);
		mT_INFO_RECORD_REQ2.setMT_INFO_RECORD_REQ(dt_INFO_RECORD_RES);
		return stub.sI_SRM2SAP_INFO_RECORD_OUT(mT_INFO_RECORD_REQ2);
	}

	/**
	 * OA：鉴权接口
	 * 
	 * @return token
	 * @throws ServiceException
	 * @throws RemoteException
	 */
	public static UserToken toAuthority() throws RemoteException, ServiceException {
		Authenticate req = new Authenticate();
		req.setUserName(InterfaceStringUtils.OAUSERNAME);
		req.setPassword(InterfaceStringUtils.OAPASSWORD);

		AuthorityServiceStub stub = null;
		try {
			stub = new AuthorityServiceStub(InterfaceStringUtils.OAAUTHORITY);
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		AuthenticateResponse response = null;
		response = stub.authenticate(req);
		return response.get_return();
	}

	/**
	 * BPM集成接口>发起表单流程
	 * 
	 * @param subject
	 * @param attachments
	 * @param param
	 * @param relateDoc
	 * @param data
	 * 
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 * @throws cn.jcloud.srm.client.oa.bpm.ServiceException
	 */
	public static ServiceResponse toLaunchFormCollaboration(String senderLoginName, String templateCode, String subject,
			String data, long[] attachments, String param, String relateDoc)
			throws RemoteException, ServiceException, cn.jcloud.srm.client.oa.bpm.ServiceException {
		UserToken token = toAuthority();
		BPMServiceStub stub = new BPMServiceStub(InterfaceStringUtils.OABPM);
		LaunchFormCollaboration collaboration = new LaunchFormCollaboration();
		collaboration.setToken(token.getId());
		collaboration.setData(data);
		collaboration.setSenderLoginName(senderLoginName);
		collaboration.setTemplateCode(templateCode);
		collaboration.setSubject(subject);
		collaboration.setAttachments(attachments);
		collaboration.setParam(param);
		collaboration.setRelateDoc(relateDoc);
		LaunchFormCollaborationResponse response = stub.launchFormCollaboration(collaboration);
		return response.get_return();
	}

	/**
	 * BPM集成接口>发起html正文流程
	 * 
	 * @param senderLoginName
	 * @param templateCode
	 * @param subject
	 * @param bodyContent
	 * @param attachments
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public static ServiceResponse toLaunchHtmlCollaboration(String senderLoginName, String templateCode, String subject,
			String bodyContent, long[] attachments) throws RemoteException, ServiceException {
		UserToken token = toAuthority();
		BPMServiceStub stub = new BPMServiceStub(InterfaceStringUtils.OABPM);
		LaunchHtmlCollaboration collaboration = new LaunchHtmlCollaboration();
		collaboration.setToken(token.getId());
		collaboration.setSenderLoginName(senderLoginName);
		collaboration.setTemplateCode(templateCode);
		collaboration.setSubject(subject);
		collaboration.setBodyContent(bodyContent);
		collaboration.setAttachments(attachments);
		LaunchHtmlCollaborationResponse response = stub.launchHtmlCollaboration(collaboration);
		return response.get_return();
	}

	/**
	 * BPM集成接口>取得流程运转状态
	 * 
	 * @param flowId
	 * @return
	 * @throws RemoteException
	 * @throws ServiceException
	 * @throws cn.jcloud.srm.client.oa.bpm.ServiceException
	 */
	public static long toGetFlowState(long flowId)
			throws RemoteException, ServiceException, cn.jcloud.srm.client.oa.bpm.ServiceException {
		UserToken token = toAuthority();
		BPMServiceStub stub = new BPMServiceStub(InterfaceStringUtils.OABPM);
		GetFlowState flowState = new GetFlowState();
		flowState.setToken(token.getId());
		flowState.setFlowId(flowId);
		GetFlowStateResponse response = stub.getFlowState(flowState);
		return response.get_return();
	}

	/**
	 * BPM集成接口>上传文件
	 * 
	 * @param senderLoginName
	 * @param info
	 * @return
	 * @throws IOException
	 * @throws ServiceException
	 */
	public static String toUploadService(String senderLoginName, FileInfo info, String pathHead)
			throws IOException, ServiceException {
		if (info == null || info.getFilePath() == null) {
			return "";
		}
		UserToken token = toAuthority();
		String result = "";
		DataOutputStream dos = null;
		DataInputStream input = null;
		try {
			URL preUrl = null;
			URLConnection uc = null;
			String BOUNDARY = "---------------------------7d4a6d158c9"; // 分隔符
			preUrl = new URL(
					InterfaceStringUtils.OAUPLOAD + "&senderLoginName=" + senderLoginName + "&token=" + token.getId());
			uc = preUrl.openConnection();
			HttpURLConnection hc = (HttpURLConnection) uc;
			hc.setDoOutput(true);
			hc.setDoInput(true);
			hc.setUseCaches(false);
			hc.setRequestProperty("connection", "Keep-Alive");
			hc.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
			hc.setRequestProperty("Charsert", "UTF-8");
			hc.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
			// hc.setRequestMethod("POST");
			input = new DataInputStream(new FileInputStream(pathHead + info.getFilePath()));

			StringBuffer sb = new StringBuffer();
			sb.append("--");
			sb.append(BOUNDARY);
			sb.append("\r\n");
			sb.append("Content-Disposition: form-data;name=\"file1\";filename=\"" + info.getFileName() + "\"\r\n");
			sb.append("Content-Type:application/octet-stream\r\n\r\n");

			byte[] end_data = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();// 定义最后数据分隔线
			dos = new DataOutputStream(hc.getOutputStream());
			dos.write(sb.toString().getBytes("utf-8"));
			int bytes = 0;
			byte[] bufferOut = new byte[1024];
			while ((bytes = input.read(bufferOut)) != -1) {
				dos.write(bufferOut, 0, bytes);
			}
			dos.write(end_data);
			dos.flush();
			dos.close();
			// 定义BufferedReader输入流来读取URL的响应
			BufferedReader reader = new BufferedReader(new InputStreamReader(hc.getInputStream(), "UTF-8"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				result += line;
			}
		} catch (IOException e) {
			throw new IOException(e);
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * OA发送协同消息
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public static String toOAMassage(OAMassage massage) throws Exception {
		String url = InterfaceStringUtils.OAMASSAGE;
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			String token = toToken();
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept","*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
			conn.setRequestProperty("Charsert", "UTF-8");
			conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
			conn.setRequestProperty("token", token);
			conn.setRequestMethod("POST");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(JSON.toJSONString(massage));
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			throw e;
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 获取OA协同消息token
	 * 
	 * @return
	 * @throws Exception 
	 */
	public static String toToken() throws Exception {
		String url = InterfaceStringUtils.OATOKEN;
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			throw new Exception("OA鉴权接口异常！"+e.getMessage());
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		result = result.split(":")[result.split(":").length - 1];
		result = result.substring(2, result.length() - 2);
		return result;
	}
}
