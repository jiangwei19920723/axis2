package cn.jcloud.srm.common;

import java.io.IOException;
import java.util.Properties;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月14日 下午3:30:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class InterfaceStringUtils {
	public static final String RECEIVER = getValue("/user.properties", "sap.receiver");
	public static final String MES_RECEIVER = getValue("/user.properties", "mes.receiver");
	public static final String SENDER=getValue("/user.properties", "srm.sender");
	public static final String SAPUSERNAME = getValue("/user.properties", "sap.username");
	public static final String SRMFILEPATH = getValue("/user.properties", "srm.filePath");
	public static final String OAUSERNAME = getValue("/user.properties", "oa.username");
	public static final String SAPPASSWORD = getValue("/user.properties", "sap.password");
	public static final String OAPASSWORD = getValue("/user.properties", "oa.password");
	public static final String OAAUTHORITY = getValue("/user.properties", "oa.authority");
	public static final String OABPM = getValue("/user.properties", "oa.bpm");
	public static final String OATOKEN = getValue("/user.properties", "oa.token");
	public static final String OAMASSAGE = getValue("/user.properties", "oa.massage");
	public static final String OAUPLOAD = getValue("/user.properties", "oa.upload");
	public static final String MES_DELIVERYNOTE = getValue("/user.properties", "mes.deliverynote");
	public static final String SAPPOSTATUS = getValue("/user.properties", "sap.postatus");
	public static final String SAPCONTRACT = getValue("/user.properties", "sap.contract");
	public static final String SAPACSETTLECONFIRM = getValue("/user.properties", "sap.acsettleConfirm");
	public static final String SAPMATERIAL = getValue("/user.properties", "sap.material");
	public static final String SAPACASN = getValue("/user.properties", "sap.acasn");
	public static final String SAPRECORD = getValue("/user.properties", "sap.record");
	public static final String SAPACSETTLE = getValue("/user.properties", "sap.acsettle");
	public static final String SAPVENDOR = getValue("/user.properties", "sap.vendor");
	public static final String SYNC = "同步";
	public static final String ASYN = "异步";
	public static final String IFSRM2SAPVENDOR = "供应商主数据接收接口";
	public static final String IFSRM2SAPVENDORPATH = "if_srm2sap_vendor";
	public static final String SRMLAUNCHFORMCOLLABORATION = "OA发起表单流程";
	public static final String SRMLAUNCHFORMCOLLABORATIONPATH = "srm_launch_form_collaboration";
	public static final String SRMUPLOADSERVICE = "OA文件上传";
	public static final String SRMUPLOADSERVICEPATH = "srm_upload_service";
	public static final String SRMFLOWSTATE = "OA流程状态";
	public static final String SRM2OAMASSAGE = "OA发送协同消息";
	public static final String SRM2OAMASSAGEPATH = "SRM2OA_MASSAGE";
	public static final String SRMFLOWSTATEPATH = "srm_flow_state";
	public static final String IFSRM2SAPINFORECORD = "SAP生产性物料采购信息记录接收接口";
	public static final String IFSRM2SAPINFORECORDPATH = "if_srm2sap_info_record";
	public static final String IFSRM2SAPDIPATCHLIST = "SAP生产性物料配送计划接口";
	public static final String IFSRM2SAPDIPATCHLISTPATH = "if_srm2sap_dipatch_list";
	public static final String IFSRM2SAPACSETTLE = "SAP生产性物料采购结算信息接口";
	public static final String IFSRM2SAPACSETTLEPATH = "if_srm2sap_acsettle";
	public static final String IFSRM2SAPACLAB1 = "SAP生产性物料采购计划发布发送接口1";
	public static final String IFSRM2SAPACLAB2 = "SAP生产性物料采购计划发布发送接口2";
	public static final String IFSRM2SAPACLABPATH = "if_srm2sap_aclab";
	public static final String IFSAP2SRMPOPATH = "if_sap2srm_po";
	public static final String IFSAP2SRMPO = "SAP生产性物料采购计划发布发送接口(试制)";
	public static final String IFSRM2SAPACINVOICE = "SAP生产性物料发票处理接口";
	public static final String IFSRM2SAPACINVOICEPATH = "if_srm2sap_acinvoice";
	public static final String IFSRM2SAPACSETTLECONFIRM = "SAP生产性物料采购结算信息确认接口";
	public static final String IFSRM2SAPACSETTLECONFIRMPATH = "if_srm2sap_acsettle_confirm";
	public static final String IFSRM2SAPACGR = "SAP生产性物料采购收货信息发送接口";
	public static final String IFSRM2SAPACGRPATH = "if_srm2sap_acgr";
	public static final String IFSRM2SAPMATERIAL = "SAP生产性物料主数据接收接口";
	public static final String IFSRM2SAPMATERIALPATH = "if_srm2sap_material";
	public static final String IFSRM2SAPACASN = "SAP生产性物料供应商发货信息接收接口";
	public static final String IFSRM2SAPACASNPATH = "if_srm2sap_acasn";
	public static final String IFSRM2SAPPOSTATUS = "SAP生产性物料发货状态接口";
	public static final String IFSRM2SAPPOSTATUSPATH = "if_srm2sap_postatus";
	public static final String IFSRM2SAPCONTRACT = "SAP采购合同接口";
	public static final String IFSRM2SAPCONTRACTPATH = "if_srm2sap_contract";
	public static final String VENDORFILEIO = "PLM设计件文件传输接口";
	public static final String VENDORFILEIOPATH = "vendor_file_io";
	public static final String WMSTOSRMMATERIALPLAN = "MES要料计划接口";
	public static final String WMSTOSRMMATERIALPLANPATH = "wms_to_srm_material_plan";
	public static final String WMSWMSTOSRMASN = "MES ASN收货单信息接口";
	public static final String WMSWMSTOSRMASNOUT = "MES ASN退货单信息接口";
	public static final String WMSWMSTOSRMASNOUTPATH = "wms_to_srm_asn_out";
	public static final String WMSWMSTOSRMASNPATH = "wms_to_srm_asn";
	public static final String MESDELIVERYNOTE = "MES送货单信息接口";
	public static final String MESDELIVERYNOTEPATH = "mes_deliverynote";
	
	public static String getValue(String propertyName,String name){
		Properties properties = new Properties();
    	try {
			properties.load(FileUtils.class.getResourceAsStream(propertyName));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	String value = properties.getProperty(name);
		return value;
	}
}
