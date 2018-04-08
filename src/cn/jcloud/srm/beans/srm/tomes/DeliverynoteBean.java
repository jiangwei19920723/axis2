package cn.jcloud.srm.beans.srm.tomes;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月6日 下午7:25:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class DeliverynoteBean {
	private String materialPlanCode;//要料计划编号
	private String needTime;//需求时间 yyyy-MM-dd hh:mm
	private String storageLocation;//供货类型
	private String whCode;//仓库编码
	private String whName;//仓库名称
	private String workshopCode;//车间编码
	private String workshopName;//车间名称
	private String supplyerCode;//供应商编码
	private String supplyerName;//供应商名称
	private String stockerCode;//保管员
	private String asnId;//asn单号
	private String stationCode;//工位编码
	private String stationName;//工位名称
	private List<DeliverynoteItemBean> items;
	public String getMaterialPlanCode() {
		return materialPlanCode;
	}
	public void setMaterialPlanCode(String materialPlanCode) {
		this.materialPlanCode = materialPlanCode;
	}
	public String getNeedTime() {
		return needTime;
	}
	public void setNeedTime(String needTime) {
		this.needTime = needTime;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public String getWhCode() {
		return whCode;
	}
	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}
	public String getWhName() {
		return whName;
	}
	public void setWhName(String whName) {
		this.whName = whName;
	}
	public String getWorkshopCode() {
		return workshopCode;
	}
	public void setWorkshopCode(String workshopCode) {
		this.workshopCode = workshopCode;
	}
	public String getWorkshopName() {
		return workshopName;
	}
	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}
	public String getSupplyerCode() {
		return supplyerCode;
	}
	public void setSupplyerCode(String supplyerCode) {
		this.supplyerCode = supplyerCode;
	}
	public String getSupplyerName() {
		return supplyerName;
	}
	public void setSupplyerName(String supplyerName) {
		this.supplyerName = supplyerName;
	}
	public String getStockerCode() {
		return stockerCode;
	}
	public void setStockerCode(String stockerCode) {
		this.stockerCode = stockerCode;
	}
	public String getAsnId() {
		return asnId;
	}
	public void setAsnId(String asnId) {
		this.asnId = asnId;
	}
	public List<DeliverynoteItemBean> getItems() {
		return items;
	}
	public void setItems(List<DeliverynoteItemBean> items) {
		this.items = items;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
}
