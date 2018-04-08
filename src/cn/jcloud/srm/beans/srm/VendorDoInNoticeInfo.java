package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 
 * 考察申请准入通知
 * 
 * @author zhl
 * @time 2017年10月17日 下午4:28:13
 * @Description TODO
 */
public class VendorDoInNoticeInfo {
	private String theme;
	private String noticeCode;
	private String sendTime;
	private String term;
	private String remark;
	private String noticeId;
	private String createBy;
	private String createTime;
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
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public List<VendorDoinVendorInfo> getVendors() {
		return vendors;
	}
	public void setVendors(List<VendorDoinVendorInfo> vendors) {
		this.vendors = vendors;
	}
}
