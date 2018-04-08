package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 配管通知
 * 
 * @author zhl
 * @time 2017年10月17日 下午8:11:10
 * @Description TODO
 */
public class PoFixedConfigNotice {
	private String theme;
	private String create_date;
	private String userful_time;
	private String pc_remark;
	private String config_info;
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

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getUserful_time() {
		return userful_time;
	}

	public void setUserful_time(String userful_time) {
		this.userful_time = userful_time;
	}

	public String getPc_remark() {
		return pc_remark;
	}

	public void setPc_remark(String pc_remark) {
		this.pc_remark = pc_remark;
	}

	public String getConfig_info() {
		return config_info;
	}

	public void setConfig_info(String config_info) {
		this.config_info = config_info;
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
