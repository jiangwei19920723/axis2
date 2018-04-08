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
@Table(name="po_info_plan_rise2")
public class PoInfoPlanRise2 {
	private int id;//id
	private String omCode;//供应商代码
	private String omName;//供应商名称
	private String docNumber;//报文编号
	private Date createDate;//创建日期
	private int vendorId;//供应商id
	private String purchasePlanNumber;//采购计划协议号
	private String deliveryLocation;//送货地点
	private String deliveryLocationName;//送货地点名称
	private String collectFactory;//收货工厂
	private int distribution_head_status;
	private Date needDate;//需求日期
	private String srmPmCode;//srm系统生成订单号
	private String srmkey;//唯一标识，用于索引
	private String stocker_code;//保管员
	private String document_type;//单据类型
	private Date create_time;
	@Id
	@Column(name="info_plan_rise_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_info_plan_rise2_id",allocationSize=1)
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
	@Column(name="Delivery_Location")
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	@Column(name="Collect_Factory")
	public String getCollectFactory() {
		return collectFactory;
	}
	public void setCollectFactory(String collectFactory) {
		this.collectFactory = collectFactory;
	}
	public int getDistribution_head_status() {
		return distribution_head_status;
	}
	public void setDistribution_head_status(int distribution_head_status) {
		this.distribution_head_status = distribution_head_status;
	}
	@Column(name="delivery_location_name")
	public String getDeliveryLocationName() {
		return deliveryLocationName;
	}
	public void setDeliveryLocationName(String deliveryLocationName) {
		this.deliveryLocationName = deliveryLocationName;
	}
	
	@Column(name="need_date")
	public Date getNeedDate() {
		return needDate;
	}
	public void setNeedDate(Date needDate) {
		this.needDate = needDate;
	}
	
	@Column(name="srm_pm_code")
	public String getSrmPmCode() {
		return srmPmCode;
	}
	public void setSrmPmCode(String srmPmCode) {
		this.srmPmCode = srmPmCode;
	}
	
	@Column(name="srm_key")
	public String getSrmkey() {
		return srmkey;
	}
	public void setSrmkey(String srmkey) {
		this.srmkey = srmkey;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getStocker_code() {
		return stocker_code;
	}
	public void setStocker_code(String stocker_code) {
		this.stocker_code = stocker_code;
	}
	public String getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}
	
	
}
