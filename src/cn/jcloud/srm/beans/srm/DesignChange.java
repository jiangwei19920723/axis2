package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 设计变更中止流程
 * 
 * @author 蒋维
 * @date 创建时间：2017年10月17日 下午5:11:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class DesignChange {
	private String reason;
	private String remark;
	private String create_by;
	private String cancel_task_inst_id;
	private String cancel_flow_id;
	private String change_id;
	private String change_code;
	private String car_type;
	private String change_date;
	private String change_basis;
	private String create_time;
	private String fixed_create_by;
	private String change_remark;
	private List<Items> items;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public String getCancel_task_inst_id() {
		return cancel_task_inst_id;
	}

	public void setCancel_task_inst_id(String cancel_task_inst_id) {
		this.cancel_task_inst_id = cancel_task_inst_id;
	}

	public String getCancel_flow_id() {
		return cancel_flow_id;
	}

	public void setCancel_flow_id(String cancel_flow_id) {
		this.cancel_flow_id = cancel_flow_id;
	}

	public String getChange_id() {
		return change_id;
	}

	public void setChange_id(String change_id) {
		this.change_id = change_id;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

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

}
