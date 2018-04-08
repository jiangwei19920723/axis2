package cn.jcloud.srm.beans.sap;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月7日 下午7:53:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class IfSRM2SAPAcgrRequest {
	private String docnum;
	private String lifnr;
	private String name;
	private String datus;
	private String asnNum;
	private List<IfSRM2SAPAcgrLineItem> list;
	private String freeUse1;
	private String freeUse2;
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;
	public String getDocnum() {
		return docnum;
	}
	public void setDocnum(String docnum) {
		this.docnum = docnum;
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

	public String getDatus() {
		return datus;
	}
	public void setDatus(String datus) {
		this.datus = datus;
	}
	public String getAsnNum() {
		return asnNum;
	}
	public void setAsnNum(String asnNum) {
		this.asnNum = asnNum;
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
	public List<IfSRM2SAPAcgrLineItem> getList() {
		return list;
	}
	public void setList(List<IfSRM2SAPAcgrLineItem> list) {
		this.list = list;
	}
	
	
	
}
