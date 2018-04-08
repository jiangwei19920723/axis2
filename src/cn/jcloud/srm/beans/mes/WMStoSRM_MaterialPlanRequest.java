package cn.jcloud.srm.beans.mes;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:25:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class WMStoSRM_MaterialPlanRequest {
	private String materialPlan_code;//要料计划编号
	private String need_time;//需求时间
	private String storage_location;//供货类型
	private String wh_code;//仓库编码
	private String wh_name;//仓库名称
	private String workshop_code;//车间编码
	private String workshop_name;//车间名称
	private String supplyer_code;//供应商编码
	private String supplyer_name;//供应商名称
	private String stocker_code;//保管员
	private String station_code;//工位编码
	private String station_name;//工位名称
	private String freeUse1;//单据类型：量产/试制
	private String freeUse2;//新增或者修改状态 0新增要料计划，1更新要料计划
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;
	private List<WMStoSRM_MaterialPlanRequestItem> items;
	public String getMaterialPlan_code() {
		return materialPlan_code;
	}
	public void setMaterialPlan_code(String materialPlan_code) {
		this.materialPlan_code = materialPlan_code;
	}
	public String getNeed_time() {
		return need_time;
	}
	public void setNeed_time(String need_time) {
		this.need_time = need_time;
	}
	public String getStorage_location() {
		return storage_location;
	}
	public void setStorage_location(String storage_location) {
		this.storage_location = storage_location;
	}
	public String getWh_code() {
		return wh_code;
	}
	public void setWh_code(String wh_code) {
		this.wh_code = wh_code;
	}
	public String getWh_name() {
		return wh_name;
	}
	public void setWh_name(String wh_name) {
		this.wh_name = wh_name;
	}
	public String getWorkshop_code() {
		return workshop_code;
	}
	public void setWorkshop_code(String workshop_code) {
		this.workshop_code = workshop_code;
	}
	public String getWorkshop_name() {
		return workshop_name;
	}
	public void setWorkshop_name(String workshop_name) {
		this.workshop_name = workshop_name;
	}
	public String getSupplyer_code() {
		return supplyer_code;
	}
	public void setSupplyer_code(String supplyer_code) {
		this.supplyer_code = supplyer_code;
	}
	public String getSupplyer_name() {
		return supplyer_name;
	}
	public void setSupplyer_name(String supplyer_name) {
		this.supplyer_name = supplyer_name;
	}
	public String getStocker_code() {
		return stocker_code;
	}
	public void setStocker_code(String stocker_code) {
		this.stocker_code = stocker_code;
	}
	public List<WMStoSRM_MaterialPlanRequestItem> getItems() {
		return items;
	}
	public void setItems(List<WMStoSRM_MaterialPlanRequestItem> items) {
		this.items = items;
	}
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
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
