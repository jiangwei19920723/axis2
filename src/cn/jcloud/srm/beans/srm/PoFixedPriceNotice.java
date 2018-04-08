package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 定价报告
 * 
 * @author zhl
 * @time 2017年10月17日 下午8:09:11
 * @Description TODO
 */
public class PoFixedPriceNotice {
	private String theme;
	private String begin_date;
	private String limited_duration;
	private String pfp_remark;
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

	public String getBegin_date() {
		return begin_date;
	}

	public void setBegin_date(String begin_date) {
		this.begin_date = begin_date;
	}

	public String getLimited_duration() {
		return limited_duration;
	}

	public void setLimited_duration(String limited_duration) {
		this.limited_duration = limited_duration;
	}

	public String getPfp_remark() {
		return pfp_remark;
	}

	public void setPfp_remark(String pfp_remark) {
		this.pfp_remark = pfp_remark;
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
