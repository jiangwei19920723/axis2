package cn.jcloud.srm.beans.mes;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月3日 上午11:35:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class WMStoSRM_ASNRequest {
	private String asnid;//ASN单号
	private String mater_code;//物料编码
	private String supplyer_code;//供应商编码
	private String act_charger_num;//实际到货数量
	private String unit;//单位
	private String create_time;//创建时间
	private String materialPlan_code;//要料计划编号
	private String materialPlan_line;//要料计划行号
	private String qualified_number;//合格数量
	private String illqualified_number;//不合格数量
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
	public String getAct_charger_num() {
		return act_charger_num;
	}
	public void setAct_charger_num(String act_charger_num) {
		this.act_charger_num = act_charger_num;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
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
	public String getMaterialPlan_code() {
		return materialPlan_code;
	}
	public void setMaterialPlan_code(String materialPlan_code) {
		this.materialPlan_code = materialPlan_code;
	}
	public String getMaterialPlan_line() {
		return materialPlan_line;
	}
	public void setMaterialPlan_line(String materialPlan_line) {
		this.materialPlan_line = materialPlan_line;
	}
	public String getQualified_number() {
		return qualified_number;
	}
	public void setQualified_number(String qualified_number) {
		this.qualified_number = qualified_number;
	}
	public String getIllqualified_number() {
		return illqualified_number;
	}
	public void setIllqualified_number(String illqualified_number) {
		this.illqualified_number = illqualified_number;
	}
	
}
