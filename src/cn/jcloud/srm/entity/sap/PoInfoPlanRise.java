package cn.jcloud.srm.entity.sap;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����4:21:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="po_info_plan_rise")
public class PoInfoPlanRise {
	private int id;//id
	private String omCode;//供应商代码
	private String omName;//供应商名称
	private String docNumber;//报文编号
	private Date createDate;//要货日期
	private int vendorId;//供应商id
	private String purchasePlanNumber;//采购计划协议号
	private Date create_time;
	@Id
	@Column(name="info_plan_rise_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_info_plan_rise_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="om_code")
	public String getOmCode() {
		return omCode;
	}
	public void setOmCode(String omCode) {
		this.omCode = omCode;
	}
	@Column(name="om_name")
	public String getOmName() {
		return omName;
	}
	public void setOmName(String omName) {
		this.omName = omName;
	}
	@Column(name="doc_number")
	public String getDocNumber() {
		return docNumber;
	}
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
	@Column(name="create_date")
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name="vendor_id",columnDefinition="number(20) default (0)")
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	@Column(name="Purchase_Plan_Number")
	public String getPurchasePlanNumber() {
		return purchasePlanNumber;
	}
	public void setPurchasePlanNumber(String purchasePlanNumber) {
		this.purchasePlanNumber = purchasePlanNumber;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
}
