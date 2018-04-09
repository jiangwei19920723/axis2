package cn.jcloud.srm.entity.cs.sap;

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
 * 要货计划
* @author 蒋维
* @date 创建时间：2018年4月9日 上午11:47:29
* @version 1.0
*/
@Entity
@Table(name="po_inventory_order")
public class PoInventoryOrder {
	@Id
	@Column(name="plan_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_pio_id",allocationSize=1)
	private Long id;
	private Date create_time;//创建时间
	private String create_by;//创建人
	private Date update_time;//更新时间
	private String update_by;//更新人
	private Long company_id;//工厂ID
	private Long purchase_org_id;//采购组织ID
	private Long purchase_group_id;//采购组ID
	private Long vendor_id;//供应商ID
	private String vendor_code;//供应商代码
	private String vendor_name;//供应商名称
	private Long items_id;//物料主键ID
	private String items_code;//物料编码
	private String items_name;//物料描述
	private String business_type;//业务类型
	private String doc_num;//报文编号
	private Date plan_create_date;//SAP创建日期
	private String plan_code;//采购订单号/备货单号
	private Date sap_send_time;//发送日期+发送时间
	private Date plan_publish_date;//发布日期
	private String plan_publish_user;//发布人员
	private String plan_type;//订单类型
	private String plan_line_code;//采购订单行项目号/备货单行号
	private Date need_date;//交货日期
	private BigDecimal need_count;//交货数量/更新后数量
	private String items_unit;//计量单位
	private String receive_factory;//收货工厂
	private String receive_address;//送货地点
	private String receive_depot_code;//仓库编码
	private String receive_depot;//仓库名称
	private String workshop_code;//车间编码
	private String workshop_name;//车间名称
	private String station_code;//工位编码
	private String station_name;//工位名称
	private String distrib_type;//配送方式：P1 直供到仓库P2 直供到线边P3 第三方直供到仓库P4 第三方直供到线边
	private String review_code;//审批编号
	private String stocker_code;//保管员编码
	private String stocker_name;//保管员名称
	private String car_type;//车系
	private Integer close_status;//关闭标识
	private Integer delete_status;//删除标识
	private Integer status;//配送状态
	private String plan_version;//版本号
	private String vin;//VIN码
	private BigDecimal send_count;//发送数量
	private BigDecimal receipt_count;//到货数量
	private BigDecimal accept_count;//合格数量/实收数量
	private String date_type;//计划类型（W1、W2、W3、W4、M等）
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getItems_id() {
		return items_id;
	}
	public void setItems_id(Long items_id) {
		this.items_id = items_id;
	}
	public String getItems_code() {
		return items_code;
	}
	public void setItems_code(String items_code) {
		this.items_code = items_code;
	}
	public String getItems_name() {
		return items_name;
	}
	public void setItems_name(String items_name) {
		this.items_name = items_name;
	}
	public String getBusiness_type() {
		return business_type;
	}
	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}
	public String getDoc_num() {
		return doc_num;
	}
	public void setDoc_num(String doc_num) {
		this.doc_num = doc_num;
	}
	public Date getPlan_create_date() {
		return plan_create_date;
	}
	public void setPlan_create_date(Date plan_create_date) {
		this.plan_create_date = plan_create_date;
	}
	public String getPlan_code() {
		return plan_code;
	}
	public void setPlan_code(String plan_code) {
		this.plan_code = plan_code;
	}
	public Date getSap_send_time() {
		return sap_send_time;
	}
	public void setSap_send_time(Date sap_send_time) {
		this.sap_send_time = sap_send_time;
	}
	public Date getPlan_publish_date() {
		return plan_publish_date;
	}
	public void setPlan_publish_date(Date plan_publish_date) {
		this.plan_publish_date = plan_publish_date;
	}
	public String getPlan_publish_user() {
		return plan_publish_user;
	}
	public void setPlan_publish_user(String plan_publish_user) {
		this.plan_publish_user = plan_publish_user;
	}
	public String getPlan_type() {
		return plan_type;
	}
	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}
	public String getPlan_line_code() {
		return plan_line_code;
	}
	public void setPlan_line_code(String plan_line_code) {
		this.plan_line_code = plan_line_code;
	}
	public Date getNeed_date() {
		return need_date;
	}
	public void setNeed_date(Date need_date) {
		this.need_date = need_date;
	}
	public BigDecimal getNeed_count() {
		return need_count;
	}
	public void setNeed_count(BigDecimal need_count) {
		this.need_count = need_count;
	}
	public String getItems_unit() {
		return items_unit;
	}
	public void setItems_unit(String items_unit) {
		this.items_unit = items_unit;
	}
	public String getReceive_factory() {
		return receive_factory;
	}
	public void setReceive_factory(String receive_factory) {
		this.receive_factory = receive_factory;
	}
	public String getReceive_address() {
		return receive_address;
	}
	public void setReceive_address(String receive_address) {
		this.receive_address = receive_address;
	}
	public String getReceive_depot() {
		return receive_depot;
	}
	public void setReceive_depot(String receive_depot) {
		this.receive_depot = receive_depot;
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
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public String getDistrib_type() {
		return distrib_type;
	}
	public void setDistrib_type(String distrib_type) {
		this.distrib_type = distrib_type;
	}
	public String getReview_code() {
		return review_code;
	}
	public void setReview_code(String review_code) {
		this.review_code = review_code;
	}
	public String getStocker_code() {
		return stocker_code;
	}
	public void setStocker_code(String stocker_code) {
		this.stocker_code = stocker_code;
	}
	public String getStocker_name() {
		return stocker_name;
	}
	public void setStocker_name(String stocker_name) {
		this.stocker_name = stocker_name;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public Integer getClose_status() {
		return close_status;
	}
	public void setClose_status(Integer close_status) {
		this.close_status = close_status;
	}
	public Integer getDelete_status() {
		return delete_status;
	}
	public void setDelete_status(Integer delete_status) {
		this.delete_status = delete_status;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getPlan_version() {
		return plan_version;
	}
	public void setPlan_version(String plan_version) {
		this.plan_version = plan_version;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public BigDecimal getSend_count() {
		return send_count;
	}
	public void setSend_count(BigDecimal send_count) {
		this.send_count = send_count;
	}
	public BigDecimal getReceipt_count() {
		return receipt_count;
	}
	public void setReceipt_count(BigDecimal receipt_count) {
		this.receipt_count = receipt_count;
	}
	public BigDecimal getAccept_count() {
		return accept_count;
	}
	public void setAccept_count(BigDecimal accept_count) {
		this.accept_count = accept_count;
	}
	public String getDate_type() {
		return date_type;
	}
	public void setDate_type(String date_type) {
		this.date_type = date_type;
	}
	public String getReceive_depot_code() {
		return receive_depot_code;
	}
	public void setReceive_depot_code(String receive_depot_code) {
		this.receive_depot_code = receive_depot_code;
	}
	
	
}
