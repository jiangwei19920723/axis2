package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 定点询价技术评审
 * 
 * @author zhl
 * @time 2017年10月17日 下午7:10:01
 * @Description TODO
 */
public class PoFixedInvitationTechnology {

	private String car_type;
	private String vendor_name;
	private String contact;
	private String telephone;
	private String vendor_code;
	private String tec_scheme_time;
	private String tec_total_scroe;
	private String vendor_id;
	private String invitation_id;
	private String re_vendor_id;
	private List<PoFixedInvitationTechnologyDetails> details;

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
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

	public String getVendor_code() {
		return vendor_code;
	}

	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}

	public String getTec_scheme_time() {
		return tec_scheme_time;
	}

	public void setTec_scheme_time(String tec_scheme_time) {
		this.tec_scheme_time = tec_scheme_time;
	}

	public String getTec_total_scroe() {
		return tec_total_scroe;
	}

	public void setTec_total_scroe(String tec_total_scroe) {
		this.tec_total_scroe = tec_total_scroe;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getInvitation_id() {
		return invitation_id;
	}

	public void setInvitation_id(String invitation_id) {
		this.invitation_id = invitation_id;
	}

	public String getRe_vendor_id() {
		return re_vendor_id;
	}

	public void setRe_vendor_id(String re_vendor_id) {
		this.re_vendor_id = re_vendor_id;
	}

	public List<PoFixedInvitationTechnologyDetails> getDetails() {
		return details;
	}

	public void setDetails(List<PoFixedInvitationTechnologyDetails> details) {
		this.details = details;
	}

}
