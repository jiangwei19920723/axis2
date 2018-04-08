package cn.jcloud.srm.beans.srm;

import java.util.List;
/**
 * 供应商冻结
 * @author zhl
 * @time 2017年10月17日 下午3:17:49
 * @Description TODO
 */
public class VendorEliminateInfo {

	private String vendorName;
	private String vendorCode;
	private String startScore;
	private String startLevel;
	private String nowScore;
	private String nowLevel;
	private String productBase;
	private String keyItem;
	private String advice;
	private String createDepart;
	private String createBy;
	private Long eliminateFile;
	private String remark;
	private String vendorId;
	private String vendorMail;
	private String corporate;
	private String contact;
	private String telephone;
	private List<ClassifyInfo> classifies;

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getStartScore() {
		return startScore;
	}

	public void setStartScore(String startScore) {
		this.startScore = startScore;
	}

	public String getStartLevel() {
		return startLevel;
	}

	public void setStartLevel(String startLevel) {
		this.startLevel = startLevel;
	}

	public String getNowScore() {
		return nowScore;
	}

	public void setNowScore(String nowScore) {
		this.nowScore = nowScore;
	}

	public String getNowLevel() {
		return nowLevel;
	}

	public void setNowLevel(String nowLevel) {
		this.nowLevel = nowLevel;
	}

	public String getProductBase() {
		return productBase;
	}

	public void setProductBase(String productBase) {
		this.productBase = productBase;
	}

	public String getKeyItem() {
		return keyItem;
	}

	public void setKeyItem(String keyItem) {
		this.keyItem = keyItem;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getCreateDepart() {
		return createDepart;
	}

	public void setCreateDepart(String createDepart) {
		this.createDepart = createDepart;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Long getEliminateFile() {
		return eliminateFile;
	}

	public void setEliminateFile(Long eliminateFile) {
		this.eliminateFile = eliminateFile;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorMail() {
		return vendorMail;
	}

	public void setVendorMail(String vendorMail) {
		this.vendorMail = vendorMail;
	}

	public String getCorporate() {
		return corporate;
	}

	public void setCorporate(String corporate) {
		this.corporate = corporate;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<ClassifyInfo> getClassifies() {
		return classifies;
	}

	public void setClassifies(List<ClassifyInfo> classifies) {
		this.classifies = classifies;
	}

}
