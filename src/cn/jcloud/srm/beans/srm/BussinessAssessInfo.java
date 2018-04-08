package cn.jcloud.srm.beans.srm;

import java.util.List;

public class BussinessAssessInfo {
	
	private String startTime;
	private String deadlineDate;
	private String status;
	private Long   vendorDoinApplyFile;
	private String remark;
	private String applyId;
	private String applydoId;
	private List<AssessSpecialVendorInfo> vendors;
	private List<AssessSpecialItems> items;
	private String filePath;
	/*private BussinessAssess assessinfo;*/
	private List<AssessItemsInfo> assessItems;
	/*
	 * 供应商自评汇总
	 */
	private String manageScoreVendor;
	private String vendorBaseInfoScoreVendor;
	private String costControlScoreVendor;
	private String financeScoreVendor;
	private String sumScoreVendor;
	
	/*
	 * 评审汇总
	 */
	private String manageScoreFactory;
	private String vendorBaseInfoScoreFactory;
	private String costControlScoreFactory;
	private String financeScoreFactory;
	private String sumScoreFactory;
	
	/*
	 * 评估信息
	 */
	private String businessAdvantage;
	private String businessInferiority;
	private String businessConclusion;
	private String businessYesOrNo;
	private String businessLevel;
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getDeadlineDate() {
		return deadlineDate;
	}
	public void setDeadlineDate(String deadlineDate) {
		this.deadlineDate = deadlineDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getVendorDoinApplyFile() {
		return vendorDoinApplyFile;
	}
	public void setVendorDoinApplyFile(Long vendorDoinApplyFile) {
		this.vendorDoinApplyFile = vendorDoinApplyFile;
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
	public String getApplydoId() {
		return applydoId;
	}
	public void setApplydoId(String applydoId) {
		this.applydoId = applydoId;
	}
	public List<AssessSpecialVendorInfo> getVendors() {
		return vendors;
	}
	public void setVendors(List<AssessSpecialVendorInfo> vendors) {
		this.vendors = vendors;
	}
	public String getManageScoreVendor() {
		return manageScoreVendor;
	}
	public void setManageScoreVendor(String manageScoreVendor) {
		this.manageScoreVendor = manageScoreVendor;
	}
	public String getVendorBaseInfoScoreVendor() {
		return vendorBaseInfoScoreVendor;
	}
	public void setVendorBaseInfoScoreVendor(String vendorBaseInfoScoreVendor) {
		this.vendorBaseInfoScoreVendor = vendorBaseInfoScoreVendor;
	}
	public String getCostControlScoreVendor() {
		return costControlScoreVendor;
	}
	public void setCostControlScoreVendor(String costControlScoreVendor) {
		this.costControlScoreVendor = costControlScoreVendor;
	}
	public String getFinanceScoreVendor() {
		return financeScoreVendor;
	}
	public void setFinanceScoreVendor(String financeScoreVendor) {
		this.financeScoreVendor = financeScoreVendor;
	}
	public String getSumScoreVendor() {
		return sumScoreVendor;
	}
	public void setSumScoreVendor(String sumScoreVendor) {
		this.sumScoreVendor = sumScoreVendor;
	}
	public String getManageScoreFactory() {
		return manageScoreFactory;
	}
	public void setManageScoreFactory(String manageScoreFactory) {
		this.manageScoreFactory = manageScoreFactory;
	}
	public String getVendorBaseInfoScoreFactory() {
		return vendorBaseInfoScoreFactory;
	}
	public void setVendorBaseInfoScoreFactory(String vendorBaseInfoScoreFactory) {
		this.vendorBaseInfoScoreFactory = vendorBaseInfoScoreFactory;
	}
	public String getCostControlScoreFactory() {
		return costControlScoreFactory;
	}
	public void setCostControlScoreFactory(String costControlScoreFactory) {
		this.costControlScoreFactory = costControlScoreFactory;
	}
	public String getFinanceScoreFactory() {
		return financeScoreFactory;
	}
	public void setFinanceScoreFactory(String financeScoreFactory) {
		this.financeScoreFactory = financeScoreFactory;
	}
	public String getSumScoreFactory() {
		return sumScoreFactory;
	}
	public void setSumScoreFactory(String sumScoreFactory) {
		this.sumScoreFactory = sumScoreFactory;
	}
	public String getBusinessAdvantage() {
		return businessAdvantage;
	}
	public void setBusinessAdvantage(String businessAdvantage) {
		this.businessAdvantage = businessAdvantage;
	}
	public String getBusinessInferiority() {
		return businessInferiority;
	}
	public void setBusinessInferiority(String businessInferiority) {
		this.businessInferiority = businessInferiority;
	}
	public String getBusinessConclusion() {
		return businessConclusion;
	}
	public void setBusinessConclusion(String businessConclusion) {
		this.businessConclusion = businessConclusion;
	}
	public String getBusinessYesOrNo() {
		return businessYesOrNo;
	}
	public void setBusinessYesOrNo(String businessYesOrNo) {
		this.businessYesOrNo = businessYesOrNo;
	}
	public String getBusinessLevel() {
		return businessLevel;
	}
	public void setBusinessLevel(String businessLevel) {
		this.businessLevel = businessLevel;
	}
	public List<AssessItemsInfo> getAssessItems() {
		return assessItems;
	}
	public void setAssessItems(List<AssessItemsInfo> assessItems) {
		this.assessItems = assessItems;
	}
	public List<AssessSpecialItems> getItems() {
		return items;
	}
	public void setItems(List<AssessSpecialItems> items) {
		this.items = items;
	}
	
	
}
