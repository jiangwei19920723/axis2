package cn.jcloud.srm.entity.srm;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月26日 下午3:29:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="Po_line_Item_R")
public class PoLineItem_R {
	private int id;
	private String purchase_plan_project_number;//采购计划协议行项目号
	private String head_line;//头和行
	private String materiel_code;//物料编码
	private String materiel_name;//物料名称
	private String purchasing_group;//采购组
	private int materiel_id;//物料id
	private BigDecimal delivery_number;//数量
	private String measurement_unit;//计量单位
	private String version;//审批编号
	private int head_id;//头id
	private int purchase_plan_type;//采购计划类型
	private int state;//状态
	private int boolean_status;//确认状态
	private BigDecimal least_counts;//剩余数量
	private int distribution_status;//配货状态
	private BigDecimal receipts_counts;//实收数量
	private BigDecimal collection_count;//实发数量
	private BigDecimal qualified_number;//合格数量
	private BigDecimal illqualified_number;//不合格数量
	private BigDecimal passage_number;//在途数量
	private Integer change_status;//是否发生修改
	private String date_type;//日期类型
	private int delete_status;//删除标识
	private int close_status;//关闭标识
	private String car_type;//车系
	
	@Id
	@Column(name="po_line_item_r_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_po_line_item_r_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPurchase_plan_project_number() {
		return purchase_plan_project_number;
	}
	public void setPurchase_plan_project_number(String purchase_plan_project_number) {
		this.purchase_plan_project_number = purchase_plan_project_number;
	}
	public String getMateriel_code() {
		return materiel_code;
	}
	public void setMateriel_code(String materiel_code) {
		this.materiel_code = materiel_code;
	}
	public String getMateriel_name() {
		return materiel_name;
	}
	public void setMateriel_name(String materiel_name) {
		this.materiel_name = materiel_name;
	}
	public int getMateriel_id() {
		return materiel_id;
	}
	public void setMateriel_id(int materiel_id) {
		this.materiel_id = materiel_id;
	}
	
	public BigDecimal getDelivery_number() {
		return delivery_number;
	}
	public void setDelivery_number(BigDecimal delivery_number) {
		this.delivery_number = delivery_number;
	}
	public String getMeasurement_unit() {
		return measurement_unit;
	}
	public void setMeasurement_unit(String measurement_unit) {
		this.measurement_unit = measurement_unit;
	}
	@Column(name="approval_number")
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getHead_id() {
		return head_id;
	}
	public void setHead_id(int head_id) {
		this.head_id = head_id;
	}
	public String getPurchasing_group() {
		return purchasing_group;
	}
	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}
	public int getPurchase_plan_type() {
		return purchase_plan_type;
	}
	public void setPurchase_plan_type(int purchase_plan_type) {
		this.purchase_plan_type = purchase_plan_type;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getBoolean_status() {
		return boolean_status;
	}
	public void setBoolean_status(int boolean_status) {
		this.boolean_status = boolean_status;
	}
	public BigDecimal getLeast_counts() {
		return least_counts;
	}
	public void setLeast_counts(BigDecimal least_counts) {
		this.least_counts = least_counts;
	}
	public int getDistribution_status() {
		return distribution_status;
	}
	public void setDistribution_status(int distribution_status) {
		this.distribution_status = distribution_status;
	}
	public BigDecimal getReceipts_counts() {
		return receipts_counts;
	}
	public void setReceipts_counts(BigDecimal receipts_counts) {
		this.receipts_counts = receipts_counts;
	}
	public BigDecimal getCollection_count() {
		return collection_count;
	}
	public void setCollection_count(BigDecimal collection_count) {
		this.collection_count = collection_count;
	}
	public BigDecimal getQualified_number() {
		return qualified_number;
	}
	public void setQualified_number(BigDecimal qualified_number) {
		this.qualified_number = qualified_number;
	}
	public BigDecimal getIllqualified_number() {
		return illqualified_number;
	}
	public void setIllqualified_number(BigDecimal illqualified_number) {
		this.illqualified_number = illqualified_number;
	}
	public BigDecimal getPassage_number() {
		return passage_number;
	}
	public void setPassage_number(BigDecimal passage_number) {
		this.passage_number = passage_number;
	}
	public Integer getChange_status() {
		return change_status;
	}
	public void setChange_status(Integer change_status) {
		this.change_status = change_status;
	}
	public String getDate_type() {
		return date_type;
	}
	public void setDate_type(String date_type) {
		this.date_type = date_type;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public int getDelete_status() {
		return delete_status;
	}
	public void setDelete_status(int delete_status) {
		this.delete_status = delete_status;
	}
	public int getClose_status() {
		return close_status;
	}
	public void setClose_status(int close_status) {
		this.close_status = close_status;
	}
	public String getHead_line() {
		return head_line;
	}
	public void setHead_line(String head_line) {
		this.head_line = head_line;
	}
	
	
}
