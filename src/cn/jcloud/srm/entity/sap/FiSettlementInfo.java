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
 * @author  蒋维 
 * @date 创建时间：2017年9月8日 上午9:46:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="fi_settlement_info")
public class FiSettlementInfo {
	private int id;
	private int vendorId;//供应商id
	private String settlementCode;//结算编码
	private String companyCode;//公司代码
	private String factory;//工厂
	private String om;//供应商
	private Date create_time;
	private String purchaseOrder;//采购订单
	private String orderLineItem;//订单行项目
	private String materiel;//物料
	private String receivingVoucher;//收货凭证
	private String receivingLineItem;//收货行项目
	private String documentYear;//凭证年度
	private BigDecimal fiNumber;//数量
	private String toLoan;//借、贷
	private String measurementUnit;//计量单位
	private BigDecimal settlementPrice;//结算单价
	private BigDecimal settlementAmount;//结算金额
	private String returnMark;//退货标识
	private String taxRate;//税率
	private Date accountingDate;//记账日期
	private Date voucherDate;//凭证日期
	private String omDeliveryNumber;//供应商交货单号
	private String inwardDeliveryNumber;//向内交货单号
	private String deliveryItem;//交货单行项目
	private String kolliNumber;//KOLLI号
	private int fiRows;//总行数-每次发送的总行数
	private Date pushDate;//推送时间
	private String pushState;//推送状态
	private int pushNumber;//推送次数
	private String omOperationState;//供应商操作状态
	private Integer confirm;//确认状态
	private int materielId;//物料id
	private String purchasing_group;//采购组
	private String settlement_type;//结算类型  1入库结算 2下线结算
	private BigDecimal deducted_amount;//扣减金额
	private String deduction_mode;//扣减方式
	private String purchasing_organization;//采购组织（2021-新能源；2022-燃油车；2010-星沙；3010-君泰）
	@Id
	@Column(name="settlement_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_fi_settlement_info_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="Settlement_Code")
	public String getSettlementCode() {
		return settlementCode;
	}
	public void setSettlementCode(String settlementCode) {
		this.settlementCode = settlementCode;
	}
	@Column(name="Company_Code")
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getOm() {
		return om;
	}
	public void setOm(String om) {
		this.om = om;
	}
	@Column(name="vendor_id")
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	@Column(name="purchase_order")
	public String getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	@Column(name="Order_Line_Item")
	public String getOrderLineItem() {
		return orderLineItem;
	}
	public void setOrderLineItem(String orderLineItem) {
		this.orderLineItem = orderLineItem;
	}
	public String getMateriel() {
		return materiel;
	}
	public void setMateriel(String materiel) {
		this.materiel = materiel;
	}
	@Column(name="Receiving_Voucher")
	public String getReceivingVoucher() {
		return receivingVoucher;
	}
	public void setReceivingVoucher(String receivingVoucher) {
		this.receivingVoucher = receivingVoucher;
	}
	@Column(name="Receiving_Line_Item")
	public String getReceivingLineItem() {
		return receivingLineItem;
	}
	public void setReceivingLineItem(String receivingLineItem) {
		this.receivingLineItem = receivingLineItem;
	}
	@Column(name="Document_Year")
	public String getDocumentYear() {
		return documentYear;
	}
	public void setDocumentYear(String documentYear) {
		this.documentYear = documentYear;
	}
	@Column(name="To_Loan")
	public String getToLoan() {
		return toLoan;
	}
	public void setToLoan(String toLoan) {
		this.toLoan = toLoan;
	}
	@Column(name="Measurement_Unit")
	public String getMeasurementUnit() {
		return measurementUnit;
	}
	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}
	@Column(name="Settlement_Price")
	public BigDecimal getSettlementPrice() {
		return settlementPrice;
	}
	public void setSettlementPrice(BigDecimal settlementPrice) {
		this.settlementPrice = settlementPrice;
	}
	@Column(name="Settlement_Amount")
	public BigDecimal getSettlementAmount() {
		return settlementAmount;
	}
	public void setSettlementAmount(BigDecimal settlementAmount) {
		this.settlementAmount = settlementAmount;
	}
	@Column(name="Return_Mark")
	public String getReturnMark() {
		return returnMark;
	}
	public void setReturnMark(String returnMark) {
		this.returnMark = returnMark;
	}
	@Column(name="Tax_Rate")
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	@Column(name="Accounting_Date")
	public Date getAccountingDate() {
		return accountingDate;
	}
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}
	@Column(name="Voucher_Date")
	public Date getVoucherDate() {
		return voucherDate;
	}
	public void setVoucherDate(Date voucherDate) {
		this.voucherDate = voucherDate;
	}
	@Column(name="Om_Delivery_Number")
	public String getOmDeliveryNumber() {
		return omDeliveryNumber;
	}
	public void setOmDeliveryNumber(String omDeliveryNumber) {
		this.omDeliveryNumber = omDeliveryNumber;
	}
	@Column(name="Inward_Delivery_Number")
	public String getInwardDeliveryNumber() {
		return inwardDeliveryNumber;
	}
	public void setInwardDeliveryNumber(String inwardDeliveryNumber) {
		this.inwardDeliveryNumber = inwardDeliveryNumber;
	}
	@Column(name="Delivery_Item")
	public String getDeliveryItem() {
		return deliveryItem;
	}
	public void setDeliveryItem(String deliveryItem) {
		this.deliveryItem = deliveryItem;
	}
	@Column(name="Kolli_Number")
	public String getKolliNumber() {
		return kolliNumber;
	}
	public void setKolliNumber(String kolliNumber) {
		this.kolliNumber = kolliNumber;
	}
	
	@Column(name="Fi_Number")
	public BigDecimal getFiNumber() {
		return fiNumber;
	}
	public void setFiNumber(BigDecimal fiNumber) {
		this.fiNumber = fiNumber;
	}
	@Column(name="Fi_Rows")
	public int getFiRows() {
		return fiRows;
	}
	public void setFiRows(int fiRows) {
		this.fiRows = fiRows;
	}
	@Column(name="Push_Date")
	public Date getPushDate() {
		return pushDate;
	}
	public void setPushDate(Date pushDate) {
		this.pushDate = pushDate;
	}
	@Column(name="Push_State")
	public String getPushState() {
		return pushState;
	}
	public void setPushState(String pushState) {
		this.pushState = pushState;
	}
	@Column(name="Push_Number")
	public int getPushNumber() {
		return pushNumber;
	}
	public void setPushNumber(int pushNumber) {
		this.pushNumber = pushNumber;
	}
	@Column(name="Om_Operation_State")
	public String getOmOperationState() {
		return omOperationState;
	}
	public void setOmOperationState(String omOperationState) {
		this.omOperationState = omOperationState;
	}
	public Integer getConfirm() {
		return confirm;
	}
	public void setConfirm(Integer confirm) {
		this.confirm = confirm;
	}
	@Column(name="Materiel_Id")
	public int getMaterielId() {
		return materielId;
	}
	public void setMaterielId(int materielId) {
		this.materielId = materielId;
	}
	public String getPurchasing_group() {
		return purchasing_group;
	}
	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}
	public String getSettlement_type() {
		return settlement_type;
	}
	public void setSettlement_type(String settlement_type) {
		this.settlement_type = settlement_type;
	}
	
	
	public BigDecimal getDeducted_amount() {
		return deducted_amount;
	}
	public void setDeducted_amount(BigDecimal deducted_amount) {
		this.deducted_amount = deducted_amount;
	}
	public String getDeduction_mode() {
		return deduction_mode;
	}
	public void setDeduction_mode(String deduction_mode) {
		this.deduction_mode = deduction_mode;
	}
	public String getPurchasing_organization() {
		return purchasing_organization;
	}
	public void setPurchasing_organization(String purchasing_organization) {
		this.purchasing_organization = purchasing_organization;
	}
	
}
