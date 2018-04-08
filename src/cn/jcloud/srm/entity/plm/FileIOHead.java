package cn.jcloud.srm.entity.plm;

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
 * @date 创建时间：2017年10月10日 下午1:55:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="PLM_FILE_IO_HEAD")
public class FileIOHead {
	private int id;
	private String code;//编号
	private String title;//标题
	private String vendorCode;//供应商
	private String IOer;//传输人
	private Date IODate;//传输日期
	private BigDecimal vendorId;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_io_head_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(unique=true)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="vendor_code")
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getIOer() {
		return IOer;
	}
	public void setIOer(String iOer) {
		IOer = iOer;
	}
	@Column(name="io_date")
	public Date getIODate() {
		return IODate;
	}
	public void setIODate(Date iODate) {
		IODate = iODate;
	}
	@Column(name="VENDOR_ID")
	public BigDecimal getVendorId() {
		return vendorId;
	}
	public void setVendorId(BigDecimal vendorId) {
		this.vendorId = vendorId;
	}
}
