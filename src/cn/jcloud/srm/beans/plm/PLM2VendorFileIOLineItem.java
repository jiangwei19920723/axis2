package cn.jcloud.srm.beans.plm;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午1:45:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PLM2VendorFileIOLineItem {
	private String JM3_Filename;//文件名称
	private String JM3_Fileaddress;//文件地址
	private String file_type;//文件类型
	private String expiryDate;//过期时间
	private String maxDownloadsNumber;//最大下载次数
	public String getJM3_Filename() {
		return JM3_Filename;
	}
	public void setJM3_Filename(String jM3_Filename) {
		JM3_Filename = jM3_Filename;
	}
	public String getJM3_Fileaddress() {
		return JM3_Fileaddress;
	}
	public void setJM3_Fileaddress(String jM3_Fileaddress) {
		JM3_Fileaddress = jM3_Fileaddress;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getMaxDownloadsNumber() {
		return maxDownloadsNumber;
	}
	public void setMaxDownloadsNumber(String maxDownloadsNumber) {
		this.maxDownloadsNumber = maxDownloadsNumber;
	}
	public String getFile_type() {
		return file_type;
	}
	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}

}
