package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 技术评审
 * @author zhl
 * @time 2017年10月17日 下午3:18:04
 * @Description TODO
 */
public class TechnologyAssessInfo {

	private String startTime;
	private String deadlineDate;
	private String status;
	private Long vendorDoinApplyFile;
	private String ta_remark;
	private String applyId;
	private String applydoId;
	private List<AssessSpecialVendorInfo> vendors;
	private List<AssessSpecialItems> items;
	private String filePath;
	/*private TechnologyAssess technologyAssess;*/
	private List<AssessItemsInfo> assessItems;
	/*
	 *  自评信息
	 */
	private String	diathesisScoreVendor;
	private String	proportionScoreVendor;
	private String	designScoreVendor;
	private String	analysisScoreVendor;
	private String	evaluateScoreVendor;
	private String	sourceScoreVendor;
	private String	introductionScoreVendor;
	private String	dfmaScoreVendor;
	private String	sumScoreVendor;
	/*
	 * 评审信息
	 */
	private String	diathesisScoreFactory;
	private String	proportionScoreFactory;
	private String	designScoreFactory;
	private String	analysisScoreFactory;
	private String	evaluateScoreFactory;
	private String	sourceScoreFactory;
	private String	introductionScoreFactory;
	private String	dfmaScoreFactory;
	private String	sumScoreFactory;
	/*
	 * 评估信息
	 */
	private String	technologyAdvantage;
	private String	technologyInferiority;
	private String	technologyConclusion;
	private String	technologyLevel;
	private String	technologyYesOrNo;
	
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

	public String getTa_remark() {
		return ta_remark;
	}

	public void setTa_remark(String ta_remark) {
		this.ta_remark = ta_remark;
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

	public void setAssessSpecialVendorInfo(List<AssessSpecialVendorInfo> vendors) {
		this.vendors = vendors;
	}

	public List<AssessItemsInfo> getAssessItems() {
		return assessItems;
	}

	public void setAssessItems(List<AssessItemsInfo> assessItems) {
		this.assessItems = assessItems;
	}

	public String getDiathesisScoreVendor() {
		return diathesisScoreVendor;
	}

	public void setDiathesisScoreVendor(String diathesisScoreVendor) {
		this.diathesisScoreVendor = diathesisScoreVendor;
	}

	public String getProportionScoreVendor() {
		return proportionScoreVendor;
	}

	public void setProportionScoreVendor(String proportionScoreVendor) {
		this.proportionScoreVendor = proportionScoreVendor;
	}

	public String getDesignScoreVendor() {
		return designScoreVendor;
	}

	public void setDesignScoreVendor(String designScoreVendor) {
		this.designScoreVendor = designScoreVendor;
	}

	public String getAnalysisScoreVendor() {
		return analysisScoreVendor;
	}

	public void setAnalysisScoreVendor(String analysisScoreVendor) {
		this.analysisScoreVendor = analysisScoreVendor;
	}

	public String getEvaluateScoreVendor() {
		return evaluateScoreVendor;
	}

	public void setEvaluateScoreVendor(String evaluateScoreVendor) {
		this.evaluateScoreVendor = evaluateScoreVendor;
	}

	public String getSourceScoreVendor() {
		return sourceScoreVendor;
	}

	public void setSourceScoreVendor(String sourceScoreVendor) {
		this.sourceScoreVendor = sourceScoreVendor;
	}

	public String getIntroductionScoreVendor() {
		return introductionScoreVendor;
	}

	public void setIntroductionScoreVendor(String introductionScoreVendor) {
		this.introductionScoreVendor = introductionScoreVendor;
	}

	public String getDfmaScoreVendor() {
		return dfmaScoreVendor;
	}

	public void setDfmaScoreVendor(String dfmaScoreVendor) {
		this.dfmaScoreVendor = dfmaScoreVendor;
	}

	public String getSumScoreVendor() {
		return sumScoreVendor;
	}

	public void setSumScoreVendor(String sumScoreVendor) {
		this.sumScoreVendor = sumScoreVendor;
	}

	public String getDiathesisScoreFactory() {
		return diathesisScoreFactory;
	}

	public void setDiathesisScoreFactory(String diathesisScoreFactory) {
		this.diathesisScoreFactory = diathesisScoreFactory;
	}

	public String getProportionScoreFactory() {
		return proportionScoreFactory;
	}

	public void setProportionScoreFactory(String proportionScoreFactory) {
		this.proportionScoreFactory = proportionScoreFactory;
	}

	public String getDesignScoreFactory() {
		return designScoreFactory;
	}

	public void setDesignScoreFactory(String designScoreFactory) {
		this.designScoreFactory = designScoreFactory;
	}

	public String getAnalysisScoreFactory() {
		return analysisScoreFactory;
	}

	public void setAnalysisScoreFactory(String analysisScoreFactory) {
		this.analysisScoreFactory = analysisScoreFactory;
	}

	public String getEvaluateScoreFactory() {
		return evaluateScoreFactory;
	}

	public void setEvaluateScoreFactory(String evaluateScoreFactory) {
		this.evaluateScoreFactory = evaluateScoreFactory;
	}

	public String getSourceScoreFactory() {
		return sourceScoreFactory;
	}

	public void setSourceScoreFactory(String sourceScoreFactory) {
		this.sourceScoreFactory = sourceScoreFactory;
	}

	public String getIntroductionScoreFactory() {
		return introductionScoreFactory;
	}

	public void setIntroductionScoreFactory(String introductionScoreFactory) {
		this.introductionScoreFactory = introductionScoreFactory;
	}

	public String getDfmaScoreFactory() {
		return dfmaScoreFactory;
	}

	public void setDfmaScoreFactory(String dfmaScoreFactory) {
		this.dfmaScoreFactory = dfmaScoreFactory;
	}

	public String getSumScoreFactory() {
		return sumScoreFactory;
	}

	public void setSumScoreFactory(String sumScoreFactory) {
		this.sumScoreFactory = sumScoreFactory;
	}

	public String getTechnologyAdvantage() {
		return technologyAdvantage;
	}

	public void setTechnologyAdvantage(String technologyAdvantage) {
		this.technologyAdvantage = technologyAdvantage;
	}

	public String getTechnologyInferiority() {
		return technologyInferiority;
	}

	public void setTechnologyInferiority(String technologyInferiority) {
		this.technologyInferiority = technologyInferiority;
	}

	public String getTechnologyConclusion() {
		return technologyConclusion;
	}

	public void setTechnologyConclusion(String technologyConclusion) {
		this.technologyConclusion = technologyConclusion;
	}

	public String getTechnologyLevel() {
		return technologyLevel;
	}

	public void setTechnologyLevel(String technologyLevel) {
		this.technologyLevel = technologyLevel;
	}

	public String getTechnologyYesOrNo() {
		return technologyYesOrNo;
	}

	public void setTechnologyYesOrNo(String technologyYesOrNo) {
		this.technologyYesOrNo = technologyYesOrNo;
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
	
	
}
