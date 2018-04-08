package cn.jcloud.srm.entity.srm;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DISTRIBUTION_ORDER_ITEM")
public class DistributionOrderItem {
    private Long order_item_id;//主键id

    private Long serial_number;//序列号

    private String order_item_remark;//备注

    private String measurement_unit;//计量单位

    private String materiel_number;//物料编码

    private Long materiel_id;//物料id

    private String materiel_describe;//物料名称
    
    private String purchasing_group;//采购组

    private Long distribution_order_id;//外键头id

    private BigDecimal delivery_number;//交货数量

    private Date delivery_date;//交货日期

    private BigDecimal collection_count;//实发数量

    private Long info_plan_item_id;//要货计划行id

    private Long vendor_id;//供应id

    private BigDecimal qualified_number;//合格数量

    private BigDecimal illqualified_number;//不合格数量
    
    private BigDecimal receipts_counts;//实收数量
    
    private String car_type;//车系

    private String vin;//vin
    
    private String purchase_plan_itemnumber;//采购订单行项目号
    
    private String item_batch;//生产批次
    @Id
	public Long getOrder_item_id() {
		return order_item_id;
	}

	public void setOrder_item_id(Long order_item_id) {
		this.order_item_id = order_item_id;
	}

	public Long getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(Long serial_number) {
		this.serial_number = serial_number;
	}

	public String getOrder_item_remark() {
		return order_item_remark;
	}

	public void setOrder_item_remark(String order_item_remark) {
		this.order_item_remark = order_item_remark;
	}

	public String getMeasurement_unit() {
		return measurement_unit;
	}

	public void setMeasurement_unit(String measurement_unit) {
		this.measurement_unit = measurement_unit;
	}

	public String getMateriel_number() {
		return materiel_number;
	}

	public void setMateriel_number(String materiel_number) {
		this.materiel_number = materiel_number;
	}

	public Long getMateriel_id() {
		return materiel_id;
	}

	public void setMateriel_id(Long materiel_id) {
		this.materiel_id = materiel_id;
	}

	public String getMateriel_describe() {
		return materiel_describe;
	}

	public void setMateriel_describe(String materiel_describe) {
		this.materiel_describe = materiel_describe;
	}


	public Long getDistribution_order_id() {
		return distribution_order_id;
	}

	public void setDistribution_order_id(Long distribution_order_id) {
		this.distribution_order_id = distribution_order_id;
	}

	public BigDecimal getDelivery_number() {
		return delivery_number;
	}

	public void setDelivery_number(BigDecimal delivery_number) {
		this.delivery_number = delivery_number;
	}


	public Date getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}

	public BigDecimal getCollection_count() {
		return collection_count;
	}

	public void setCollection_count(BigDecimal collection_count) {
		this.collection_count = collection_count;
	}

	public Long getInfo_plan_item_id() {
		return info_plan_item_id;
	}

	public void setInfo_plan_item_id(Long info_plan_item_id) {
		this.info_plan_item_id = info_plan_item_id;
	}

	public Long getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Long vendor_id) {
		this.vendor_id = vendor_id;
	}

	public BigDecimal getQualified_number() {
		return qualified_number;
	}

	public void setQualified_number(BigDecimal qualified_number) {
		this.qualified_number = qualified_number;
	}

	public BigDecimal getIllqualified_number() {
		return illqualified_number;
	}

	public void setIllqualified_number(BigDecimal illqualified_number) {
		this.illqualified_number = illqualified_number;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public BigDecimal getReceipts_counts() {
		return receipts_counts;
	}

	public void setReceipts_counts(BigDecimal receipts_counts) {
		this.receipts_counts = receipts_counts;
	}

	public String getPurchase_plan_itemnumber() {
		return purchase_plan_itemnumber;
	}

	public void setPurchase_plan_itemnumber(String purchase_plan_itemnumber) {
		this.purchase_plan_itemnumber = purchase_plan_itemnumber;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getPurchasing_group() {
		return purchasing_group;
	}

	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}

	public String getItem_batch() {
		return item_batch;
	}

	public void setItem_batch(String item_batch) {
		this.item_batch = item_batch;
	}


	
}