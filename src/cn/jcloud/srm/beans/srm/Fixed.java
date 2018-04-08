package cn.jcloud.srm.beans.srm;

/** 
 * 设计变更中止流程_设计变更信息
 * @author  蒋维 
 * @date 创建时间：2017年10月17日 下午5:13:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Fixed {
	private String change_code;
	private String car_type;
	private String change_date;
	private String change_basis;
	private String create_time;
	private String fixed_create_by;
	private String change_remark;
	private String change_id;
	public String getChange_code() {
		return change_code;
	}
	public void setChange_code(String change_code) {
		this.change_code = change_code;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getChange_date() {
		return change_date;
	}
	public void setChange_date(String change_date) {
		this.change_date = change_date;
	}
	public String getChange_basis() {
		return change_basis;
	}
	public void setChange_basis(String change_basis) {
		this.change_basis = change_basis;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getFixed_create_by() {
		return fixed_create_by;
	}
	public void setFixed_create_by(String fixed_create_by) {
		this.fixed_create_by = fixed_create_by;
	}
	public String getChange_remark() {
		return change_remark;
	}
	public void setChange_remark(String change_remark) {
		this.change_remark = change_remark;
	}
	public String getChange_id() {
		return change_id;
	}
	public void setChange_id(String change_id) {
		this.change_id = change_id;
	}
	
}
