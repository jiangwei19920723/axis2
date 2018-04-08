package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 物流评审
 * 
 * @author zhl
 * @time 2017年10月17日 下午1:47:17
 * @Description TODO
 */
public class LogisticsAssessInfo {

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
	/*private LogisticsAssess assessinfo;*/
	private List<AssessItemsInfo> assessItems;

	/*
	 * 自评信息
	 */
	private String messageScoreVendor;
	private String onTimeScoreVendor;
	private String packageScoreVendor;
	private String humanScoreVendor;
	private String capacityScoreVendor;
	private String storehouseScoreVendor;
	private String sumScoreVendor;
	/*
	 * 评审信息
	 */
	private String messageScoreFactory;
	private String onTimeScoreFactory;
	private String packageScoreFactory;
	private String humanScoreFactory;
	private String capacityScoreFactory;
	private String storehouseScoreFactory;
	private String sumScoreFactory;
	/*
	 * 评估信息
	 */
	private String logisticsAdvantage;
	private String logisticsInferiority;
	private String logisticsConclusion;
	private String logisticsLevel;
	private String logisticsYesOrNo;
	
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

	public List<AssessSpecialItems> getItems() {
		return items;
	}

	public void setItems(List<AssessSpecialItems> items) {
		this.items = items;
	}

	public String getMessageScoreVendor() {
		return messageScoreVendor;
	}

	public void setMessageScoreVendor(String messageScoreVendor) {
		this.messageScoreVendor = messageScoreVendor;
	}

	public String getOnTimeScoreVendor() {
		return onTimeScoreVendor;
	}

	public void setOnTimeScoreVendor(String onTimeScoreVendor) {
		this.onTimeScoreVendor = onTimeScoreVendor;
	}

	public String getPackageScoreVendor() {
		return packageScoreVendor;
	}

	public void setPackageScoreVendor(String packageScoreVendor) {
		this.packageScoreVendor = packageScoreVendor;
	}

	public String getHumanScoreVendor() {
		return humanScoreVendor;
	}

	public void setHumanScoreVendor(String humanScoreVendor) {
		this.humanScoreVendor = humanScoreVendor;
	}

	public String getCapacityScoreVendor() {
		return capacityScoreVendor;
	}

	public void setCapacityScoreVendor(String capacityScoreVendor) {
		this.capacityScoreVendor = capacityScoreVendor;
	}

	public String getStorehouseScoreVendor() {
		return storehouseScoreVendor;
	}

	public void setStorehouseScoreVendor(String storehouseScoreVendor) {
		this.storehouseScoreVendor = storehouseScoreVendor;
	}

	public String getSumScoreVendor() {
		return sumScoreVendor;
	}

	public void setSumScoreVendor(String sumScoreVendor) {
		this.sumScoreVendor = sumScoreVendor;
	}

	public String getMessageScoreFactory() {
		return messageScoreFactory;
	}

	public void setMessageScoreFactory(String messageScoreFactory) {
		this.messageScoreFactory = messageScoreFactory;
	}

	public String getOnTimeScoreFactory() {
		return onTimeScoreFactory;
	}

	public void setOnTimeScoreFactory(String onTimeScoreFactory) {
		this.onTimeScoreFactory = onTimeScoreFactory;
	}

	public String getPackageScoreFactory() {
		return packageScoreFactory;
	}

	public void setPackageScoreFactory(String packageScoreFactory) {
		this.packageScoreFactory = packageScoreFactory;
	}

	public String getHumanScoreFactory() {
		return humanScoreFactory;
	}

	public void setHumanScoreFactory(String humanScoreFactory) {
		this.humanScoreFactory = humanScoreFactory;
	}

	public String getCapacityScoreFactory() {
		return capacityScoreFactory;
	}

	public void setCapacityScoreFactory(String capacityScoreFactory) {
		this.capacityScoreFactory = capacityScoreFactory;
	}

	public String getStorehouseScoreFactory() {
		return storehouseScoreFactory;
	}

	public void setStorehouseScoreFactory(String storehouseScoreFactory) {
		this.storehouseScoreFactory = storehouseScoreFactory;
	}

	public String getSumScoreFactory() {
		return sumScoreFactory;
	}

	public void setSumScoreFactory(String sumScoreFactory) {
		this.sumScoreFactory = sumScoreFactory;
	}

	public String getLogisticsAdvantage() {
		return logisticsAdvantage;
	}

	public void setLogisticsAdvantage(String logisticsAdvantage) {
		this.logisticsAdvantage = logisticsAdvantage;
	}

	public String getLogisticsInferiority() {
		return logisticsInferiority;
	}

	public void setLogisticsInferiority(String logisticsInferiority) {
		this.logisticsInferiority = logisticsInferiority;
	}

	public String getLogisticsConclusion() {
		return logisticsConclusion;
	}

	public void setLogisticsConclusion(String logisticsConclusion) {
		this.logisticsConclusion = logisticsConclusion;
	}

	public String getLogisticsLevel() {
		return logisticsLevel;
	}

	public void setLogisticsLevel(String logisticsLevel) {
		this.logisticsLevel = logisticsLevel;
	}

	public String getLogisticsYesOrNo() {
		return logisticsYesOrNo;
	}

	public void setLogisticsYesOrNo(String logisticsYesOrNo) {
		this.logisticsYesOrNo = logisticsYesOrNo;
	}

	public List<AssessItemsInfo> getAssessItems() {
		return assessItems;
	}

	public void setAssessItems(List<AssessItemsInfo> assessItems) {
		this.assessItems = assessItems;
	}


}
