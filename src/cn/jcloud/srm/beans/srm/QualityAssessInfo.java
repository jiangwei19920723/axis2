package cn.jcloud.srm.beans.srm;

import java.util.List;
/**
 * 质量评审
 * @author zhl
 * @time 2017年10月17日 下午3:18:25
 * @Description TODO
 */
public class QualityAssessInfo {

	private String startTime;
	private String deadlineDate;
	private String status;
	private Long vendorDoinApplyFile;
	private String remark;
	private String applyId;
	private String applydoId;
	private List<AssessSpecialVendorInfo> vendors;
	private List<AssessSpecialItems> items;
	private List<AssessItemsInfo> assessItems;
	private String filePath;
	/*
	 * 自评信息
	 */
	private String planScoreVendor;
	private String processScoreVendor;
	private String sumScoreVendor;
	/*
	 * 评审信息
	 */
	private String planScoreFactory;
	private String processScoreFactory;
	private String sumScoreFactory;
	private String qualityFtatus;
	/*
	 * 评估信息
	 */
	private String qualityAdvantage;
	private String qualityInferiority;
	private String qualityConclusion;
	private String qualityLevel;
	private String qualityYesOrNo;
	
	/*private QualityAssess qualityAssess;*/
	
	public String getStartTime() {
		return startTime;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
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

	public List<AssessSpecialItems> getItems() {
		return items;
	}

	public void setItems(List<AssessSpecialItems> items) {
		this.items = items;
	}

	public List<AssessItemsInfo> getAssessItems() {
		return assessItems;
	}

	public void setAssessItems(List<AssessItemsInfo> assessItems) {
		this.assessItems = assessItems;
	}

	public String getPlanScoreVendor() {
		return planScoreVendor;
	}

	public void setPlanScoreVendor(String planScoreVendor) {
		this.planScoreVendor = planScoreVendor;
	}

	public String getProcessScoreVendor() {
		return processScoreVendor;
	}

	public void setProcessScoreVendor(String processScoreVendor) {
		this.processScoreVendor = processScoreVendor;
	}

	public String getSumScoreVendor() {
		return sumScoreVendor;
	}

	public void setSumScoreVendor(String sumScoreVendor) {
		this.sumScoreVendor = sumScoreVendor;
	}

	public String getPlanScoreFactory() {
		return planScoreFactory;
	}

	public void setPlanScoreFactory(String planScoreFactory) {
		this.planScoreFactory = planScoreFactory;
	}

	public String getProcessScoreFactory() {
		return processScoreFactory;
	}

	public void setProcessScoreFactory(String processScoreFactory) {
		this.processScoreFactory = processScoreFactory;
	}

	public String getSumScoreFactory() {
		return sumScoreFactory;
	}

	public void setSumScoreFactory(String sumScoreFactory) {
		this.sumScoreFactory = sumScoreFactory;
	}

	public String getQualityFtatus() {
		return qualityFtatus;
	}

	public void setQualityFtatus(String qualityFtatus) {
		this.qualityFtatus = qualityFtatus;
	}

	public String getQualityAdvantage() {
		return qualityAdvantage;
	}

	public void setQualityAdvantage(String qualityAdvantage) {
		this.qualityAdvantage = qualityAdvantage;
	}

	public String getQualityInferiority() {
		return qualityInferiority;
	}

	public void setQualityInferiority(String qualityInferiority) {
		this.qualityInferiority = qualityInferiority;
	}

	public String getQualityConclusion() {
		return qualityConclusion;
	}

	public void setQualityConclusion(String qualityConclusion) {
		this.qualityConclusion = qualityConclusion;
	}

	public String getQualityLevel() {
		return qualityLevel;
	}

	public void setQualityLevel(String qualityLevel) {
		this.qualityLevel = qualityLevel;
	}

	public String getQualityYesOrNo() {
		return qualityYesOrNo;
	}

	public void setQualityYesOrNo(String qualityYesOrNo) {
		this.qualityYesOrNo = qualityYesOrNo;
	}

	

}
