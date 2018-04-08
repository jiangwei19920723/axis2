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
 * @date 创建时间：2017年10月10日 下午1:55:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="PLM_FILE_IO_BODY")
public class FileIOBody {
	private int id;
	private String code;//编号
	private int fileInfoId;//fileInfo表id
	private String fileName;
	private String fileAddress;
	private Date expiryDate;//过期时间
	private int maxDownloadsNumber;//最大下载次数
	private Integer file_type;//文件类型
	private BigDecimal vendorId;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_io_body_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name="info_id_file")
	public int getFileInfoId() {
		return fileInfoId;
	}
	public void setFileInfoId(int fileInfoId) {
		this.fileInfoId = fileInfoId;
	}
	@Column(name="file_name")
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Column(name="file_address")
	public String getFileAddress() {
		return fileAddress;
	}
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}
	@Column(name="VENDOR_ID")
	public BigDecimal getVendorId() {
		return vendorId;
	}
	public void setVendorId(BigDecimal vendorId) {
		this.vendorId = vendorId;
	}
	@Column(name="Expiry_Date")
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Column(name="Max_Downloads_Number")
	public int getMaxDownloadsNumber() {
		return maxDownloadsNumber;
	}
	public void setMaxDownloadsNumber(int maxDownloadsNumber) {
		this.maxDownloadsNumber = maxDownloadsNumber;
	}
	public Integer getFile_type() {
		return file_type;
	}
	public void setFile_type(Integer file_type) {
		this.file_type = file_type;
	}
	
}
