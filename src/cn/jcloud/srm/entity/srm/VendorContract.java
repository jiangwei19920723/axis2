package cn.jcloud.srm.entity.srm;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VENDOR_CONTRACT")
public class VendorContract {
    private BigDecimal id;

    private String contract_code;

    private String contract_name;

    private Long vendor_id;

    private String response_dept;

    private String clerk;

    private String contract_content;

    private Long contract_group;

    private Date creat_date;

    private Date begin_date;

    private Date end_date;

    private BigDecimal payment_type;

    private String remark;

    private String pay_mode;

    private Long implstatus;

    private Long upload_file;

    private String vendor_name;

    private BigDecimal contract_count;

    private String vendor_code;

    private String base_factory;
    
    private String ekorg;
    
    private String werks;
    
    private String ekgrp;
    
    private String esokz;
    
    private Integer send_status;

	
    @Id
    @Column(name="contract_id")
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getContract_code() {
		return contract_code;
	}

	public void setContract_code(String contract_code) {
		this.contract_code = contract_code;
	}

	public String getContract_name() {
		return contract_name;
	}

	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}

	public Long getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Long vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getResponse_dept() {
		return response_dept;
	}

	public void setResponse_dept(String response_dept) {
		this.response_dept = response_dept;
	}

	public String getClerk() {
		return clerk;
	}

	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	public String getContract_content() {
		return contract_content;
	}

	public void setContract_content(String contract_content) {
		this.contract_content = contract_content;
	}

	public Long getContract_group() {
		return contract_group;
	}

	public void setContract_group(Long contract_group) {
		this.contract_group = contract_group;
	}

	public Date getCreat_date() {
		return creat_date;
	}

	public void setCreat_date(Date creat_date) {
		this.creat_date = creat_date;
	}

	public Date getBegin_date() {
		return begin_date;
	}

	public void setBegin_date(Date begin_date) {
		this.begin_date = begin_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public BigDecimal getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(BigDecimal payment_type) {
		this.payment_type = payment_type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPay_mode() {
		return pay_mode;
	}

	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}

	public Long getImplstatus() {
		return implstatus;
	}

	public void setImplstatus(Long implstatus) {
		this.implstatus = implstatus;
	}

	public Long getUpload_file() {
		return upload_file;
	}

	public void setUpload_file(Long upload_file) {
		this.upload_file = upload_file;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public BigDecimal getContract_count() {
		return contract_count;
	}

	public void setContract_count(BigDecimal contract_count) {
		this.contract_count = contract_count;
	}

	public String getVendor_code() {
		return vendor_code;
	}

	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}

	public String getBase_factory() {
		return base_factory;
	}

	public void setBase_factory(String base_factory) {
		this.base_factory = base_factory;
	}

	public Integer getSend_status() {
		return send_status;
	}

	public void setSend_status(Integer send_status) {
		this.send_status = send_status;
	}

	public String getEkorg() {
		return ekorg;
	}

	public void setEkorg(String ekorg) {
		this.ekorg = ekorg;
	}

	public String getWerks() {
		return werks;
	}

	public void setWerks(String werks) {
		this.werks = werks;
	}

	public String getEkgrp() {
		return ekgrp;
	}

	public void setEkgrp(String ekgrp) {
		this.ekgrp = ekgrp;
	}

	public String getEsokz() {
		return esokz;
	}

	public void setEsokz(String esokz) {
		this.esokz = esokz;
	}

}