package cn.jcloud.srm.beans.mes;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:25:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class WMStoSRM_MaterialPlanRequestItem {
	private String materialPlan_line;//要料计划行号
	private String mater_code;//物料编码
	private String mater_name;//物料名称
	private String need_count;//需求数量
	private String unit;//计量单位
	private String vin;//VIN码
	private String car_type;//车系
	private String freeUse1;//作废状态
	private String freeUse2;
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;

	public String getMaterialPlan_line() {
		return materialPlan_line;
	}
	public void setMaterialPlan_line(String materialPlan_line) {
		this.materialPlan_line = materialPlan_line;
	}
	public String getMater_code() {
		return mater_code;
	}
	public void setMater_code(String mater_code) {
		this.mater_code = mater_code;
	}
	public String getMater_name() {
		return mater_name;
	}
	public void setMater_name(String mater_name) {
		this.mater_name = mater_name;
	}
	public String getNeed_count() {
		return need_count;
	}
	public void setNeed_count(String need_count) {
		this.need_count = need_count;
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
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getFreeUse1() {
		return freeUse1;
	}
	public void setFreeUse1(String freeUse1) {
		this.freeUse1 = freeUse1;
	}
	public String getFreeUse2() {
		return freeUse2;
	}
	public void setFreeUse2(String freeUse2) {
		this.freeUse2 = freeUse2;
	}
	public String getFreeUse3() {
		return freeUse3;
	}
	public void setFreeUse3(String freeUse3) {
		this.freeUse3 = freeUse3;
	}
	public String getFreeUse4() {
		return freeUse4;
	}
	public void setFreeUse4(String freeUse4) {
		this.freeUse4 = freeUse4;
	}
	public String getFreeUse5() {
		return freeUse5;
	}
	public void setFreeUse5(String freeUse5) {
		this.freeUse5 = freeUse5;
	}

	
}
