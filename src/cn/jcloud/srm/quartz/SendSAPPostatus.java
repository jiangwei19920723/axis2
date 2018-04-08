package cn.jcloud.srm.quartz;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jcloud.srm.client.sap.postatus.DT_POSTATUS_RES;
import cn.jcloud.srm.client.sap.postatus.MT_POSTATUS_RES;
import cn.jcloud.srm.client.sap.postatus.POSTATUS_REQ_type0;
import cn.jcloud.srm.client.sap.postatus.POSTATUS_RES_type0;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.WebServiceUtils;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem;
import cn.jcloud.srm.entity.sap.PoInfoPlanRise;
import cn.jcloud.srm.service.sap.PoInfoPlanLineItemService;
import cn.jcloud.srm.service.sap.PoInfoPlanRiseService;

/**
 * @author 蒋维
 * @date 创建时间：2017年11月16日 上午10:02:26
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class SendSAPPostatus {
	private static final Logger LOGGER = LoggerFactory.getLogger(SendSAPPostatus.class);
	@Autowired
	private PoInfoPlanRiseService riseService;
	@Autowired
	private PoInfoPlanLineItemService itemService;

	public void run() {
		List<PoInfoPlanLineItem> items = itemService.getByStates(0, 1);
		if (items == null || items.size() == 0) {
			return;
		} else {
			POSTATUS_REQ_type0[] type0s = new POSTATUS_REQ_type0[items.size()];
			for (int i = 0; i < type0s.length; i++) {
				POSTATUS_REQ_type0 type0 = new POSTATUS_REQ_type0();
				PoInfoPlanRise rise = riseService.getById(items.get(i).getHeadId());
				type0.setEBELN(rise.getPurchasePlanNumber());// 采购计划协议号
				type0.setEBELP(items.get(i).getPurchasePlanProjectNumber());// 采购计划协议行项目号
				type0.setEKORG(items.get(i).getLabType());// 采购组织
				type0.setMENGE("0");// 实发数量
				type0.setSTATUS("1");// 0:未发，1：已发
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				type0.setFREEUSE2(sdf.format(items.get(i).getDeliveryDate()));//要货日期
				type0.setFREEUSE1("" + items.get(i).getId());
				type0s[i] = type0;
			}
			try {
				MT_POSTATUS_RES res = WebServiceUtils.toPostatus(type0s);
				DT_POSTATUS_RES res2 = res.getMT_POSTATUS_RES();
				for (POSTATUS_RES_type0 type : res2.getPOSTATUS_RES()) {
					if ("S".equals(type.getZTYPE().toUpperCase())) {
						PoInfoPlanLineItem item = itemService.getById(Integer.parseInt(type.getFREEUSE1()));
						item.setState(1);
						itemService.update(item);
					}else {
						PoInfoPlanLineItem item = itemService.getById(Integer.parseInt(type.getFREEUSE1()));
						item.setState(9);
						itemService.update(item);
						LOGGER.info(InterfaceStringUtils.IFSRM2SAPPOSTATUS+",id:"+type.getFREEUSE1()+"msg:"+type.getZMESSAGE());
					}
				}
				LOGGER.info(InterfaceStringUtils.IFSRM2SAPPOSTATUS);
			} catch (RemoteException e) {
				LOGGER.error(InterfaceStringUtils.IFSRM2SAPPOSTATUS, e);
			}
		}
	}
}
