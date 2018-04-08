package cn.jcloud.srm.beans.srm;

/**
 * 定点申请供应商信息
 * 
 * @author zhl
 * @time 2017年10月17日 下午6:47:52
 * @Description TODO
 */
public class PoFixedRequstVendors {

	private String vendor_code;
	private String vendor_name;
	private String requstVendorsRemark;
	private String re_vendor_id;
	private String vendor_mail;
	private String contact;
	private String telephone;
	private String corporate;
	private String vendor_id;
	
	private String TecScore;
	private String tecPassStatus;
	public String getVendor_code() {
		return vendor_code;
	}

	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getRequstVendorsRemark() {
		return requstVendorsRemark;
	}

	public void setRequstVendorsRemark(String requstVendorsRemark) {
		this.requstVendorsRemark = requstVendorsRemark;
	}

	public String getRe_vendor_id() {
		return re_vendor_id;
	}

	public void setRe_vendor_id(String re_vendor_id) {
		this.re_vendor_id = re_vendor_id;
	}

	public String getVendor_mail() {
		return vendor_mail;
	}

	public void setVendor_mail(String vendor_mail) {
		this.vendor_mail = vendor_mail;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCorporate() {
		return corporate;
	}

	public void setCorporate(String corporate) {
		this.corporate = corporate;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getTecScore() {
		return TecScore;
	}

	public void setTecScore(String tecScore) {
		TecScore = tecScore;
	}

	public String getTecPassStatus() {
		return tecPassStatus;
	}

	public void setTecPassStatus(String tecPassStatus) {
		this.tecPassStatus = tecPassStatus;
	}
	
}
