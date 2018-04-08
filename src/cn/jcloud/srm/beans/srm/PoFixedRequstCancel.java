package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 
 * 中止定点申请流程;
 * 
 * @author zhl
 * @time 2017年10月17日 下午6:49:21
 * @Description TODO
 */
public class PoFixedRequstCancel {
	private String theme;
	private String reason;
	private String create_by;
	private String car_type;
	private String base_factory;
	private String fixed_by;
	private String phone;
	private String fixed_dept;
	private String create_time;
	private String tec_review;
	private String remark;
	private String fixed_id;
	private String fixed_code;
	private String status;
	private List<PoFixedRequestItems> items;
	private List<PoFixedRequstVendors> vendors;

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getBase_factory() {
		return base_factory;
	}

	public void setBase_factory(String base_factory) {
		this.base_factory = base_factory;
	}

	public String getFixed_by() {
		return fixed_by;
	}

	public void setFixed_by(String fixed_by) {
		this.fixed_by = fixed_by;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFixed_dept() {
		return fixed_dept;
	}

	public void setFixed_dept(String fixed_dept) {
		this.fixed_dept = fixed_dept;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getTec_review() {
		return tec_review;
	}

	public void setTec_review(String tec_review) {
		this.tec_review = tec_review;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFixed_id() {
		return fixed_id;
	}

	public void setFixed_id(String fixed_id) {
		this.fixed_id = fixed_id;
	}

	public String getFixed_code() {
		return fixed_code;
	}

	public void setFixed_code(String fixed_code) {
		this.fixed_code = fixed_code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PoFixedRequestItems> getItems() {
		return items;
	}

	public void setItems(List<PoFixedRequestItems> items) {
		this.items = items;
	}

	public List<PoFixedRequstVendors> getVendors() {
		return vendors;
	}

	public void setVendors(List<PoFixedRequstVendors> vendors) {
		this.vendors = vendors;
	}

}
