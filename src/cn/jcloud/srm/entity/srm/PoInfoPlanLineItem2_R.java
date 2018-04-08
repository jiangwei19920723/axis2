package cn.jcloud.srm.entity.srm;

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
@Table(name="po_info_plan_line_item2_r")
public class PoInfoPlanLineItem2_R {
	private int id;//id
	private String omCode;//供应商代码
	private String purchasePlanProjectNumber;//采购计划协议行项目号
	private String materielNumber;//物料编码
	private String materielDescribe;//物料描述
	private Date deliveryDate;//交货日期
	private BigDecimal deliveryNumber;//交货数量
	private Date deliverDate;//发送日期时间
	private String labType;//01：直供  02：第三方仓库配送
	private String approvalNumber;//审批编号
	private String measurementUnit;//计量单位
	private int purchasePlanType;//采购计划类型
	private int state;//状态
	private int headId;//头id
	private int booleanStatus;//确认状态
	private int materielId;//物料id
	private BigDecimal leastCounts;//剩余数量
	private int distributionStatus;//配货状态
	private String carType;//车系
	private BigDecimal receipts_counts;//实收数量
	private BigDecimal collection_count;//实发数量
	private BigDecimal qualified_number;//合格数量
	private BigDecimal illqualified_number;//不合格数量
	private BigDecimal passage_number;//在途数量
	private String date_type;//日期类型
	private Integer change_status;//是否发生修改
	@Id
	@Column(name="info_plan_item_r_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_plan_item2_r_id",allocationSize=1)
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
	@Column(name="car_type")
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
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
	public String getDate_type() {
		return date_type;
	}
	public void setDate_type(String date_type) {
		this.date_type = date_type;
	}
	public Integer getChange_status() {
		return change_status;
	}
	public void setChange_status(Integer change_status) {
		this.change_status = change_status;
	}
	
	
	
}
