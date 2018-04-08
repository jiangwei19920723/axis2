package cn.jcloud.srm.beans.srm.tosap;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月6日 下午7:13:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class materialBean {
	private String startDate;//开始时间
	private String endDate;//结束时间
	private String factory;//工厂
	private String materialType;//物料类型
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	
}
