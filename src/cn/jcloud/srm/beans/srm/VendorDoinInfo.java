package cn.jcloud.srm.beans.srm;

import java.util.List;

public class VendorDoinInfo {
	private String applyByName;
	private String applyDeptName;
	private String applyTime;
	private Long applyFile;
	private String applyCode;
	private String remark;
	private String applyId;
	private List<VendorDoinVendorInfo> vendors;
	public String getApplyByName() {
		return applyByName;
	}
	public void setApplyByName(String applyByName) {
		this.applyByName = applyByName;
	}
	public String getApplyDeptName() {
		return applyDeptName;
	}
	public void setApplyDeptName(String applyDeptName) {
		this.applyDeptName = applyDeptName;
	}
	public String getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public Long getApplyFile() {
		return applyFile;
	}
	public void setApplyFile(Long applyFile) {
		this.applyFile = applyFile;
	}
	public String getApplyCode() {
		return applyCode;
	}
	public void setApplyCode(String applyCode) {
		this.applyCode = applyCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getApplyId() {
		return applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public List<VendorDoinVendorInfo> getVendors() {
		return vendors;
	}
	public void setVendors(List<VendorDoinVendorInfo> vendors) {
		this.vendors = vendors;
	}
	
	
}
