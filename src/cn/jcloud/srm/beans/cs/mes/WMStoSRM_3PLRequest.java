package cn.jcloud.srm.beans.cs.mes;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月30日 上午10:44:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class WMStoSRM_3PLRequest {
	private String items_plan_code;
	private String pro_org;
	private String send_date;
	private String send_time;
	private String need_time;
	private String operation_type;
	private List<WMStoSRM_3PLRequestItem> list;
	private String freeUse1;
	private String freeUse2;
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;
	public String getItems_plan_code() {
		return items_plan_code;
	}
	public void setItems_plan_code(String items_plan_code) {
		this.items_plan_code = items_plan_code;
	}
	public String getPro_org() {
		return pro_org;
	}
	public void setPro_org(String pro_org) {
		this.pro_org = pro_org;
	}
	public String getSend_date() {
		return send_date;
	}
	public void setSend_date(String send_date) {
		this.send_date = send_date;
	}
	public String getSend_time() {
		return send_time;
	}
	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}
	public String getNeed_time() {
		return need_time;
	}
	public void setNeed_time(String need_time) {
		this.need_time = need_time;
	}
	public String getOperation_type() {
		return operation_type;
	}
	public void setOperation_type(String operation_type) {
		this.operation_type = operation_type;
	}
	public List<WMStoSRM_3PLRequestItem> getList() {
		return list;
	}
	public void setList(List<WMStoSRM_3PLRequestItem> list) {
		this.list = list;
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
