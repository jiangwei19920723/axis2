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
 * @date 创建时间：2017年11月4日 上午9:58:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="mes_asn_out_info")
public class AsnOutInfo {
	private int asn_out_info_id;//id
	private String asn_id;//asnid单号
	private String refund_number;//退库单编号
	private int material_id;//物料id
	private String material_code;//物料编码
	private String material_name;//物料名称
	private BigDecimal vendor_id;//供应商id
	private String vendor_code;//供应商编号
	private String vendor_name;//供应商名称
	private BigDecimal out_number;//退货数量
	private String unit;//单位
	private Date create_time;//创建时间
    private String purchasing_group;//采购组
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_asn_out",allocationSize=1)
	public int getAsn_out_info_id() {
		return asn_out_info_id;
	}
	public void setAsn_out_info_id(int asn_out_info_id) {
		this.asn_out_info_id = asn_out_info_id;
	}
	public String getAsn_id() {
		return asn_id;
	}
	public void setAsn_id(String asn_id) {
		this.asn_id = asn_id;
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
	public BigDecimal getOut_number() {
		return out_number;
	}
	public void setOut_number(BigDecimal out_number) {
		this.out_number = out_number;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getRefund_number() {
		return refund_number;
	}
	public void setRefund_number(String refund_number) {
		this.refund_number = refund_number;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getPurchasing_group() {
		return purchasing_group;
	}
	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}
	
}
