package cn.jcloud.srm.beans.srm.tosap;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月7日 上午8:51:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AcasnBean {
	private String purchasePlanNumber;//采购计划协议号
	private String purchasePlanProjectNumber;//采购计划协议行项目号
	private String vendorName;//供应商名称
	private String vendorCode;//供应商代码
	private String docNumber;//报文编号
	private String asn;//asn号
	private String deliverDate;//发货日期 yyyyMMdd
	private String deliverTime;//发货时间 hhmmss
	private List<AcasnItemBean> beans;
	public String getPurchasePlanNumber() {
		return purchasePlanNumber;
	}
	public void setPurchasePlanNumber(String purchasePlanNumber) {
		this.purchasePlanNumber = purchasePlanNumber;
	}
	public String getPurchasePlanProjectNumber() {
		return purchasePlanProjectNumber;
	}
	public void setPurchasePlanProjectNumber(String purchasePlanProjectNumber) {
		this.purchasePlanProjectNumber = purchasePlanProjectNumber;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getDocNumber() {
		return docNumber;
	}
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
	public String getAsn() {
		return asn;
	}
	public void setAsn(String asn) {
		this.asn = asn;
	}
	public String getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(String deliverDate) {
		this.deliverDate = deliverDate;
	}
	public String getDeliverTime() {
		return deliverTime;
	}
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	public List<AcasnItemBean> getBeans() {
		return beans;
	}
	public void setBeans(List<AcasnItemBean> beans) {
		this.beans = beans;
	}
	
	
}
