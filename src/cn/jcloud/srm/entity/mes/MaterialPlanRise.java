package cn.jcloud.srm.entity.mes;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:31:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="material_plan_rise")
public class MaterialPlanRise {
	private int id;//id
	private String material_plan_code;//要料计划编号
	private Date need_time;//需求时间
	private String storage_location;//供货类型
	private String wh_code;//仓库编码
	private String wh_name;//仓库名称
	private BigDecimal vendor_id;//供应商id
	private String vendor_code;//供应商编码
	private String vendor_name;//供应商名称
	private String stocker_code;//保管员
	private String workshop_code;//车间编码
	private String workshop_name;//车间名称
	private String station_code;//工位编码
	private String station_name;//工位名称
	private int distribution_status;//状态
	private Date create_date;//同步时间
	private String send_to;//收货单位
	private String document_type;//单据类型
	@Id
	@Column(name="material_plan_rise_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_mtl_p_rise_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterial_plan_code() {
		return material_plan_code;
	}
	public void setMaterial_plan_code(String material_plan_code) {
		this.material_plan_code = material_plan_code;
	}
	public Date getNeed_time() {
		return need_time;
	}
	public void setNeed_time(Date need_time) {
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
	public BigDecimal getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(BigDecimal vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_code() {
		return vendor_code;
	}
	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getStocker_code() {
		return stocker_code;
	}
	public void setStocker_code(String stocker_code) {
		this.stocker_code = stocker_code;
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
	public int getDistribution_status() {
		return distribution_status;
	}
	public void setDistribution_status(int distribution_status) {
		this.distribution_status = distribution_status;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getSend_to() {
		return send_to;
	}
	public void setSend_to(String send_to) {
		this.send_to = send_to;
	}
	public String getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}
	
}
