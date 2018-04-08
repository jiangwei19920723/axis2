package cn.jcloud.srm.entity.srm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DISTRIBUTION_ORDER")
public class DistributionOrder {
    private Long distribution_order_id;//主键id

    private Long vendor_id;//供应商id

    private String send_toaddr;//收货地址

    private Long send_to;//收货单位(枚举)

    private Date send_date;//送货日期

    private String send_byaddr;//发货地址

    private String purchase_plan_number;//采购订单号

    private String om_name;//供应商名称

    private String om_code;//供应商编码

    private String lab_type;//供货类型

    private Long info_plan_rise_id;//要货计划头id

    private Date create_time;//创建日期

    private String bar_code;//配送条码

    private String storage_location;//入库地点(可能改为枚举)

    private String distribution_code;//配送编码

    private Integer send_status;//接口发送状态
    
    private String delivery_location_code;//仓库编码

    private String workspace_code;//车间编码

    private String workstation_code;//工位编码
    
    private String delivery_location;//仓库名称
    
    private String manager;//管理员
    
    private String workstation;//车间工位

    private String workspace;//车间名称
    
    private Date need_time;//需求时间
    
    private Integer print_status;//状态
    
    private String driver;//司机名字
    
    private String driver_tel;//司机电话
    
    private String send_batch;//送货批次
    
    private String document_type;//单据类型：量产/试制
    
    private String item_batch;//生产批次
    
    private Integer distribution_type;
    
    private String original_plan_number;//原始单号
    @Id
	public Long getDistribution_order_id() {
		return distribution_order_id;
	}

	public void setDistribution_order_id(Long distribution_order_id) {
		this.distribution_order_id = distribution_order_id;
	}

	public Long getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Long vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getSend_toaddr() {
		return send_toaddr;
	}

	public void setSend_toaddr(String send_toaddr) {
		this.send_toaddr = send_toaddr;
	}

	public Long getSend_to() {
		return send_to;
	}

	public void setSend_to(Long send_to) {
		this.send_to = send_to;
	}

	public Date getSend_date() {
		return send_date;
	}

	public void setSend_date(Date send_date) {
		this.send_date = send_date;
	}

	public String getSend_byaddr() {
		return send_byaddr;
	}

	public void setSend_byaddr(String send_byaddr) {
		this.send_byaddr = send_byaddr;
	}

	public String getPurchase_plan_number() {
		return purchase_plan_number;
	}

	public void setPurchase_plan_number(String purchase_plan_number) {
		this.purchase_plan_number = purchase_plan_number;
	}

	public String getOm_name() {
		return om_name;
	}

	public void setOm_name(String om_name) {
		this.om_name = om_name;
	}

	public String getOm_code() {
		return om_code;
	}

	public void setOm_code(String om_code) {
		this.om_code = om_code;
	}

	public String getLab_type() {
		return lab_type;
	}

	public void setLab_type(String lab_type) {
		this.lab_type = lab_type;
	}

	public Long getInfo_plan_rise_id() {
		return info_plan_rise_id;
	}

	public void setInfo_plan_rise_id(Long info_plan_rise_id) {
		this.info_plan_rise_id = info_plan_rise_id;
	}

	

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getBar_code() {
		return bar_code;
	}

	public void setBar_code(String bar_code) {
		this.bar_code = bar_code;
	}

	public String getStorage_location() {
		return storage_location;
	}

	public void setStorage_location(String storage_location) {
		this.storage_location = storage_location;
	}

	public String getDistribution_code() {
		return distribution_code;
	}

	public void setDistribution_code(String distribution_code) {
		this.distribution_code = distribution_code;
	}

	public Integer getSend_status() {
		return send_status;
	}

	public void setSend_status(Integer send_status) {
		this.send_status = send_status;
	}

	public String getDelivery_location_code() {
		return delivery_location_code;
	}

	public void setDelivery_location_code(String delivery_location_code) {
		this.delivery_location_code = delivery_location_code;
	}

	public String getWorkspace_code() {
		return workspace_code;
	}

	public void setWorkspace_code(String workspace_code) {
		this.workspace_code = workspace_code;
	}

	public String getWorkstation_code() {
		return workstation_code;
	}

	public void setWorkstation_code(String workstation_code) {
		this.workstation_code = workstation_code;
	}

	public String getDelivery_location() {
		return delivery_location;
	}

	public void setDelivery_location(String delivery_location) {
		this.delivery_location = delivery_location;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getWorkstation() {
		return workstation;
	}

	public void setWorkstation(String workstation) {
		this.workstation = workstation;
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}

	public Date getNeed_time() {
		return need_time;
	}

	public void setNeed_time(Date need_time) {
		this.need_time = need_time;
	}

	public Integer getPrint_status() {
		return print_status;
	}

	public void setPrint_status(Integer print_status) {
		this.print_status = print_status;
	}

	public Integer getDistribution_type() {
		return distribution_type;
	}

	public void setDistribution_type(Integer distribution_type) {
		this.distribution_type = distribution_type;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDriver_tel() {
		return driver_tel;
	}

	public void setDriver_tel(String driver_tel) {
		this.driver_tel = driver_tel;
	}

	public String getSend_batch() {
		return send_batch;
	}

	public void setSend_batch(String send_batch) {
		this.send_batch = send_batch;
	}

	public String getItem_batch() {
		return item_batch;
	}

	public void setItem_batch(String item_batch) {
		this.item_batch = item_batch;
	}

	public String getDocument_type() {
		return document_type;
	}

	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}

	public String getOriginal_plan_number() {
		return original_plan_number;
	}

	public void setOriginal_plan_number(String original_plan_number) {
		this.original_plan_number = original_plan_number;
	}


}