package cn.jcloud.srm.entity.srm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午2:41:49
* @version 1.0
*/
@Entity
@Table(name="po_asn_line")
public class PoAsnLine {
	@Id
	private Long asn_line_id;
	private Date create_time;
	private String create_by;
	private Date update_time;
	private String update_by;
	private Long asn_id;
	private Long items_id;
	private String items_code;
	private String items_name;
	private String plan_line_code;
	private String items_unit;
	private String station_code;
	private String station_name;
	private String stocker_code;
	private String stocker_name;
	private String car_type;
	private String vin;
	private String need_count;
	private String send_count;
	private String receipt_count;
	private String accept_count;
	private String product_batch;
	private String after_count;
	private int asn_line_status;
	private Long order_id;
	public Long getAsn_line_id() {
		return asn_line_id;
	}
	public void setAsn_line_id(Long asn_line_id) {
		this.asn_line_id = asn_line_id;
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
	public Long getAsn_id() {
		return asn_id;
	}
	public void setAsn_id(Long asn_id) {
		this.asn_id = asn_id;
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
	public String getPlan_line_code() {
		return plan_line_code;
	}
	public void setPlan_line_code(String plan_line_code) {
		this.plan_line_code = plan_line_code;
	}
	public String getItems_unit() {
		return items_unit;
	}
	public void setItems_unit(String items_unit) {
		this.items_unit = items_unit;
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
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getNeed_count() {
		return need_count;
	}
	public void setNeed_count(String need_count) {
		this.need_count = need_count;
	}
	public String getSend_count() {
		return send_count;
	}
	public void setSend_count(String send_count) {
		this.send_count = send_count;
	}
	public String getReceipt_count() {
		return receipt_count;
	}
	public void setReceipt_count(String receipt_count) {
		this.receipt_count = receipt_count;
	}
	public String getAccept_count() {
		return accept_count;
	}
	public void setAccept_count(String accept_count) {
		this.accept_count = accept_count;
	}
	public String getProduct_batch() {
		return product_batch;
	}
	public void setProduct_batch(String product_batch) {
		this.product_batch = product_batch;
	}
	public String getAfter_count() {
		return after_count;
	}
	public void setAfter_count(String after_count) {
		this.after_count = after_count;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public int getAsn_line_status() {
		return asn_line_status;
	}
	public void setAsn_line_status(int asn_line_status) {
		this.asn_line_status = asn_line_status;
	}
	
	
}
