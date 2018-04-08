package cn.jcloud.srm.beans.plm;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午1:45:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PLM2VendorFileIORequest {
	private String JM3_Num;//编码
	private String JM3_Title;//标题
	private String M3_Vendor;//供应商
	private String JM3_Transmitter;//传输人
	private String JM3_Transferdate;//传输日期
	private List<PLM2VendorFileIOLineItem> list;//文件集
	public String getJM3_Num() {
		return JM3_Num;
	}
	public void setJM3_Num(String jM3_Num) {
		JM3_Num = jM3_Num;
	}
	public String getJM3_Title() {
		return JM3_Title;
	}
	public void setJM3_Title(String jM3_Title) {
		JM3_Title = jM3_Title;
	}
	public String getM3_Vendor() {
		return M3_Vendor;
	}
	public void setM3_Vendor(String m3_Vendor) {
		M3_Vendor = m3_Vendor;
	}
	public String getJM3_Transmitter() {
		return JM3_Transmitter;
	}
	public void setJM3_Transmitter(String jM3_Transmitter) {
		JM3_Transmitter = jM3_Transmitter;
	}
	public String getJM3_Transferdate() {
		return JM3_Transferdate;
	}
	public void setJM3_Transferdate(String jM3_Transferdate) {
		JM3_Transferdate = jM3_Transferdate;
	}
	public List<PLM2VendorFileIOLineItem> getList() {
		return list;
	}
	public void setList(List<PLM2VendorFileIOLineItem> list) {
		this.list = list;
	}
	
	
}
