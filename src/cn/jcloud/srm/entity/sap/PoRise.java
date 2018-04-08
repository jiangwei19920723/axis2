package cn.jcloud.srm.entity.sap;

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
 * @date 创建时间：2017年12月26日 下午3:29:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="Po_Rise")
public class PoRise {
	private int id;
	private String order_type;//订单类型
	private String business_type;//业务类型
	private String om_code;//供应商代码
	private String om_name;//供应商名称
	private int vendor_id;//供应商id
	private String doc_number;//报文编号
	private Date create_date;//创建日期
	private String purchase_plan_number;//采购订单号
	private Date deliver_date;//发送日期时间
	private String srm_pm_code;//srm系统生成订单号
	private String srmkey;//唯一标识，用于索引
	private Date delivery_date;//交货日期
	private String collect_factory;//收货工厂
	private String collect_location;//收货仓库
	private String collect_location_name;//收货仓库名称
	private String stocker_code;//保管员
	private String lab_type;//供货类型
	private int distribution_head_status;//配送状态
	private int delete_status;//删除标识
	private int close_status;//关闭标识
	private int modify_status;//修改标识
	private Date create_time;//创建时间
	@Id
	@Column(name="Po_Rise_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_po_rise_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public String getBusiness_type() {
		return business_type;
	}
	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}
	public String getOm_code() {
		return om_code;
	}
	public void setOm_code(String om_code) {
		this.om_code = om_code;
	}
	public String getOm_name() {
		return om_name;
	}
	public void setOm_name(String om_name) {
		this.om_name = om_name;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getDoc_number() {
		return doc_number;
	}
	public void setDoc_number(String doc_number) {
		this.doc_number = doc_number;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getPurchase_plan_number() {
		return purchase_plan_number;
	}
	public void setPurchase_plan_number(String purchase_plan_number) {
		this.purchase_plan_number = purchase_plan_number;
	}
	public Date getDeliver_date() {
		return deliver_date;
	}
	public void setDeliver_date(Date deliver_date) {
		this.deliver_date = deliver_date;
	}
	
	public String getSrm_pm_code() {
		return srm_pm_code;
	}
	public void setSrm_pm_code(String srm_pm_code) {
		this.srm_pm_code = srm_pm_code;
	}
	public String getSrmkey() {
		return srmkey;
	}
	public void setSrmkey(String srmkey) {
		this.srmkey = srmkey;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getDistribution_head_status() {
		return distribution_head_status;
	}
	public void setDistribution_head_status(int distribution_head_status) {
		this.distribution_head_status = distribution_head_status;
	}
	public Date getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	public String getCollect_factory() {
		return collect_factory;
	}
	public void setCollect_factory(String collect_factory) {
		this.collect_factory = collect_factory;
	}
	public String getCollect_location() {
		return collect_location;
	}
	public void setCollect_location(String collect_location) {
		this.collect_location = collect_location;
	}
	public String getCollect_location_name() {
		return collect_location_name;
	}
	public void setCollect_location_name(String collect_location_name) {
		this.collect_location_name = collect_location_name;
	}
	public String getStocker_code() {
		return stocker_code;
	}
	public void setStocker_code(String stocker_code) {
		this.stocker_code = stocker_code;
	}
	public String getLab_type() {
		return lab_type;
	}
	public void setLab_type(String lab_type) {
		this.lab_type = lab_type;
	}
	public int getDelete_status() {
		return delete_status;
	}
	public void setDelete_status(int delete_status) {
		this.delete_status = delete_status;
	}
	public int getClose_status() {
		return close_status;
	}
	public void setClose_status(int close_status) {
		this.close_status = close_status;
	}
	public int getModify_status() {
		return modify_status;
	}
	public void setModify_status(int modify_status) {
		this.modify_status = modify_status;
	}
	
}
