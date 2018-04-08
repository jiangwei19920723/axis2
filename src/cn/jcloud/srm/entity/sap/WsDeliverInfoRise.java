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
 * @date 创建时间：2017年9月7日 下午8:10:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="ws_deliver_info_rise")
public class WsDeliverInfoRise {
	private int id;
	private String docNumber;//报文编号
	private String omCode;//供应商代码
	private String omName;//供应商全称
	private Date receiptDate;//收货日期
	private String asnNumber;//a s n号
	private int vendorId;//供应商id
	private Date create_time;
	@Id
	@Column(name="deliver_info_rise_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_deliver_info_rise_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="Doc_Number")
	public String getDocNumber() {
		return docNumber;
	}
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
	@Column(name="Om_Code")
	public String getOmCode() {
		return omCode;
	}
	public void setOmCode(String omCode) {
		this.omCode = omCode;
	}
	@Column(name="Om_Name")
	public String getOmName() {
		return omName;
	}
	public void setOmName(String omName) {
		this.omName = omName;
	}
	@Column(name="Receipt_Date")
	public Date getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}
	@Column(name="Asn_Number")
	public String getAsnNumber() {
		return asnNumber;
	}
	public void setAsnNumber(String asnNumber) {
		this.asnNumber = asnNumber;
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
