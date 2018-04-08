package cn.jcloud.srm.beans.sap;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月8日 上午9:34:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class IfSRM2SAPAcsettleRequest {
	private String zuuid;
	private String idNm;
	private String bukrs;
	private String werks;
	private String lifnr;
	private List<IfSRM2SAPAcsettleLineItem> list;
	private String freeUse1;//结算类型
	private String freeUse2;
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;
	public String getZuuid() {
		return zuuid;
	}
	public void setZuuid(String zuuid) {
		this.zuuid = zuuid;
	}
	public String getIdNm() {
		return idNm;
	}
	public void setIdNm(String idNm) {
		this.idNm = idNm;
	}
	public String getBukrs() {
		return bukrs;
	}
	public void setBukrs(String bukrs) {
		this.bukrs = bukrs;
	}
	public String getWerks() {
		return werks;
	}
	public void setWerks(String werks) {
		this.werks = werks;
	}
	public String getLifnr() {
		return lifnr;
	}
	public void setLifnr(String lifnr) {
		this.lifnr = lifnr;
	}
	public List<IfSRM2SAPAcsettleLineItem> getList() {
		return list;
	}
	public void setList(List<IfSRM2SAPAcsettleLineItem> list) {
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

}
