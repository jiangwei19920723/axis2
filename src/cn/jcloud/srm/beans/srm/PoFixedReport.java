package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 定点报告
 * 
 * @author zhl
 * @time 2017年10月17日 下午8:05:39
 * @Description TODO
 */
public class PoFixedReport {
	private String theme;
	private String car_type;
	private String pr_remark;
	private String report_id;
	private String invitation_id;
	private String invitation_code;
	private String strategy_code;
	private String fixed_code;

	private List<PoFixedReportAutherItems> items;

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getPr_remark() {
		return pr_remark;
	}

	public void setPr_remark(String pr_remark) {
		this.pr_remark = pr_remark;
	}

	public String getReport_id() {
		return report_id;
	}

	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}

	public String getInvitation_id() {
		return invitation_id;
	}

	public void setInvitation_id(String invitation_id) {
		this.invitation_id = invitation_id;
	}

	public String getInvitation_code() {
		return invitation_code;
	}

	public void setInvitation_code(String invitation_code) {
		this.invitation_code = invitation_code;
	}

	public String getStrategy_code() {
		return strategy_code;
	}

	public void setStrategy_code(String strategy_code) {
		this.strategy_code = strategy_code;
	}

	public String getFixed_code() {
		return fixed_code;
	}

	public void setFixed_code(String fixed_code) {
		this.fixed_code = fixed_code;
	}

	public List<PoFixedReportAutherItems> getItems() {
		return items;
	}

	public void setItems(List<PoFixedReportAutherItems> items) {
		this.items = items;
	}

}
