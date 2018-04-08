package cn.jcloud.srm.entity.mes;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月3日 上午11:40:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="mes_asn_in_info")
public class AsnInInfo {
	private int asn_in_info_id;//id
	private String asn_id;//asnid单号
	private int material_id;//物料id
	private String material_code;//物料编码
	private String material_name;//物料名称
	private BigDecimal vendor_id;//供应商id
	private String vendor_code;//供应商编号
	private String vendor_name;//供应商名称
	private BigDecimal in_number;//实际到货数量
	private String unit;//单位
	private Date create_time;//创建时间
	private String material_plan_code;//要料计划编号
	private String material_plan_line;//要料计划行号
	private BigDecimal collection_count;//实发数量
	private BigDecimal qualified_number;//合格数量
	private BigDecimal illqualified_number;//不合格数量
    private String purchasing_group;//采购组
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_asn_in",allocationSize=1)
	public int getAsn_in_info_id() {
		return asn_in_info_id;
	}
	public void setAsn_in_info_id(int asn_in_info_id) {
		this.asn_in_info_id = asn_in_info_id;
	}
	public String getAsn_id() {
		return asn_id;
	}
	public void setAsn_id(String asn_id) {
		this.asn_id = asn_id;
	}

	
	public String getMaterial_code() {
		return material_code;
	}
	public void setMaterial_code(String material_code) {
		this.material_code = material_code;
	}

	public int getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
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
	public BigDecimal getIn_number() {
		return in_number;
	}
	public void setIn_number(BigDecimal in_number) {
		this.in_number = in_number;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getMaterial_plan_code() {
		return material_plan_code;
	}
	public void setMaterial_plan_code(String material_plan_code) {
		this.material_plan_code = material_plan_code;
	}
	public String getMaterial_plan_line() {
		return material_plan_line;
	}
	public void setMaterial_plan_line(String material_plan_line) {
		this.material_plan_line = material_plan_line;
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
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public String getPurchasing_group() {
		return purchasing_group;
	}
	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}
	
	
	
}
