package cn.jcloud.srm.beans.sap;

import cn.jcloud.srm.common.msg.MsgResult;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月15日 上午10:09:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class IfSRM2SAPAcsettleConfirmRequest extends MsgResult {
	private String z_uuid;
	private String z_bukrs;
	private String z_lifnr;
	private String z_belnr;
	private String z_buzei;
	private String z_gjahr;
	
	public String getZ_uuid() {
		return z_uuid;
	}
	public void setZ_uuid(String z_uuid) {
		this.z_uuid = z_uuid;
	}
	public String getZ_bukrs() {
		return z_bukrs;
	}
	public void setZ_bukrs(String z_bukrs) {
		this.z_bukrs = z_bukrs;
	}
	public String getZ_lifnr() {
		return z_lifnr;
	}
	public void setZ_lifnr(String z_lifnr) {
		this.z_lifnr = z_lifnr;
	}
	public String getZ_belnr() {
		return z_belnr;
	}
	public void setZ_belnr(String z_belnr) {
		this.z_belnr = z_belnr;
	}
	public String getZ_buzei() {
		return z_buzei;
	}
	public void setZ_buzei(String z_buzei) {
		this.z_buzei = z_buzei;
	}
	public String getZ_gjahr() {
		return z_gjahr;
	}
	public void setZ_gjahr(String z_gjahr) {
		this.z_gjahr = z_gjahr;
	}
}
