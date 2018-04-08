package cn.jcloud.srm.quartz;

import java.rmi.RemoteException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.WebServiceUtils;
import cn.jcloud.srm.entity.sap.FiSettlementInfo;
import cn.jcloud.srm.service.sap.FiSettlementInfoService;

/**
 * @author 蒋维
 * @date 创建时间：2017年11月16日 下午1:47:51
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class SendSAPconfirm {
	private static final Logger LOGGER = LoggerFactory.getLogger(SendSAPconfirm.class);
	@Autowired
	private FiSettlementInfoService service;

	public void run() {
		try {
			List<FiSettlementInfo> infos = service.getByStates("0", 1);
			if (infos.size() == 0) {
				return;
			} else {

				for (FiSettlementInfo info : infos) {
					ACSETTLE_CONFIRM_REQ_type0 type0 = new ACSETTLE_CONFIRM_REQ_type0();
					type0.setZ_BELNR(info.getReceivingVoucher());// 收货凭证
					type0.setZ_BUKRS(info.getCompanyCode());// 公司代码
					type0.setZ_BUZEI(info.getReceivingLineItem());// 收货行项目
					type0.setZ_GJAHR(info.getDocumentYear());// 凭证年度
					type0.setZ_LIFNR(info.getOm());// 供应商
					type0.setZ_STATUS("1");// 确认状态 0拒绝 1确认
					type0.setZ_ZUUID(info.getSettlementCode());// 结算编号
					WebServiceUtils.toAcsettleConfirm(type0);
				}

			}
			LOGGER.info(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM);
		} catch (RemoteException e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPACSETTLECONFIRM, e);
		}
	}
}
