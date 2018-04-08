package cn.jcloud.srm.beans.cs.sap;

import java.util.List;

/**
* @author 蒋维
* @date 创建时间：2018年4月3日 下午3:43:55
* @version 1.0
*/
public class IF_SAP2SRM_PORequest {
	private String yw_typpe;
	private String lifnr;
	private String name;
	private String docnum;
	private String labdate;
	private String ebeln;
	private String cdate;
	private String ctime;
	private List<IF_SAP2SRM_PORequestItem> items;
	private String freeUse1;//采购组织（2021-新能源；2022-燃油车；2010-星沙；3010-君泰）
	private String freeUse2;//采购组
	private String freeUse3;//发布日期
	private String freeUse4;//发布人员
	private String freeUse5;//订单类型：采购订单类型【NB-标准;RB-退货；SH-售后备件；SZ-试制】+备货计划B
	public String getYw_typpe() {
		return yw_typpe;
	}
	public void setYw_typpe(String yw_typpe) {
		this.yw_typpe = yw_typpe;
	}
	public String getLifnr() {
		return lifnr;
	}
	public void setLifnr(String lifnr) {
		this.lifnr = lifnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocnum() {
		return docnum;
	}
	public void setDocnum(String docnum) {
		this.docnum = docnum;
	}
	public String getLabdate() {
		return labdate;
	}
	public void setLabdate(String labdate) {
		this.labdate = labdate;
	}
	public String getEbeln() {
		return ebeln;
	}
	public void setEbeln(String ebeln) {
		this.ebeln = ebeln;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public List<IF_SAP2SRM_PORequestItem> getItems() {
		return items;
	}
	public void setItems(List<IF_SAP2SRM_PORequestItem> items) {
		this.items = items;
	}
	public String getFreeUse1() {
		return freeUse1;
	}
	public void setFreeUse1(String freeUse1) {
		this.freeUse1 = freeUse1;
	}
	public String getFreeUse2() {
		return freeUse2;
	}
	public void setFreeUse2(String freeUse2) {
		this.freeUse2 = freeUse2;
	}
	public String getFreeUse3() {
		return freeUse3;
	}
	public void setFreeUse3(String freeUse3) {
		this.freeUse3 = freeUse3;
	}
	public String getFreeUse4() {
		return freeUse4;
	}
	public void setFreeUse4(String freeUse4) {
		this.freeUse4 = freeUse4;
	}
	public String getFreeUse5() {
		return freeUse5;
	}
	public void setFreeUse5(String freeUse5) {
		this.freeUse5 = freeUse5;
	}
	
}
