package cn.jcloud.srm.beans.srm.tosap;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月6日 下午7:55:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AcsettleConfirmBean {
	private String receivingVoucher;//收货凭证
	private String receivingLineItem;//收货行项目
	private String documentYear;//凭证年度
	private String vendorCode;//供应商编码
	private String settlementCode;//结算编码
	private int confirm;//确认状态 0拒绝 1确认
	private String companyCode;//公司代码
	public String getReceivingVoucher() {
		return receivingVoucher;
	}
	public void setReceivingVoucher(String receivingVoucher) {
		this.receivingVoucher = receivingVoucher;
	}
	public String getReceivingLineItem() {
		return receivingLineItem;
	}
	public void setReceivingLineItem(String receivingLineItem) {
		this.receivingLineItem = receivingLineItem;
	}
	public String getDocumentYear() {
		return documentYear;
	}
	public void setDocumentYear(String documentYear) {
		this.documentYear = documentYear;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getSettlementCode() {
		return settlementCode;
	}
	public void setSettlementCode(String settlementCode) {
		this.settlementCode = settlementCode;
	}
	public int getConfirm() {
		return confirm;
	}
	public void setConfirm(int confirm) {
		this.confirm = confirm;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	
}
