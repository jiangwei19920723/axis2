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
 * @author  蒋维 
 * @date 创建时间：2017年9月8日 下午4:25:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="fi_invoice_handle")
public class FiInvoiceHandle {
	private int id;
	private String companyCode;//公司代码
	private String factory;//工厂
	private String om;//供应商
	private int  vendorId;//供应商id
	private String purchaseOrder;//采购订单
	private String receivingVoucher;//收货凭证
	private String documentYear;//凭证年度
	private String systemInvoiceNumber;//系统发票号
	private String paperInvoiceNumber;//纸制发票号
	private Date create_time;//发票生成时间
	@Id
	@Column(name="invoice_handle_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_fi_invoice_handle_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 公司代码
	 * @return
	 */
	@Column(name="company_code")
	public String getCompanyCode() {
		return companyCode;
	}
	/**
	 * 公司代码
	 * @param companyCode
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	/**
	 * 工厂
	 * @return
	 */
	public String getFactory() {
		return factory;
	}
	/**
	 * 工厂
	 * @param factory
	 */
	public void setFactory(String factory) {
		this.factory = factory;
	}
	/**
	 * 供应商
	 * @return
	 */
	public String getOm() {
		return om;
	}
	/**
	 * 供应商
	 * @param om
	 */
	public void setOm(String om) {
		this.om = om;
	}
	/**
	 * 采购订单
	 * @return
	 */
	@Column(name="purchase_order")
	public String getPurchaseOrder() {
		return purchaseOrder;
	}
	/**
	 * 采购订单
	 * @param purchaseOrder
	 */
	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	/**
	 * 订单行项目
	 * @return
	 */
	
	/**
	 * 收货凭证
	 * @return
	 */
	@Column(name="receiving_voucher")
	public String getReceivingVoucher() {
		return receivingVoucher;
	}
	/**
	 * 收货凭证
	 * @param receivingVoucher
	 */
	public void setReceivingVoucher(String receivingVoucher) {
		this.receivingVoucher = receivingVoucher;
	}
	
	/**
	 * 凭证年度
	 * @return
	 */
	@Column(name="document_year")
	public String getDocumentYear() {
		return documentYear;
	}
	/**
	 * 凭证年度
	 * @param documentYear
	 */
	public void setDocumentYear(String documentYear) {
		this.documentYear = documentYear;
	}
	/**
	 * 系统发票号
	 * @return
	 */
	@Column(name="system_invoice_number")
	public String getSystemInvoiceNumber() {
		return systemInvoiceNumber;
	}
	/**
	 * 系统发票号
	 * @param systemInvoiceNumber
	 */
	public void setSystemInvoiceNumber(String systemInvoiceNumber) {
		this.systemInvoiceNumber = systemInvoiceNumber;
	}
	/**
	 * 纸制发票号
	 * @return
	 */
	@Column(name="paper_invoice_number")
	public String getPaperInvoiceNumber() {
		return paperInvoiceNumber;
	}
	/**
	 * 纸制发票号
	 * @param paperInvoiceNumber
	 */
	public void setPaperInvoiceNumber(String paperInvoiceNumber) {
		this.paperInvoiceNumber = paperInvoiceNumber;
	}
	@Column(name="vendor_id",columnDefinition="number(20) default (0)")
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
	
}
