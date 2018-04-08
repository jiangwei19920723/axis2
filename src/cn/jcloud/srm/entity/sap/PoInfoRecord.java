package cn.jcloud.srm.entity.sap;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 下午1:48:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
/*@Entity
@Table(name="po_info_record")*/
public class PoInfoRecord {
	private int id;
	private String poOrganization;//采购组织
	private String factory;//工厂
	private String materielCode;//物料编码
	private String omCode;//供应商编码
	private String classification;//分类
	private String poPrice;//采购单价
	private Date startDate;//有效期从
	private Date endDate;//有效期止
	private int materielId;//物料id
	private int vendorId;//供应商id
	@Id
	@Column(name="info_record_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_po_info_record_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="Po_Organization")
	public String getPoOrganization() {
		return poOrganization;
	}
	public void setPoOrganization(String poOrganization) {
		this.poOrganization = poOrganization;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	@Column(name="Materiel_Code")
	public String getMaterielCode() {
		return materielCode;
	}
	public void setMaterielCode(String materielCode) {
		this.materielCode = materielCode;
	}
	@Column(name="Om_Code")
	public String getOmCode() {
		return omCode;
	}
	public void setOmCode(String omCode) {
		this.omCode = omCode;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	@Column(name="Po_Price")
	public String getPoPrice() {
		return poPrice;
	}
	public void setPoPrice(String poPrice) {
		this.poPrice = poPrice;
	}
	@Column(name="Start_Date")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Column(name="End_Date")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Column(name="materiel_id",columnDefinition="number(20) default (0)")
	public int getMaterielId() {
		return materielId;
	}
	public void setMaterielId(int materielId) {
		this.materielId = materielId;
	}
	@Column(name="vendor_id",columnDefinition="number(20) default (0)")
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

}
