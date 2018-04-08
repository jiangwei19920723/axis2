package cn.jcloud.srm.beans.srm.tosap;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月7日 上午9:15:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class RecordBean {
	private String poOrganization;//采购组织
	private String factory;//工厂
	private String materialCode;//物料编码
	private String vendorCode;//物料编码
	private String classification;//分类
	private String poPrice;//采购单价
	private String startDate;//有效期从yyyyMMdd
	private String endDate;//有效期止yyyyMMdd
	public String getPoOrganization() {
		return poOrganization;
	}
	public void setPoOrganization(String poOrganization) {
		this.poOrganization = poOrganization;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getPoPrice() {
		return poPrice;
	}
	public void setPoPrice(String poPrice) {
		this.poPrice = poPrice;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
