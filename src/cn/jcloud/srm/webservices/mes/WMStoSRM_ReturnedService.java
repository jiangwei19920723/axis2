package cn.jcloud.srm.webservices.mes;

import java.math.BigDecimal;
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

import cn.jcloud.srm.beans.mes.WMStoSRM_ReturnedRequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.RefundMsgResult;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.mes.AsnOutInfo;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.mes.AsnOutInfoService;
import cn.jcloud.srm.service.sap.MtlItemsService;

/**
 * @author 蒋维
 * @date 创建时间：2017年11月4日 上午10:04:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Service("WMStoSRM_ReturnedService")
@Scope("prototype")
public class WMStoSRM_ReturnedService {
	private static final Logger LOGGER = LoggerFactory.getLogger(WMStoSRM_ASNService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private MtlItemsService mtlItemsService;
	@Autowired
	private AsnOutInfoService service;
	@Autowired
	private WebServiceHandleException handleException;

	public RefundMsgResult WMStoSRM_ASN(Header header, List<WMStoSRM_ReturnedRequest> requests) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.WMSWMSTOSRMASNOUTPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.WMSWMSTOSRMASNOUT);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		List<AsnOutInfo> asnInInfos = new ArrayList<>();
		RefundMsgResult result = new RefundMsgResult();
		try {
			handleException.WMStoSRM_ReturnedHandle(requests);
			for (WMStoSRM_ReturnedRequest request : requests) {
				AsnOutInfo info = new AsnOutInfo();
				info.setAsn_id(request.getAsnid());
				info.setRefund_number(request.getRefund_number());
				info.setOut_number(BigDecimal.valueOf(Double.parseDouble(request.getReturn_quantity())));
				info.setMaterial_code(request.getMater_code());
				MtlItems item = mtlItemsService.getByCode(request.getMater_code());
				info.setMaterial_id(item.getItemId());
				info.setPurchasing_group(item.getPurchasing_group());;
				info.setMaterial_name(item.getDescriptions());
				info.setVendor_code(request.getSupplyer_code());
				VendorInfo vendorInfo = infoService.getByCode(request.getSupplyer_code());
				info.setVendor_id(vendorInfo.getVendorId());
				info.setVendor_name(vendorInfo.getVendorName());
				info.setUnit(request.getUnit());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
				info.setCreate_time(sdf.parse(request.getCreate_time()));
				asnInInfos.add(info);
			}
			service.saves(asnInInfos);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.WMSWMSTOSRMASNOUT, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			List<String> ids = new ArrayList<>();
			if (requests == null || requests.isEmpty()) {
				
			}else {
				ids.add(requests.get(0).getRefund_number());
			}
			result.setRefund_numbers(ids);
			result.setZmessage(e.getMessage());
			result.setZtype('0');
			return result;

		}
		LOGGER.info(InterfaceStringUtils.WMSWMSTOSRMASNOUT);
		state.setSyncEndDate(new Date());
		state.setOperationState("退货单号" + requests.get(0).getRefund_number() +"成功");
		stateService.save(state);
		List<String> ids = new ArrayList<>();
		ids.add(requests.get(0).getRefund_number());
		result.setRefund_numbers(ids);
		result.setZmessage("成功");
		result.setZtype('1');
		return result;
	}

}
