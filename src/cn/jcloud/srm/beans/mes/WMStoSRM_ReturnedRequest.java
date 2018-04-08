package cn.jcloud.srm.beans.mes;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月4日 上午10:03:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class WMStoSRM_ReturnedRequest {
	private String asnid;//ASN单号
	private String refund_number;//退库单编号
	private String mater_code;//物料编码
	private String supplyer_code;//供应商编码
	private String return_quantity;//退货数量
	private String unit;//单位
	private String create_time;//创建时间
	private String freeUse1;
	private String freeUse2;
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;
	public String getAsnid() {
		return asnid;
	}
	public void setAsnid(String asnid) {
		this.asnid = asnid;
	}
	public String getMater_code() {
		return mater_code;
	}
	public void setMater_code(String mater_code) {
		this.mater_code = mater_code;
	}
	public String getSupplyer_code() {
		return supplyer_code;
	}
	public void setSupplyer_code(String supplyer_code) {
		this.supplyer_code = supplyer_code;
	}
	public String getReturn_quantity() {
		return return_quantity;
	}
	public void setReturn_quantity(String return_quantity) {
		this.return_quantity = return_quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getRefund_number() {
		return refund_number;
	}
	public void setRefund_number(String refund_number) {
		this.refund_number = refund_number;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getFreeUse1() {
		return freeUse1;
	}
	public void setFreeUse1(String freeUse1) {
		this.freeUse1 = freeUse1;
	}
	public String getFreeUse2() {
		return freeUse2;
	}
	public void setFreeUse2(String freeUse2) {
		this.freeUse2 = freeUse2;
	}
	public String getFreeUse3() {
		return freeUse3;
	}
	public void setFreeUse3(String freeUse3) {
		this.freeUse3 = freeUse3;
	}
	public String getFreeUse4() {
		return freeUse4;
	}
	public void setFreeUse4(String freeUse4) {
		this.freeUse4 = freeUse4;
	}
	public String getFreeUse5() {
		return freeUse5;
	}
	public void setFreeUse5(String freeUse5) {
		this.freeUse5 = freeUse5;
	}
	
}
