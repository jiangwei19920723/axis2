package cn.jcloud.srm.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.jcloud.srm.beans.oa.OAMassage;
import cn.jcloud.srm.beans.oa.OAMsgResult;
import cn.jcloud.srm.beans.srm.ResultMsg;
import cn.jcloud.srm.beans.srm.tosap.AcsettleConfirmBean;
import cn.jcloud.srm.beans.srm.tosap.PostatusBean;
import cn.jcloud.srm.client.oa.authority.AuthorityServiceStub.UserToken;
import cn.jcloud.srm.client.oa.authority.ServiceException;
import cn.jcloud.srm.client.oa.bpm.BPMServiceStub.ServiceResponse;
import cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0;
import cn.jcloud.srm.client.sap.postatus.MT_POSTATUS_RES;
import cn.jcloud.srm.client.sap.postatus.POSTATUS_REQ_type0;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.Json2XmlUtils;
import cn.jcloud.srm.common.WebServiceUtils;
import cn.jcloud.srm.entity.FileInfo;
import cn.jcloud.srm.entity.SRMFlowState;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.service.FileInfoService;
import cn.jcloud.srm.service.SRMFlowStateService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.srmenum.SRMFlowType;

/**
 * srm系统调用（http协议）
 * 
 * @author 蒋维
 * @date 创建时间：2017年10月13日 上午9:52:04
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Controller
public class SRMController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SRMController.class);
	@Autowired
	private SRMFlowStateService flowStateService;
	@Autowired
	private FileInfoService fileInfoService;
	@Autowired
	private SynchronousStateService stateService;

	@GetMapping("login")
	public String login() {
		return "login";
	}

	/**
	 * 发起oa流程
	 * 
	 * @param datajson数据
	 * @param sender_name发起人
	 * @param flowType流程类型
	 * @param subject标题
	 * @param request
	 * @return
	 */
	@RequestMapping("flow")
	@ResponseBody
	public ResultMsg flow(String data, String sender_name, SRMFlowType flowType, String subject,
			HttpServletRequest request) {
		try {
			// 获取HTTP请求的输入流
			InputStream is = request.getInputStream();
			// 已HTTP请求输入流建立一个BufferedReader对象
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			// 读取HTTP请求内容
			String buffer = null;
			StringBuffer sb = new StringBuffer();
			while ((buffer = br.readLine()) != null) {
				// 在页面中显示读取到的请求参数
				sb.append(buffer + "\n");
			}
			LOGGER.info(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATION, sb.toString().trim());
		} catch (IOException e) {
			LOGGER.error(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATION, e);
		}
		// 状态保存
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		state.setInterfaceName(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATION);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		state.setSyncStartDate(new Date());

		ResultMsg msg = new ResultMsg();
		long[] fileFlowIds = null;
		String xml = null;
		try {
			List<Long> list = new ArrayList<>();
			// 文件上传1.得到方法名和id
			Map<String, long[]> map = Json2XmlUtils.getfileIds(data, flowType);
			// 获取方法名和OA返回来的fileId
			if (map != null) {
				for (String key : map.keySet()) {
					long[] values = map.get(key);
					for (int i = 0; i < values.length; i++) {
						if (values[i] == 0) {
							continue;
						}
						try {
							values[i] = upload(values[i], sender_name);
						} catch (Exception e) {
							LOGGER.error(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATION, e);
							String filecontent = "data:" + data + ";sender_name:" + sender_name + ";flowType:"
									+ flowType + ";subject:" + subject + "xml:" + xml;
							String filePath = FileUtils.createPath(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATIONPATH);
							FileUtils.createFile(filePath, filecontent);
							state.setJsonRoute(filePath);
							state.setSyncEndDate(new Date());
							state.setOperationState("上传文件失败:" + e.getMessage());
							stateService.save(state);
							msg.setError_msg("上传文件失败:" + e.getMessage());
							msg.setStatus(1);
							return msg;
						}
						list.add(values[i]);
					}
					map.put(key, values);
				}
			}
			if (flowType == SRMFlowType.PO_FIXED_INVITATION_TEC) {
				File file = FileUtils.handleExcel(data, flowType);
				String path = file.getPath();
				String fileName = "评分详情.xls";
				FileInfo info = new FileInfo();
				info.setFileName(fileName);
				info.setFilePath(path);
				String result = WebServiceUtils.toUploadService(sender_name, info, "");
				fileFlowIds = new long[list.size() + 1];
				for (int i = 0; i < list.size(); i++) {
					fileFlowIds[i] = list.get(i);
				}
				fileFlowIds[list.size()] = Long.parseLong(result);
			} else if (flowType == SRMFlowType.VENDOR_DOIN_BUSINESS_SCORE
					|| flowType == SRMFlowType.VENDOR_DOIN_LOGISTICS_SCORE
					|| flowType == SRMFlowType.VENDOR_DOIN_QUALITY_SCORE
					|| flowType == SRMFlowType.VENDOR_DOIN_TECHNOLOGY_SCORE) {
				String result = "";
				try {
					String filePath = FileUtils.toFilePath(data, flowType);
					FileInfo info = new FileInfo();
					if (flowType == SRMFlowType.VENDOR_DOIN_BUSINESS_SCORE) {
						info.setFileName("供应商考察商务打分详情.xls");
					} else if (flowType == SRMFlowType.VENDOR_DOIN_LOGISTICS_SCORE) {
						info.setFileName("供应商考察物流打分详情.xls");
					} else if (flowType == SRMFlowType.VENDOR_DOIN_QUALITY_SCORE) {
						info.setFileName("供应商考察质量打分详情.xls");
					} else {
						info.setFileName("供应商技术打分详情.xls");
					}
					info.setFilePath(filePath);
					result = WebServiceUtils.toUploadService(sender_name, info, "");
				} catch (Exception e) {
					throw new Exception("打分详情文件路径错误");
				}
				fileFlowIds = new long[list.size() + 1];
				for (int i = 0; i < list.size(); i++) {
					fileFlowIds[i] = list.get(i);
				}
				fileFlowIds[list.size()] = Long.parseLong(result);
			} else {
				if (list.size() > 0) {
					fileFlowIds = new long[list.size()];
					for (int i = 0; i < list.size(); i++) {
						fileFlowIds[i] = list.get(i);
					}
				}
			}
			xml = Json2XmlUtils.toXml(data, flowType, map);

		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATION, e);
			String filecontent = "data:" + data + ";sender_name:" + sender_name + ";flowType:" + flowType + ";subject:"
					+ subject + "xml:" + xml;
			String filePath = FileUtils.createPath(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATIONPATH);
			FileUtils.createFile(filePath, filecontent);
			state.setJsonRoute(filePath);
			state.setSyncEndDate(new Date());
			state.setOperationState("json格式错误:" + e.getMessage());
			stateService.save(state);
			msg.setError_msg("json格式错误:" + e.getMessage());
			msg.setStatus(1);
			return msg;
		}
		// 推送给oa
		ServiceResponse response = null;
		try {
			response = WebServiceUtils.toLaunchFormCollaboration(sender_name, flowType.getCode(), subject, xml,
					fileFlowIds, "0", null);
		} catch (RemoteException | ServiceException | cn.jcloud.srm.client.oa.bpm.ServiceException e) {
			LOGGER.error(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATION, e);
			String filecontent = "data:" + data + ";sender_name:" + sender_name + ";flowType:" + flowType + ";subject:"
					+ subject + "xml:" + xml;
			String filePath = FileUtils.createPath(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATIONPATH);
			FileUtils.createFile(filePath, filecontent);
			state.setJsonRoute(filePath);
			state.setSyncEndDate(new Date());
			state.setOperationState("发起OA流程失败" + e.getMessage());
			stateService.save(state);
			msg.setError_msg("发起OA流程失败" + e.getMessage());
			msg.setStatus(2);
			return msg;
		}
		if (response == null) {
			String filecontent = "data:" + data + ";sender_name:" + sender_name + ";flowType:" + flowType + ";subject:"
					+ subject + "xml:" + xml;
			String filePath = FileUtils.createPath(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATIONPATH);
			FileUtils.createFile(filePath, filecontent);
			state.setJsonRoute(filePath);
			state.setSyncEndDate(new Date());
			state.setOperationState("发起OA流程失败");
			stateService.save(state);
			msg.setError_msg("发起OA流程失败");
			msg.setStatus(2);
			return msg;
		} else if (response.getErrorMessage() != null) {
			String filecontent = "data:" + data + ";sender_name:" + sender_name + ";flowType:" + flowType + ";subject:"
					+ subject + "xml:" + xml;
			String filePath = FileUtils.createPath(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATIONPATH);
			FileUtils.createFile(filePath, filecontent);
			state.setJsonRoute(filePath);
			state.setSyncEndDate(new Date());
			state.setOperationState(response.getErrorMessage());
			stateService.save(state);
			msg.setError_msg(response.getErrorMessage());
			msg.setStatus(2);
			return msg;
		}
		if (response.getResult() != -1) {
			SRMFlowState flowState = new SRMFlowState();
			String filecontent = "data:" + data + ";sender_name:" + sender_name + ";flowType:" + flowType + ";subject:"
					+ subject + "xml:" + xml;
			String filePath = FileUtils.createPath(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATIONPATH);
			FileUtils.createFile(filePath, filecontent);
			state.setJsonRoute(filePath);
			flowState.setFlowId(response.getResult());
			flowState.setFlowType(flowType.toString());
			flowState.setCreate_time(new Date());
			flowState.setHandle(0);
			flowState.setSrmhandle(0);
			flowState.setFlowState(-1);
			flowStateService.save(flowState);
			state.setJsonRoute(filePath);
			state.setSyncEndDate(new Date());
			state.setOperationState("成功");
			stateService.save(state);
			msg.setStatus(0);
			msg.setFlow_id(response.getResult());
			return msg;
		}
		String filecontent = "data:" + data + ";sender_name:" + sender_name + ";flowType:" + flowType + ";subject:"
				+ subject + "xml:" + xml;
		String filePath = FileUtils.createPath(InterfaceStringUtils.SRMLAUNCHFORMCOLLABORATIONPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setSyncEndDate(new Date());
		state.setOperationState("发起OA流程失败流程id为-1");
		stateService.save(state);
		msg.setError_msg("发起OA流程失败流程id为-1");
		msg.setStatus(2);
		return msg;
	}

	/**
	 * 上传文件
	 * 
	 * @param fileId文件id
	 * @param sender_name
	 *            发起人
	 * @return
	 */
	@RequestMapping("upload")
	@ResponseBody
	public long upload(long fileId, String sender_name) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = "fileId:" + fileId + ";sender_name:" + sender_name;
		String filePath = FileUtils.createPath(InterfaceStringUtils.SRMUPLOADSERVICEPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setInterfaceName(InterfaceStringUtils.SRMUPLOADSERVICE);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		state.setSyncStartDate(new Date());

		// 推送给oa
		String result = null;
		try {
			FileInfo info = fileInfoService.getById(BigDecimal.valueOf(fileId));
			result = WebServiceUtils.toUploadService(sender_name, info, InterfaceStringUtils.SRMFILEPATH);
			state.setSyncEndDate(new Date());
			state.setOperationState("成功");
			stateService.save(state);
			LOGGER.info(InterfaceStringUtils.SRMUPLOADSERVICE);
		} catch (IOException | ServiceException e) {
			LOGGER.error(InterfaceStringUtils.SRMUPLOADSERVICE, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
		}
		if (result == null || "".equals(result)) {
			return 0;
		}
		return Long.parseLong(result);
	}

	/**
	 * 流程状态
	 * 
	 * @param flowId
	 *            oa文件id
	 * @return
	 */
	@RequestMapping("getFlowState")
	@ResponseBody
	public long getFlowState(long flowId) {
		long result = -1;
		try {
			result = WebServiceUtils.toGetFlowState(flowId);
			LOGGER.info(InterfaceStringUtils.SRMFLOWSTATE);
		} catch (RemoteException | ServiceException | cn.jcloud.srm.client.oa.bpm.ServiceException e) {
			LOGGER.error(InterfaceStringUtils.SRMFLOWSTATE, e);
		}
		return result;

	}

	/**
	 * sap生产性物料采购结算信息确认接口
	 * 
	 * @param type0
	 */
	@RequestMapping("toSAPAcsettleConfirm")
	@ResponseBody
	public void toSAPAcsettleConfirm(AcsettleConfirmBean bean) {
		String filecontent = JSON.toJSONString(bean);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRMPATH);
		FileUtils.createFile(filePath, filecontent);
		SynchronousState state = new SynchronousState();
		state.setJsonRoute(filePath);
		state.setCreateTime(new Date());
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM);
		state.setSyncOrAsyn(InterfaceStringUtils.ASYN);
		state.setSyncStartDate(new Date());
		try {
			ACSETTLE_CONFIRM_REQ_type0 type0 = new ACSETTLE_CONFIRM_REQ_type0();
			type0.setZ_BELNR(bean.getReceivingVoucher());// 收货凭证
			type0.setZ_BUKRS(bean.getCompanyCode());// 公司代码
			type0.setZ_BUZEI(bean.getReceivingLineItem());// 收货行项目
			type0.setZ_GJAHR(bean.getDocumentYear());// 凭证年度
			type0.setZ_LIFNR(bean.getVendorCode());// 供应商
			type0.setZ_STATUS("" + bean.getConfirm());// 确认状态 0拒绝 1确认
			type0.setZ_ZUUID(bean.getSettlementCode());// 结算编号
			WebServiceUtils.toAcsettleConfirm(type0);
			state.setOperationState("成功");
			LOGGER.info(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM);
		} catch (RemoteException e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM, e);
			state.setOperationState("失败");
		}
		state.setSyncEndDate(new Date());
		stateService.save(state);
	}

	/**
	 * sap生产性物料发货状态接口
	 * 
	 * @param type0s
	 * @return
	 */
	@RequestMapping("toSAPPostatus")
	@ResponseBody
	public MT_POSTATUS_RES toSAPPostatus(List<PostatusBean> beans) {
		String filecontent = JSON.toJSONString(beans);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPPOSTATUSPATH);
		FileUtils.createFile(filePath, filecontent);
		SynchronousState state = new SynchronousState();
		state.setJsonRoute(filePath);
		state.setCreateTime(new Date());
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPPOSTATUS);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		state.setSyncStartDate(new Date());
		MT_POSTATUS_RES result = null;
		try {
			POSTATUS_REQ_type0[] type0s = new POSTATUS_REQ_type0[beans.size()];
			for (int i = 0; i < type0s.length; i++) {
				type0s[i].setEBELN(beans.get(i).getPurchasePlanNumber());
				type0s[i].setEBELP(beans.get(i).getPurchasePlanProjectNumber());
				type0s[i].setEKORG(beans.get(i).getPoOrganization());
				type0s[i].setMENGE("" + beans.get(i).getNumber());
				type0s[i].setSTATUS("" + beans.get(i).getState());
			}
			result = WebServiceUtils.toPostatus(type0s);
			state.setOperationState("成功");
			LOGGER.info(InterfaceStringUtils.IFSRM2SAPPOSTATUS);
		} catch (RemoteException e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPPOSTATUS, e);
			state.setOperationState("失败");
		}
		state.setSyncEndDate(new Date());
		stateService.save(state);
		return result;
	}

	/**
	 * OA协同信息
	 * 
	 * @param massage
	 * @return
	 */
	@RequestMapping("toOAMassage")
	@ResponseBody
	public ResultMsg toOAMassage(OAMassage massage) {
		ResultMsg msg = new ResultMsg();
		String filecontent = JSON.toJSONString(massage);
		String filePath = FileUtils.createPath(InterfaceStringUtils.SRM2OAMASSAGEPATH);
		FileUtils.createFile(filePath, filecontent);
		SynchronousState state = new SynchronousState();
		state.setJsonRoute(filePath);
		state.setCreateTime(new Date());
		state.setInterfaceName(InterfaceStringUtils.SRM2OAMASSAGE);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		state.setSyncStartDate(new Date());
		OAMsgResult msgResult = null;
		try {
			String result = WebServiceUtils.toOAMassage(massage);
			JSONObject jsonObject = JSON.parseObject(result);
			Object object = JSONObject.toJavaObject(jsonObject, OAMsgResult.class);
			msgResult = (OAMsgResult) object;
			state.setOperationState("成功");
			LOGGER.info(InterfaceStringUtils.SRM2OAMASSAGE);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.SRM2OAMASSAGE, e);
			state.setOperationState("失败");
		}
		state.setSyncEndDate(new Date());
		stateService.save(state);
		msg.setError_msg(msgResult.getErrorMessage());
		msg.setStatus(msgResult.getResult() == -1 ? 0 : msgResult.getResult());
		return msg;
	}

	/**
	 * test OA 鉴权
	 * 
	 * @return
	 */
	@RequestMapping("toOAToken")
	@ResponseBody
	public String toOAToken() {
		UserToken token;
		try {
			token = WebServiceUtils.toAuthority();
			return token.getId();
		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
		}
		return "ERROR";
	}
}
