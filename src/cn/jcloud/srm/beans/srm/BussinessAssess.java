package cn.jcloud.srm.beans.srm;

/**
 * 公用评审对象
 * @author zhl
 * @time 2017年10月17日 上午11:01:46
 * @Description TODO
 */
public class BussinessAssess {
	
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
	
	public String getBusinessLevel() {
		return businessLevel;
	}
	public void setBusinessLevel(String businessLevel) {
		this.businessLevel = businessLevel;
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
}
