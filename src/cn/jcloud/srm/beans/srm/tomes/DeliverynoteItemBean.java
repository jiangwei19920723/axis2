package cn.jcloud.srm.beans.srm.tomes;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月6日 下午7:36:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class DeliverynoteItemBean {
	private String orderThis;//到货数量
	private String materialPlanLine;//要料计划行号
	private String materCode;//物料编码
	private String materName;//物料名称
	private String needCount;//需求数量
	private String unit;//计量单位
	private String vin;//VIN码

	public String getOrderThis() {
		return orderThis;
	}
	public void setOrderThis(String orderThis) {
		this.orderThis = orderThis;
	}
	public String getMaterialPlanLine() {
		return materialPlanLine;
	}
	public void setMaterialPlanLine(String materialPlanLine) {
		this.materialPlanLine = materialPlanLine;
	}
	public String getMaterCode() {
		return materCode;
	}
	public void setMaterCode(String materCode) {
		this.materCode = materCode;
	}
	public String getMaterName() {
		return materName;
	}
	public void setMaterName(String materName) {
		this.materName = materName;
	}
	public String getNeedCount() {
		return needCount;
	}
	public void setNeedCount(String needCount) {
		this.needCount = needCount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
