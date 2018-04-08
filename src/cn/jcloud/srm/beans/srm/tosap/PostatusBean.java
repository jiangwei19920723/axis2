package cn.jcloud.srm.beans.srm.tosap;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月6日 下午7:17:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PostatusBean {
	private String purchasePlanNumber;//采购计划协议号
	private String purchasePlanProjectNumber;//采购计划协议行项目号
	private String poOrganization;//采购组织
	private int number;//实发数量
	private int state;//0:未发，1：已发
	public String getPurchasePlanNumber() {
		return purchasePlanNumber;
	}
	public void setPurchasePlanNumber(String purchasePlanNumber) {
		this.purchasePlanNumber = purchasePlanNumber;
	}
	public String getPurchasePlanProjectNumber() {
		return purchasePlanProjectNumber;
	}
	public void setPurchasePlanProjectNumber(String purchasePlanProjectNumber) {
		this.purchasePlanProjectNumber = purchasePlanProjectNumber;
	}
	public String getPoOrganization() {
		return poOrganization;
	}
	public void setPoOrganization(String poOrganization) {
		this.poOrganization = poOrganization;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
