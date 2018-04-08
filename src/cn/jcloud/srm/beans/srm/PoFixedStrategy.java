package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 定点策略流程
 * 
 * @author zhl
 * @time 2017年10月17日 下午6:52:36
 * @Description TODO
 */
public class PoFixedStrategy {
	private String car_type;
	private String base_factory;
	private String strategy_code;
	private String strategy_name;
	private String tec_review;
	private String strategy_by;
	private String strategy_time;
	private String strategy_remark;
	private String fixed_id;

	private List<PoFixedRequestItems> items;
	private List<PoFixedRequstVendors> vendors;

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

	public String getStrategy_code() {
		return strategy_code;
	}

	public void setStrategy_code(String strategy_code) {
		this.strategy_code = strategy_code;
	}

	public String getStrategy_name() {
		return strategy_name;
	}

	public void setStrategy_name(String strategy_name) {
		this.strategy_name = strategy_name;
	}

	public String getTec_review() {
		return tec_review;
	}

	public void setTec_review(String tec_review) {
		this.tec_review = tec_review;
	}

	public String getStrategy_by() {
		return strategy_by;
	}

	public void setStrategy_by(String strategy_by) {
		this.strategy_by = strategy_by;
	}

	public String getStrategy_time() {
		return strategy_time;
	}

	public void setStrategy_time(String strategy_time) {
		this.strategy_time = strategy_time;
	}

	public String getStrategy_remark() {
		return strategy_remark;
	}

	public void setStrategy_remark(String strategy_remark) {
		this.strategy_remark = strategy_remark;
	}

	public String getFixed_id() {
		return fixed_id;
	}

	public void setFixed_id(String fixed_id) {
		this.fixed_id = fixed_id;
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
