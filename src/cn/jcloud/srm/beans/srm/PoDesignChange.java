package cn.jcloud.srm.beans.srm;

import java.util.List;

/** 
 * 设变目标价格管理流程
 * @author  蒋维 
 * @date 创建时间：2017年10月17日 下午5:27:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PoDesignChange {
	private String price_code;
	private String car_type;
	private String create_by;
	private String create_time;
	private String skill_status;
	private String remark;
	private String invitation_id;
	private List<PoDesignChangeItems> items;
	public String getPrice_code() {
		return price_code;
	}
	public void setPrice_code(String price_code) {
		this.price_code = price_code;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getSkill_status() {
		return skill_status;
	}
	public void setSkill_status(String skill_status) {
		this.skill_status = skill_status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getInvitation_id() {
		return invitation_id;
	}
	public void setInvitation_id(String invitation_id) {
		this.invitation_id = invitation_id;
	}
	public List<PoDesignChangeItems> getItems() {
		return items;
	}
	public void setItems(List<PoDesignChangeItems> items) {
		this.items = items;
	}
	
}
