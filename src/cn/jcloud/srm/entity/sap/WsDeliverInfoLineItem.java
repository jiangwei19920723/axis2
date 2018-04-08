package cn.jcloud.srm.entity.sap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月7日 下午8:10:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="ws_deliver_info_Item")
public class WsDeliverInfoLineItem {
	private int id;
	private String omCode;//供应商代码
	private String materielCode;//物料代码
	private String poPlanNumber;//采购计划协议号
	private String poPlanLineNumber;//采购计划协议行项目号
	private String receiptVoucher;//收货凭证
	private float receiptNumber;//收货数量
	private int headId;//头id
	private int materielId;//物料id
    private String purchasing_group;//采购组
	@Id
	@Column(name="deliver_info_item_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_deliver_info_item_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="Om_Code")
	public String getOmCode() {
		return omCode;
	}
	public void setOmCode(String omCode) {
		this.omCode = omCode;
	}
	@Column(name="Materiel_Code")
	public String getMaterielCode() {
		return materielCode;
	}
	public void setMaterielCode(String materielCode) {
		this.materielCode = materielCode;
	}
	@Column(name="Po_Plan_Number")
	public String getPoPlanNumber() {
		return poPlanNumber;
	}
	public void setPoPlanNumber(String poPlanNumber) {
		this.poPlanNumber = poPlanNumber;
	}
	@Column(name="Po_Plan_Line_Number")
	public String getPoPlanLineNumber() {
		return poPlanLineNumber;
	}
	public void setPoPlanLineNumber(String poPlanLineNumber) {
		this.poPlanLineNumber = poPlanLineNumber;
	}
	@Column(name="Receipt_Voucher")
	public String getReceiptVoucher() {
		return receiptVoucher;
	}
	public void setReceiptVoucher(String receiptVoucher) {
		this.receiptVoucher = receiptVoucher;
	}
	@Column(name="Receipt_Number")
	public float getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(float receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	@Column(name="head_id",columnDefinition="number(10) default (0)")
	public int getHeadId() {
		return headId;
	}
	public void setHeadId(int headId) {
		this.headId = headId;
	}
	@Column(name="Materiel_Id",columnDefinition="number(20) default (0)")
	public int getMaterielId() {
		return materielId;
	}
	public void setMaterielId(int materielId) {
		this.materielId = materielId;
	}
	public String getPurchasing_group() {
		return purchasing_group;
	}
	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}

}
