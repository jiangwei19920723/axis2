package cn.jcloud.srm.entity.sap;

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
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����4:21:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="po_info_plan_line_item")
public class PoInfoPlanLineItem {
	private int id;//id
	private String omCode;//供应商代码
	private String purchasePlanProjectNumber;//采购计划协议行项目号
	private String materielNumber;//物料编码
	private String materielDescribe;//物料描述
	private Date deliveryDate;//交货日期
	private BigDecimal deliveryNumber;//交货数量
	private String collectFactory;//收货工厂
	private String deliveryLocation;//送货地点
	private Date deliverDate;//发送日期时间
	private String labType;//采购组织
	private String approvalNumber;//审批编号
	private String measurementUnit;//计量单位
	private int purchasePlanType;//采购计划类型
	private int state;//状态
	private int headId;//头id
	private int booleanStatus;//确认状态
	private int materielId;//物料id
	private BigDecimal leastCounts;//剩余数量
	private int distributionStatus;//配货状态
	private String date_type;//日期类型
	private String deliveryLocationName;//送货地点名称
	private Integer valid_status;//有效标识
    private String purchasing_group;//采购组
	
	@Id
	@Column(name="info_plan_item_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_info_plan_item_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="Om_Code")
	public String getOmCode() {
		return omCode;
	}
	public void setOmCode(String omCode) {
		this.omCode = omCode;
	}

	@Column(name="Purchase_Plan_Project_Number")
	public String getPurchasePlanProjectNumber() {
		return purchasePlanProjectNumber;
	}
	public void setPurchasePlanProjectNumber(String purchasePlanProjectNumber) {
		this.purchasePlanProjectNumber = purchasePlanProjectNumber;
	}
	@Column(name="Materiel_Number")
	public String getMaterielNumber() {
		return materielNumber;
	}
	public void setMaterielNumber(String materielNumber) {
		this.materielNumber = materielNumber;
	}
	@Column(name="Materiel_Describe")
	public String getMaterielDescribe() {
		return materielDescribe;
	}
	public void setMaterielDescribe(String materielDescribe) {
		this.materielDescribe = materielDescribe;
	}
	@Column(name="Delivery_Date")
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	@Column(name="Delivery_Number")
	public BigDecimal getDeliveryNumber() {
		return deliveryNumber;
	}
	public void setDeliveryNumber(BigDecimal deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	@Column(name="Collect_Factory")
	public String getCollectFactory() {
		return collectFactory;
	}
	public void setCollectFactory(String collectFactory) {
		this.collectFactory = collectFactory;
	}
	@Column(name="Delivery_Location")
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	@Column(name="Deliver_Date")
	public Date getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}
	@Column(name="Lab_Type")
	public String getLabType() {
		return labType;
	}
	public void setLabType(String labType) {
		this.labType = labType;
	}
	@Column(name="Approval_Number")
	public String getApprovalNumber() {
		return approvalNumber;
	}
	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}
	@Column(name="Measurement_Unit")
	public String getMeasurementUnit() {
		return measurementUnit;
	}
	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}
	@Column(name="purchase_plan_type",columnDefinition="number(2) default (0)")
	public int getPurchasePlanType() {
		return purchasePlanType;
	}
	public void setPurchasePlanType(int purchasePlanType) {
		this.purchasePlanType = purchasePlanType;
	}
	@Column(columnDefinition="number(2) default (0)")
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Column(name="head_id",columnDefinition="number(10) default (0)")
	public int getHeadId() {
		return headId;
	}
	public void setHeadId(int headId) {
		this.headId = headId;
	}
	@Column(name="boolean_status",columnDefinition="number(2) default (0)")
	public int getBooleanStatus() {
		return booleanStatus;
	}
	public void setBooleanStatus(int booleanStatus) {
		this.booleanStatus = booleanStatus;
	}
	@Column(name="Materiel_Id",columnDefinition="number(20) default (0)")
	public int getMaterielId() {
		return materielId;
	}
	public void setMaterielId(int materielId) {
		this.materielId = materielId;
	}
	@Column(name="least_counts")
	public BigDecimal getLeastCounts() {
		return leastCounts;
	}
	public void setLeastCounts(BigDecimal leastCounts) {
		this.leastCounts = leastCounts;
	}
	@Column(name="distribution_status",columnDefinition="number(2) default (0)")
	public int getDistributionStatus() {
		return distributionStatus;
	}
	public void setDistributionStatus(int distributionStatus) {
		this.distributionStatus = distributionStatus;
	}
	public String getDate_type() {
		return date_type;
	}
	public void setDate_type(String date_type) {
		this.date_type = date_type;
	}
	public Integer getValid_status() {
		return valid_status;
	}
	public void setValid_status(Integer valid_status) {
		this.valid_status = valid_status;
	}
	@Column(name="Delivery_Location_Name")
	public String getDeliveryLocationName() {
		return deliveryLocationName;
	}
	public void setDeliveryLocationName(String deliveryLocationName) {
		this.deliveryLocationName = deliveryLocationName;
	}
	public String getPurchasing_group() {
		return purchasing_group;
	}
	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}
	
	
}
