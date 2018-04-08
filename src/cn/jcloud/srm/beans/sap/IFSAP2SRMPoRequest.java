package cn.jcloud.srm.beans.sap;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月26日 下午3:21:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class IFSAP2SRMPoRequest {
	private String po_type;
	private String yw_typpe;
	private String lifnr;
	private String name;
	private String docnum;
	private String labdate;
	private String ebeln;
	private String cdate;
	private String ctime;
	private List<IfSAP2SRMPoLineItem> items;
	private String freeUse1;
	private String freeUse2;
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;
	public String getPo_type() {
		return po_type;
	}
	public void setPo_type(String po_type) {
		this.po_type = po_type;
	}
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
	
	public List<IfSAP2SRMPoLineItem> getItems() {
		return items;
	}
	public void setItems(List<IfSAP2SRMPoLineItem> items) {
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
