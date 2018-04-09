package cn.jcloud.srm.entity.srm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午2:37:44
* @version 1.0
*/
@Entity
@Table(name="po_asn_head")
public class PoAsnHead {
	@Id
	private Long asn_id;
	private String asn_code;
	private Date create_time;
	private String create_by;
	private Date update_time;
	private String update_by;
	private Long company_id;
	private Long purchase_org_id;
	private Long purchase_group_id;
	private Long vendor_id;
	private String vendor_code;
	private String vendor_name;
	private String plan_code;
	private Date need_date;
	private String plan_type;
	private String receive_factory;
	private String depot_code;
	private String depot_name;
	private String workshop_code;
	private String workshop_name;
	private String distrib_type;
	private int asn_status;
	private int send_status;
	public Long getAsn_id() {
		return asn_id;
	}
	public void setAsn_id(Long asn_id) {
		this.asn_id = asn_id;
	}
	public String getAsn_code() {
		return asn_code;
	}
	public void setAsn_code(String asn_code) {
		this.asn_code = asn_code;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public Long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}
	public Long getPurchase_org_id() {
		return purchase_org_id;
	}
	public void setPurchase_org_id(Long purchase_org_id) {
		this.purchase_org_id = purchase_org_id;
	}
	public Long getPurchase_group_id() {
		return purchase_group_id;
	}
	public void setPurchase_group_id(Long purchase_group_id) {
		this.purchase_group_id = purchase_group_id;
	}
	public Long getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(Long vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_code() {
		return vendor_code;
	}
	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getPlan_code() {
		return plan_code;
	}
	public void setPlan_code(String plan_code) {
		this.plan_code = plan_code;
	}
	public Date getNeed_date() {
		return need_date;
	}
	public void setNeed_date(Date need_date) {
		this.need_date = need_date;
	}
	public String getPlan_type() {
		return plan_type;
	}
	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}
	public String getReceive_factory() {
		return receive_factory;
	}
	public void setReceive_factory(String receive_factory) {
		this.receive_factory = receive_factory;
	}
	public String getDepot_code() {
		return depot_code;
	}
	public void setDepot_code(String depot_code) {
		this.depot_code = depot_code;
	}
	public String getDepot_name() {
		return depot_name;
	}
	public void setDepot_name(String depot_name) {
		this.depot_name = depot_name;
	}
	public String getWorkshop_code() {
		return workshop_code;
	}
	public void setWorkshop_code(String workshop_code) {
		this.workshop_code = workshop_code;
	}
	public String getWorkshop_name() {
		return workshop_name;
	}
	public void setWorkshop_name(String workshop_name) {
		this.workshop_name = workshop_name;
	}
	public String getDistrib_type() {
		return distrib_type;
	}
	public void setDistrib_type(String distrib_type) {
		this.distrib_type = distrib_type;
	}
	public int getAsn_status() {
		return asn_status;
	}
	public void setAsn_status(int asn_status) {
		this.asn_status = asn_status;
	}
	public int getSend_status() {
		return send_status;
	}
	public void setSend_status(int send_status) {
		this.send_status = send_status;
	}
	
	
}
