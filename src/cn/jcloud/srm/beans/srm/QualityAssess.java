package cn.jcloud.srm.beans.srm;
/**
 * 
 * 质量评审
 * @author zhl
 * @time 2017年10月17日 下午3:18:34
 * @Description TODO
 */
public class QualityAssess {

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
