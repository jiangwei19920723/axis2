package cn.jcloud.srm.quartz;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jcloud.srm.client.sap.contract.CONTRACT_HEADER_type0;
import cn.jcloud.srm.client.sap.contract.CONTRACT_ITEMS_type0;
import cn.jcloud.srm.client.sap.contract.CONTRACT_RES_type0;
import cn.jcloud.srm.client.sap.contract.DT_CONTRACT_RES;
import cn.jcloud.srm.client.sap.contract.MT_CONTRACT_RES;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.WebServiceUtils;
import cn.jcloud.srm.entity.srm.VendorContract;
import cn.jcloud.srm.entity.srm.VendorContractMtl;
import cn.jcloud.srm.service.srm.VendorContractMtlService;
import cn.jcloud.srm.service.srm.VendorContractService;

/**
 * @author 蒋维
 * @date 创建时间：2017年11月10日 下午3:23:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class SendVendorContract {
	private static final Logger LOGGER = LoggerFactory.getLogger(SendVendorContract.class);
	@Autowired
	private VendorContractService contractService;
	@Autowired
	private VendorContractMtlService mtlService;

	public void run() {
		List<VendorContract> list = contractService.getByStatus(0);
		if (list.size() == 0) {
			return;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		CONTRACT_HEADER_type0[] types = new CONTRACT_HEADER_type0[1];
		for (int i = 0; i < list.size(); i++) {
			CONTRACT_HEADER_type0 type0 = new CONTRACT_HEADER_type0();
			type0.setDATA_ID("" + list.get(i).getId().longValue());
			type0.setSRM_CODE("CONTRACT" + list.get(i).getId().longValue());
			type0.setIHREZ(list.get(i).getContract_code());// SRM合同号
			type0.setEKORG(list.get(i).getEkorg());
			type0.setWERKS(list.get(i).getWerks());
			type0.setEKGRP(list.get(i).getEkgrp());
			type0.setLIFNR(list.get(i).getVendor_code());
			type0.setESOKZ(list.get(i).getEsokz());
			type0.setFREEUSE1(list.get(i).getPay_mode());
			type0.setDATBI(sdf.format(list.get(i).getBegin_date()));// 有限期从
			type0.setDATAB(sdf.format(list.get(i).getEnd_date()));// 有限期止
			List<VendorContractMtl> list2 = mtlService.getByHeadId(list.get(i).getId().longValue());
			CONTRACT_ITEMS_type0[] params = new CONTRACT_ITEMS_type0[list2.size()];
			for (int j = 0; j < list2.size(); j++) {
				CONTRACT_ITEMS_type0 type02 = new CONTRACT_ITEMS_type0();
				type02.setMATNR(list2.get(j).getMtl_code());
				type02.setKBETR(list2.get(j).getSingle_price());// 函税价
				type02.setEVERS("");
				type02.setMWSKZ(list2.get(j).getMwskz());// 税率
				params[j] = type02;
			}
			type0.setCONTRACT_ITEMS(params);
			types[0] = type0;
			try {
				MT_CONTRACT_RES result = WebServiceUtils.toContract(types);
				DT_CONTRACT_RES res = result.getMT_CONTRACT_RES();
				CONTRACT_RES_type0[] type0s = res.getCONTRACT_RES();
				String data_id = "";
				for (CONTRACT_RES_type0 type : type0s) {
					if (type.getZTYPE().toUpperCase().equals("S")) {
						VendorContract contract = contractService
								.getById(BigDecimal.valueOf(Long.parseLong(type.getDATA_ID())));
						contract.setSend_status(1);
						contractService.update(contract);
					} else {
						if (type.getDATA_ID() != data_id) {
							LOGGER.info(InterfaceStringUtils.IFSRM2SAPCONTRACT + " contract_id:" + type.getDATA_ID()
							+ " msg:" + type.getZMESSAGE());
							data_id = type.getDATA_ID();
						}
						VendorContract contract = contractService
								.getById(BigDecimal.valueOf(Long.parseLong(type.getDATA_ID())));
						contract.setSend_status(9);
						contractService.update(contract);
					}
				}
			} catch (RemoteException e) {
				LOGGER.error(InterfaceStringUtils.IFSRM2SAPCONTRACT, e);
			}
		}
		LOGGER.info(InterfaceStringUtils.IFSRM2SAPCONTRACT + " send:" + list.size() + "行");
	}
}
