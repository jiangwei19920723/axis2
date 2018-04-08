package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 合格通知书
 * 
 * @author zhl
 * @time 2017年10月17日 下午6:10:38
 * @Description TODO
 */
public class QualifiedNoticeInfo {

	private String theme;
	private String noticeCode;
	private String sendTime;
	private String qn_remark;
	private List<VendorDoinVendorInfo> vendors;

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getNoticeCode() {
		return noticeCode;
	}

	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getQn_remark() {
		return qn_remark;
	}

	public void setQn_remark(String remark) {
		this.qn_remark = remark;
	}

	public List<VendorDoinVendorInfo> getVendors() {
		return vendors;
	}

	public void setVendors(List<VendorDoinVendorInfo> vendors) {
		this.vendors = vendors;
	}

}
