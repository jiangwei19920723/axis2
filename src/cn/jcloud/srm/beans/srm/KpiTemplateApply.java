package cn.jcloud.srm.beans.srm;

import java.util.List;

/*
 * 评价申请表
 * **/
public class KpiTemplateApply {

	private String template_apply_code;
	private String apply_status;
	private String apply_dept;
	private String apply_by;
	private String apply_mail;
	private String apply_phone;
	private String last_state_time;
	private String vendor_code;
	private String vendor_name;
	private String vendor_mail;
	private String contact;
	private String vendor_telephone;
	private String template_adress;
	private String template;
	private Long template_file;
	private String car_type;
	private String template_type;
	private String template_time;
	/*
	 * 申诉说明
	 */
	private Long claim_file;
	private String claim_details;
	// 物料行
	private List<KpiApplyItems> kpiApplyItems;
	private List<KpiApplyMtlItems> kpiApplyMtlItems;

	public List<KpiApplyMtlItems> getKpiApplyMtlItems() {
		return kpiApplyMtlItems;
	}

	public void setKpiApplyMtlItems(List<KpiApplyMtlItems> kpiApplyMtlItems) {
		this.kpiApplyMtlItems = kpiApplyMtlItems;
	}

	public String getTemplate_apply_code() {
		return template_apply_code;
	}

	public void setTemplate_apply_code(String template_apply_code) {
		this.template_apply_code = template_apply_code;
	}

	public String getApply_status() {
		return apply_status;
	}

	public void setApply_status(String apply_status) {
		this.apply_status = apply_status;
	}

	public String getApply_dept() {
		return apply_dept;
	}

	public void setApply_dept(String apply_dept) {
		this.apply_dept = apply_dept;
	}

	public String getApply_by() {
		return apply_by;
	}

	public void setApply_by(String apply_by) {
		this.apply_by = apply_by;
	}

	public String getApply_mail() {
		return apply_mail;
	}

	public void setApply_mail(String apply_mail) {
		this.apply_mail = apply_mail;
	}

	public String getApply_phone() {
		return apply_phone;
	}

	public String getTemplate_time() {
		return template_time;
	}

	public void setTemplate_time(String template_time) {
		this.template_time = template_time;
	}

	public void setApply_phone(String apply_phone) {
		this.apply_phone = apply_phone;
	}

	public String getLast_state_time() {
		return last_state_time;
	}

	public void setLast_state_time(String last_state_time) {
		this.last_state_time = last_state_time;
	}

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

	public String getVendor_telephone() {
		return vendor_telephone;
	}

	public void setVendor_telephone(String vendor_telephone) {
		this.vendor_telephone = vendor_telephone;
	}

	public String getTemplate_adress() {
		return template_adress;
	}

	public void setTemplate_adress(String template_adress) {
		this.template_adress = template_adress;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Long getTemplate_file() {
		return template_file;
	}

	public void setTemplate_file(Long template_file) {
		this.template_file = template_file;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getTemplate_type() {
		return template_type;
	}

	public void setTemplate_type(String template_type) {
		this.template_type = template_type;
	}

	public List<KpiApplyItems> getKpiApplyItems() {
		return kpiApplyItems;
	}

	public void setKpiApplyItems(List<KpiApplyItems> kpiApplyItems) {
		this.kpiApplyItems = kpiApplyItems;
	}

	public Long getClaim_file() {
		return claim_file;
	}

	public void setClaim_file(Long claim_file) {
		this.claim_file = claim_file;
	}

	public String getClaim_details() {
		return claim_details;
	}

	public void setClaim_details(String claim_details) {
		this.claim_details = claim_details;
	}

}
