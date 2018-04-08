package cn.jcloud.srm.entity.srm;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="po_item_vendor_relation")
public class PoItemVendorRelation {
    private BigDecimal id;

    private BigDecimal item_id;

    private String item_code;

    private String item_name;

    private BigDecimal vendor_id;

    private String vendor_code;

    private String vendor_name;

    private Integer relation_status;

    private BigDecimal price;

    private BigDecimal invitation_id;

    private String base_factory;

    private BigDecimal cancel_af_id;

    private Integer send_status;
    
    private Date start_date;
    
    private Date end_date;

	
    @Id
    @Column(name="relation_id")
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getItem_id() {
		return item_id;
	}

	public void setItem_id(BigDecimal item_id) {
		this.item_id = item_id;
	}

	public String getItem_code() {
		return item_code;
	}

	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public BigDecimal getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(BigDecimal vendor_id) {
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

	public Integer getRelation_status() {
		return relation_status;
	}

	public void setRelation_status(Integer relation_status) {
		this.relation_status = relation_status;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getInvitation_id() {
		return invitation_id;
	}

	public void setInvitation_id(BigDecimal invitation_id) {
		this.invitation_id = invitation_id;
	}

	public String getBase_factory() {
		return base_factory;
	}

	public void setBase_factory(String base_factory) {
		this.base_factory = base_factory;
	}

	public BigDecimal getCancel_af_id() {
		return cancel_af_id;
	}

	public void setCancel_af_id(BigDecimal cancel_af_id) {
		this.cancel_af_id = cancel_af_id;
	}

	public Integer getSend_status() {
		return send_status;
	}

	public void setSend_status(Integer send_status) {
		this.send_status = send_status;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
    
    
}