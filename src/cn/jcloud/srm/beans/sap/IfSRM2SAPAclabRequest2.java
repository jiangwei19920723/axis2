package cn.jcloud.srm.beans.sap;

import java.util.List;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����4:44:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class IfSRM2SAPAclabRequest2 {
	private String werks;
	private String ebeln;
	private String lifnr;
	private String name;
	private String docNum;
	private String labDate;
	private String lgort;
	private List<IfSRM2SAPAclabLineItem2> list;
	private String freeUse1;//工厂名称
	private String freeUse2;//单据类型：量产/试制
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;
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
	public String getDocNum() {
		return docNum;
	}
	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}
	public String getLabDate() {
		return labDate;
	}
	public void setLabDate(String labDate) {
		this.labDate = labDate;
	}
	public List<IfSRM2SAPAclabLineItem2> getList() {
		return list;
	}
	public void setList(List<IfSRM2SAPAclabLineItem2> list) {
		this.list = list;
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
	public String getEbeln() {
		return ebeln;
	}
	public void setEbeln(String ebeln) {
		this.ebeln = ebeln;
	}
	public String getLgort() {
		return lgort;
	}
	public void setLgort(String lgort) {
		this.lgort = lgort;
	}
	public String getWerks() {
		return werks;
	}
	public void setWerks(String werks) {
		this.werks = werks;
	}
	
	
}
