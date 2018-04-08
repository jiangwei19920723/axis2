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

import cn.jcloud.srm.beans.sap.IfSRM2SAPAcgrLineItem;
import cn.jcloud.srm.beans.sap.IfSRM2SAPAcgrRequest;
import cn.jcloud.srm.common.FileUtils;
import cn.jcloud.srm.common.HeadUtils;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;
import cn.jcloud.srm.entity.SynchronousState;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.entity.sap.WsDeliverInfoLineItem;
import cn.jcloud.srm.entity.sap.WsDeliverInfoRise;
import cn.jcloud.srm.handleException.WebServiceHandleException;
import cn.jcloud.srm.service.HeadService;
import cn.jcloud.srm.service.SynchronousStateService;
import cn.jcloud.srm.service.VendorInfoService;
import cn.jcloud.srm.service.sap.MtlItemsService;
import cn.jcloud.srm.service.sap.WsDeliverInfoLineItemService;
import cn.jcloud.srm.service.sap.WsDeliverInfoRiseService;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月7日 下午7:08:50
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Service("AcgrService")
@Scope("prototype")
public class AcgrService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AcgrService.class);
	@Autowired
	private SynchronousStateService stateService;
	@Autowired
	private HeadService headService;
	@Autowired
	private WsDeliverInfoLineItemService itemService;
	@Autowired
	private WsDeliverInfoRiseService riseService;
	@Autowired
	private VendorInfoService infoService;
	@Autowired
	private MtlItemsService mtlItemsService;
	@Autowired
	private WebServiceHandleException handleException;

	public MsgResult ifSRM2SAPAcgr(Header header, List<IfSRM2SAPAcgrRequest> requests) {
		SynchronousState state = new SynchronousState();
		state.setCreateTime(new Date());
		String filecontent = JSON.toJSONString(requests);
		String filePath = FileUtils.createPath(InterfaceStringUtils.IFSRM2SAPACGRPATH);
		FileUtils.createFile(filePath, filecontent);
		state.setJsonRoute(filePath);
		state.setHeadId(HeadUtils.save(headService, header));
		state.setInterfaceName(InterfaceStringUtils.IFSRM2SAPACGR);
		state.setSyncOrAsyn(InterfaceStringUtils.SYNC);
		state.setSyncStartDate(new Date());
		MsgResult result = new MsgResult();
		try {
			handleException.ifSRM2SAPAcgrHandle(requests);
			List<WsDeliverInfoLineItem> items = new ArrayList<>();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			for (IfSRM2SAPAcgrRequest request : requests) {
				WsDeliverInfoRise rise = riseService.getByDocNumber(request.getDocnum());
				if (rise == null) {
					rise = new WsDeliverInfoRise();
					rise.setDocNumber(request.getDocnum());
					rise.setOmCode(request.getLifnr());
					VendorInfo info = infoService.getByCode(request.getLifnr());
					rise.setVendorId(info.getVendorId().intValue());
					rise.setOmName(info.getVendorName());
					rise.setReceiptDate(sdf.parse(request.getDatus()));
					rise.setAsnNumber(request.getAsnNum());
					rise.setCreate_time(new Date());
					riseService.save(rise);
				}
				for (IfSRM2SAPAcgrLineItem lineItem : request.getList()) {
					WsDeliverInfoLineItem item = new WsDeliverInfoLineItem();
					item.setOmCode(request.getLifnr());
					item.setMaterielCode(lineItem.getMatnr());
					MtlItems mtlItems = mtlItemsService.getByCode(lineItem.getMatnr());
					item.setMaterielId(mtlItems.getItemId());
					item.setPurchasing_group(mtlItems.getPurchasing_group());
					item.setReceiptVoucher(lineItem.getBelnr());
					item.setReceiptNumber(Float.parseFloat(lineItem.getMegr()));
					item.setPoPlanLineNumber(lineItem.getEbelp());
					item.setPoPlanNumber(lineItem.getEbeln());
					item.setHeadId(rise.getId());
					items.add(item);
				}
			}
			itemService.saves(items);
		} catch (Exception e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPACGR, e);
			state.setSyncEndDate(new Date());
			state.setOperationState(e.getMessage());
			stateService.save(state);
			result.setZtype('E');
			result.setZmessage(e.getMessage());
			return result;
		}
		LOGGER.info(InterfaceStringUtils.IFSRM2SAPACGR);
		state.setSyncEndDate(new Date());
		state.setOperationState("asnid：" + requests.get(0).getAsnNum() + "成功");
		stateService.save(state);
		result.setZtype('S');
		result.setZmessage("成功");
		return result;
	}
}
