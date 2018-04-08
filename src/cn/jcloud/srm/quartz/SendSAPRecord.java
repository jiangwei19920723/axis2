package cn.jcloud.srm.quartz;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.jcloud.srm.client.sap.record.DT_INFO_RECORD_RES;
import cn.jcloud.srm.client.sap.record.INFO_RECORD_REQ_type0;
import cn.jcloud.srm.client.sap.record.INFO_RECORD_RES_type0;
import cn.jcloud.srm.client.sap.record.MT_INFO_RECORD_RES;
import cn.jcloud.srm.common.InterfaceStringUtils;
import cn.jcloud.srm.common.WebServiceUtils;
import cn.jcloud.srm.entity.srm.PoItemVendorRelation;
import cn.jcloud.srm.service.srm.PoItemVendorRelationService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月10日 下午2:36:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class SendSAPRecord {
	private static final Logger LOGGER = LoggerFactory.getLogger(SendSAPRecord.class);
	@Autowired
	private PoItemVendorRelationService service;
	public void run(){
		List<PoItemVendorRelation> list = service.getByStatus(0);
		if (list.size() == 0) {
			return;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		INFO_RECORD_REQ_type0[] type0s = new INFO_RECORD_REQ_type0[list.size()];
		for (int i = 0; i < list.size(); i++) {
			INFO_RECORD_REQ_type0 type0 = new INFO_RECORD_REQ_type0();
			type0.setDATA_ID(""+list.get(i).getId().longValue());
			type0.setDATAB(list.get(i).getEnd_date() == null? "99991231":sdf.format(list.get(i).getEnd_date()));//有效期至
			type0.setDATBI(sdf.format(list.get(i).getStart_date()));//有效期从
			if ("2".equals(list.get(i).getBase_factory())) {
				type0.setEKORG("2000");//采购组织
				type0.setWERKS("2000");//工厂
			}else {
				type0.setEKORG("2000");//采购组织
				type0.setWERKS("2000");//工厂
			}
			type0.setESOKZ("");//分类（0标准,1可记帐 ,2寄售,3分包合同,P管道   ）
			type0.setKBETR(list.get(i).getPrice().toString());//采购单价
			type0.setLIFNR(list.get(i).getVendor_code());//供应商编码
			type0.setMATNR(list.get(i).getItem_code());//物料编码
			type0s[i] = type0;
		}
		try {
			MT_INFO_RECORD_RES res = WebServiceUtils.toRecord(type0s);
			DT_INFO_RECORD_RES res2 =res.getMT_INFO_RECORD_RES();
			INFO_RECORD_RES_type0[] type0s2 = res2.getINFO_RECORD_RES();
			String data_id = "";
			for (INFO_RECORD_RES_type0 type : type0s2) {
				if (type.getZTYPE().toUpperCase().equals("S")) {
					PoItemVendorRelation relation = service.getById(BigDecimal.valueOf(Long.parseLong(type.getDATA_ID())));
					relation.setSend_status(1);
					service.update(relation);
				}else {
					if (type.getDATA_ID() != data_id) {
						LOGGER.info(InterfaceStringUtils.IFSRM2SAPINFORECORD+" relation_id:"+type.getDATA_ID()+" msg:"+type.getZMESSAGE());						
						data_id = type.getDATA_ID();
					}
					PoItemVendorRelation relation = service.getById(BigDecimal.valueOf(Long.parseLong(type.getDATA_ID())));
					relation.setSend_status(9);
					service.update(relation);
				}
			}
			LOGGER.info(InterfaceStringUtils.IFSRM2SAPINFORECORD+" send:"+list.size()+"行");
		} catch (RemoteException e) {
			LOGGER.error(InterfaceStringUtils.IFSRM2SAPINFORECORD,e);
		}
	}
}
