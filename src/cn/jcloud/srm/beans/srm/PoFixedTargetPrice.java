package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 定点目标价格管理流程
 * 
 * @author zhl
 * @time 2017年10月17日 下午6:57:15
 * @Description TODO
 */
public class PoFixedTargetPrice {
	private String price_code;
	private String car_type;
	private String create_by;
	private String create_time;
	private String skill_status;
	private String remark;
	private List<PoFixedTargetPriceItems> items;

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

	public List<PoFixedTargetPriceItems> getItems() {
		return items;
	}

	public void setItems(List<PoFixedTargetPriceItems> items) {
		this.items = items;
	}

}
