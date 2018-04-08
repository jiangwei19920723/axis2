package cn.jcloud.srm.entity.mes;

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
 * @date 创建时间：2017年10月31日 下午4:31:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="material_plan_item")
public class MaterialPlanItem {
	private int id;//id
	private int head_id;//头id
	private String material_plan_line;//要料计划行号
	private int material_id;//物料id
	private String material_code;//物料编码
	private String material_name;//物料名称
	private BigDecimal need_count;//需求数量
	private String unit;//计量单位
	private String vin;//VIN码
	private String car_type;//车系
	private BigDecimal least_counts;//剩余数量
	private int distribution_status;//配送状态
	private BigDecimal receipts_counts;//实收数量
	private BigDecimal collection_count;//实发数量
	private BigDecimal qualified_number;//合格数量
	private BigDecimal illqualified_number;//不合格数量
	private BigDecimal passage_number;//在途数量
    private String purchasing_group;//采购组
    private int cancel_status;//作废状态


	@Id
	@Column(name="material_plan_item_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_mtl_p_item_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHead_id() {
		return head_id;
	}
	public void setHead_id(int head_id) {
		this.head_id = head_id;
	}
	public String getMaterial_plan_line() {
		return material_plan_line;
	}
	public void setMaterial_plan_line(String material_plan_line) {
		this.material_plan_line = material_plan_line;
	}
	public int getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}
	public String getMaterial_code() {
		return material_code;
	}
	public void setMaterial_code(String material_code) {
		this.material_code = material_code;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public BigDecimal getNeed_count() {
		return need_count;
	}
	public void setNeed_count(BigDecimal need_count) {
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
	public BigDecimal getLeast_counts() {
		return least_counts;
	}
	public void setLeast_counts(BigDecimal least_counts) {
		this.least_counts = least_counts;
	}
	@Column(name="distribution_line_status")
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
	public String getPurchasing_group() {
		return purchasing_group;
	}
	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}
	public int getCancel_status() {
		return cancel_status;
	}
	public void setCancel_status(int cancel_status) {
		this.cancel_status = cancel_status;
	}

}
