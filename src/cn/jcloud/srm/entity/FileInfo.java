package cn.jcloud.srm.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="file_info")
public class FileInfo {
    private BigDecimal fileId;

    private String filePath;

    private String fileName;

    private String fileModel;

    private int status;

    private Date expiryDate;

    private String uploadBy;

    private Date uploadTime;
    
    private Integer maxDownloadsNumber;
    @Id
    @Column(name="file_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="FILE_INFO_SEQ",allocationSize=1)
    public BigDecimal getFileId() {
        return fileId;
    }

    public void setFileId(BigDecimal fileId) {
        this.fileId = fileId;
    }
    @Column(name="file_path")
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }
    @Column(name="file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }
    @Column(name="file_model")
    public String getFileModel() {
        return fileModel;
    }

    public void setFileModel(String fileModel) {
        this.fileModel = fileModel == null ? null : fileModel.trim();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    @Column(name="expiry_date")
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    @Column(name="upload_by")
    public String getUploadBy() {
        return uploadBy;
    }

    public void setUploadBy(String uploadBy) {
        this.uploadBy = uploadBy == null ? null : uploadBy.trim();
    }
    @Column(name="upload_time")
    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
    @Column(name="Max_Downloads_Number")
	public Integer getMaxDownloadsNumber() {
		return maxDownloadsNumber;
	}

	public void setMaxDownloadsNumber(Integer maxDownloadsNumber) {
		this.maxDownloadsNumber = maxDownloadsNumber;
	}
    
    
}