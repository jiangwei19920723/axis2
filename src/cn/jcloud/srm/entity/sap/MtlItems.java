package cn.jcloud.srm.entity.sap;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="mtl_items")
public class MtlItems {
	
	private int itemId;
	
	private Integer orgId;
	
    private String version;

    private String englishName;

    private String customerTypeCode;

    private String attribute3;

    private String payPoint;

    private String invClass;

    private String fallToPay;

    private String barCode;

    private String barCreate;

    private Long belongsTo;

    private String itemCode;//物料编码

    private String descriptions;

    private String itemSpec;//物料描述

    private String uomCode;//基本计量单位

    private String itemSort;

    private String mtlType;

    private String mtlClass;

    private String mtlStatus;//物料状态

    private Character invFlag;

    private Character invLotFlag;

    private Character invSerialFlag;

    private Character invControlFlag;

    private BigDecimal inventoryId;

    private Character locatorControlFlag;

    private Character bomFlag;

    private String faClass;

    private Character costFlag;

    private Character costFaFlag;

    private Character costSumFlag;

    private BigDecimal costOfSalesAccounting;

    private Character poFlag;

    private Character poApprovedSupplier;

    private Character poTaxpayerFlag;

    private BigDecimal poListPrice;

    private String poBuyerCode;

    private Character poOutsideMake;

    private Character poReceiveFlag;

    private Character poCheckFlag;

    private String poReceiveInv;

    private String mrpBuyOrMake;

    private String mrpType;

    private String mrpPlanerCode;

    private BigDecimal mrpFixedLot;

    private BigDecimal mrpFixedSupply;

    private BigDecimal timeLeadPre;

    private BigDecimal timeLeadProcess;

    private BigDecimal timeLeadPost;

    private BigDecimal timeLeadFixed;

    private BigDecimal timeLeadTotal;

    private BigDecimal timeLeadSum;

    private BigDecimal timeLeadLot;

    private BigDecimal timeLeadVar;

    private Character wipFlag;

    private Character omOrderFlag;

    private Character omTicketFlag;

    private BigDecimal omSalesAccouting;

    private Date creationDate;

    private String createdBy;

    private Date lastUpdatedDate;//更新时间

    private String lastUpdatedBy;

    private BigDecimal weight;

    private String volSize;

    private BigDecimal checkCycle;

    private String attribute1;

    private Date lastCheckedDate;

    private Date nextCheckingDate;

    private BigDecimal checkQty;

    private String packMode;

    private BigDecimal packingQty;

    private BigDecimal packingVendorQty;

    private String attribute2;

    private Character unpackFlag;

    private String logisticMode;
    
    private Integer isSuccedaneum;//是否为替代品
    
    private String substitutes;//被替代品
    
    private String mtlGroup;//物料组
        
    private String mtlGroupDetailed;//物料组细分
    
    private String purchasing_group;//采购组
    @Id
    @Column(name="item_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="mtl_items_seq",allocationSize=1)
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    @Column(name="org_id")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

	public String getVersion() {
        return version;
    }
    
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }
    @Column(name="english_name")
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }
    @Column(name="customer_type_code")
    public String getCustomerTypeCode() {
        return customerTypeCode;
    }

    public void setCustomerTypeCode(String customerTypeCode) {
        this.customerTypeCode = customerTypeCode == null ? null : customerTypeCode.trim();
    }
    
    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }
    @Column(name="pay_point")
    public String getPayPoint() {
        return payPoint;
    }

    public void setPayPoint(String payPoint) {
        this.payPoint = payPoint == null ? null : payPoint.trim();
    }
    @Column(name="inv_class")
    public String getInvClass() {
        return invClass;
    }

    public void setInvClass(String invClass) {
        this.invClass = invClass == null ? null : invClass.trim();
    }
    @Column(name="fall_to_pay")
    public String getFallToPay() {
        return fallToPay;
    }

    public void setFallToPay(String fallToPay) {
        this.fallToPay = fallToPay == null ? null : fallToPay.trim();
    }
    @Column(name="bar_code")
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }
    @Column(name="bar_create")
    public String getBarCreate() {
        return barCreate;
    }

    public void setBarCreate(String barCreate) {
        this.barCreate = barCreate == null ? null : barCreate.trim();
    }
    @Column(name="belongs_to")
    public Long getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(Long belongsTo) {
        this.belongsTo = belongsTo;
    }
    @Column(name="item_code",unique=true)
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }
    @Column(name="DESCRIPTIONS")
    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
    }
    @Column(name="item_spec")
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec == null ? null : itemSpec.trim();
    }
    @Column(name="uom_code")
    public String getUomCode() {
        return uomCode;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode == null ? null : uomCode.trim();
    }
    @Column(name="item_sort")
    public String getItemSort() {
        return itemSort;
    }

    public void setItemSort(String itemSort) {
        this.itemSort = itemSort == null ? null : itemSort.trim();
    }
    @Column(name="mtl_type")
    public String getMtlType() {
        return mtlType;
    }

    public void setMtlType(String mtlType) {
        this.mtlType = mtlType == null ? null : mtlType.trim();
    }
    @Column(name="mtl_class")
    public String getMtlClass() {
        return mtlClass;
    }

    public void setMtlClass(String mtlClass) {
        this.mtlClass = mtlClass == null ? null : mtlClass.trim();
    }
    @Column(name="mtl_status")
    public String getMtlStatus() {
        return mtlStatus;
    }

    public void setMtlStatus(String mtlStatus) {
        this.mtlStatus = mtlStatus == null ? null : mtlStatus.trim();
    }
    @Column(name="inv_flag")
    public Character getInvFlag() {
        return invFlag;
    }

    public void setInvFlag(Character invFlag) {
        this.invFlag = invFlag;
    }
    @Column(name="inv_lot_flag")
    public Character getInvLotFlag() {
        return invLotFlag;
    }

    public void setInvLotFlag(Character invLotFlag) {
        this.invLotFlag = invLotFlag;
    }
    @Column(name="inv_serial_flag")
    public Character getInvSerialFlag() {
        return invSerialFlag;
    }

    public void setInvSerialFlag(Character invSerialFlag) {
        this.invSerialFlag = invSerialFlag;
    }
    @Column(name="inv_control_flag")
    public Character getInvControlFlag() {
        return invControlFlag;
    }

    public void setInvControlFlag(Character invControlFlag) {
        this.invControlFlag = invControlFlag;
    }
    @Column(name="inventory_id")
    public BigDecimal getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(BigDecimal inventoryId) {
        this.inventoryId = inventoryId;
    }
    @Column(name="locator_control_flag")
    public Character getLocatorControlFlag() {
        return locatorControlFlag;
    }

    public void setLocatorControlFlag(Character locatorControlFlag) {
        this.locatorControlFlag = locatorControlFlag;
    }
    @Column(name="bom_flag")
    public Character getBomFlag() {
        return bomFlag;
    }

    public void setBomFlag(Character bomFlag) {
        this.bomFlag = bomFlag;
    }
    @Column(name="fa_class")
    public String getFaClass() {
        return faClass;
    }

    public void setFaClass(String faClass) {
        this.faClass = faClass == null ? null : faClass.trim();
    }
    @Column(name="cost_flag")
    public Character getCostFlag() {
        return costFlag;
    }

    public void setCostFlag(Character costFlag) {
        this.costFlag = costFlag;
    }
    @Column(name="cost_fa_flag")
    public Character getCostFaFlag() {
        return costFaFlag;
    }

    public void setCostFaFlag(Character costFaFlag) {
        this.costFaFlag = costFaFlag;
    }
    @Column(name="cost_sum_flag")
    public Character getCostSumFlag() {
        return costSumFlag;
    }

    public void setCostSumFlag(Character costSumFlag) {
        this.costSumFlag = costSumFlag ;
    }
    @Column(name="cost_of_sales_accounting")
    public BigDecimal getCostOfSalesAccounting() {
        return costOfSalesAccounting;
    }

    public void setCostOfSalesAccounting(BigDecimal costOfSalesAccounting) {
        this.costOfSalesAccounting = costOfSalesAccounting;
    }
    @Column(name="po_flag")
    public Character getPoFlag() {
        return poFlag;
    }

    public void setPoFlag(Character poFlag) {
        this.poFlag = poFlag;
    }
    @Column(name="po_approved_supplier")
    public Character getPoApprovedSupplier() {
        return poApprovedSupplier;
    }

    public void setPoApprovedSupplier(Character poApprovedSupplier) {
        this.poApprovedSupplier = poApprovedSupplier;
    }
    @Column(name="po_taxpayer_flag")
    public Character getPoTaxpayerFlag() {
        return poTaxpayerFlag;
    }

    public void setPoTaxpayerFlag(Character poTaxpayerFlag) {
        this.poTaxpayerFlag = poTaxpayerFlag;
    }
    @Column(name="po_list_price")
    public BigDecimal getPoListPrice() {
        return poListPrice;
    }

    public void setPoListPrice(BigDecimal poListPrice) {
        this.poListPrice = poListPrice;
    }
    @Column(name="po_buyer_code")
    public String getPoBuyerCode() {
        return poBuyerCode;
    }

    public void setPoBuyerCode(String poBuyerCode) {
        this.poBuyerCode = poBuyerCode == null ? null : poBuyerCode.trim();
    }
    @Column(name="po_outside_make")
    public Character getPoOutsideMake() {
        return poOutsideMake;
    }

    public void setPoOutsideMake(Character poOutsideMake) {
        this.poOutsideMake = poOutsideMake;
    }
    @Column(name="po_receive_flag")
    public Character getPoReceiveFlag() {
        return poReceiveFlag;
    }

    public void setPoReceiveFlag(Character poReceiveFlag) {
        this.poReceiveFlag = poReceiveFlag;
    }
    @Column(name="po_check_flag")
    public Character getPoCheckFlag() {
        return poCheckFlag;
    }

    public void setPoCheckFlag(Character poCheckFlag) {
        this.poCheckFlag = poCheckFlag;
    }
    @Column(name="po_receive_inv")
    public String getPoReceiveInv() {
        return poReceiveInv;
    }

    public void setPoReceiveInv(String poReceiveInv) {
        this.poReceiveInv = poReceiveInv == null ? null : poReceiveInv.trim();
    }
    @Column(name="mrp_buy_or_make")
    public String getMrpBuyOrMake() {
        return mrpBuyOrMake;
    }

    public void setMrpBuyOrMake(String mrpBuyOrMake) {
        this.mrpBuyOrMake = mrpBuyOrMake == null ? null : mrpBuyOrMake.trim();
    }
    @Column(name="mrp_type")
    public String getMrpType() {
        return mrpType;
    }

    public void setMrpType(String mrpType) {
        this.mrpType = mrpType == null ? null : mrpType.trim();
    }
    @Column(name="mrp_planer_code")
    public String getMrpPlanerCode() {
        return mrpPlanerCode;
    }

    public void setMrpPlanerCode(String mrpPlanerCode) {
        this.mrpPlanerCode = mrpPlanerCode == null ? null : mrpPlanerCode.trim();
    }
    @Column(name="mrp_fixed_lot")
    public BigDecimal getMrpFixedLot() {
        return mrpFixedLot;
    }

    public void setMrpFixedLot(BigDecimal mrpFixedLot) {
        this.mrpFixedLot = mrpFixedLot;
    }
    @Column(name="mrp_fixed_supply")
    public BigDecimal getMrpFixedSupply() {
        return mrpFixedSupply;
    }

    public void setMrpFixedSupply(BigDecimal mrpFixedSupply) {
        this.mrpFixedSupply = mrpFixedSupply;
    }
    @Column(name="time_lead_pre")
    public BigDecimal getTimeLeadPre() {
        return timeLeadPre;
    }

    public void setTimeLeadPre(BigDecimal timeLeadPre) {
        this.timeLeadPre = timeLeadPre;
    }
    @Column(name="time_lead_process")
    public BigDecimal getTimeLeadProcess() {
        return timeLeadProcess;
    }

    public void setTimeLeadProcess(BigDecimal timeLeadProcess) {
        this.timeLeadProcess = timeLeadProcess;
    }
    @Column(name="time_lead_post")
    public BigDecimal getTimeLeadPost() {
        return timeLeadPost;
    }

    public void setTimeLeadPost(BigDecimal timeLeadPost) {
        this.timeLeadPost = timeLeadPost;
    }
    @Column(name="time_lead_fixed")
    public BigDecimal getTimeLeadFixed() {
        return timeLeadFixed;
    }

    public void setTimeLeadFixed(BigDecimal timeLeadFixed) {
        this.timeLeadFixed = timeLeadFixed;
    }
    @Column(name="time_lead_total")
    public BigDecimal getTimeLeadTotal() {
        return timeLeadTotal;
    }

    public void setTimeLeadTotal(BigDecimal timeLeadTotal) {
        this.timeLeadTotal = timeLeadTotal;
    }
    @Column(name="time_lead_sum")
    public BigDecimal getTimeLeadSum() {
        return timeLeadSum;
    }

    public void setTimeLeadSum(BigDecimal timeLeadSum) {
        this.timeLeadSum = timeLeadSum;
    }
    @Column(name="time_lead_lot")
    public BigDecimal getTimeLeadLot() {
        return timeLeadLot;
    }

    public void setTimeLeadLot(BigDecimal timeLeadLot) {
        this.timeLeadLot = timeLeadLot;
    }
    @Column(name="time_lead_var")
    public BigDecimal getTimeLeadVar() {
        return timeLeadVar;
    }

    public void setTimeLeadVar(BigDecimal timeLeadVar) {
        this.timeLeadVar = timeLeadVar;
    }
    @Column(name="wip_flag")
    public Character getWipFlag() {
        return wipFlag;
    }

    public void setWipFlag(Character wipFlag) {
        this.wipFlag = wipFlag;
    }
    @Column(name="om_order_flag")
    public Character getOmOrderFlag() {
        return omOrderFlag;
    }

    public void setOmOrderFlag(Character omOrderFlag) {
        this.omOrderFlag = omOrderFlag;
    }
    @Column(name="om_ticket_flag")
    public Character getOmTicketFlag() {
        return omTicketFlag;
    }

    public void setOmTicketFlag(Character omTicketFlag) {
        this.omTicketFlag = omTicketFlag;
    }
    @Column(name="om_sales_accouting")
    public BigDecimal getOmSalesAccouting() {
        return omSalesAccouting;
    }

    public void setOmSalesAccouting(BigDecimal omSalesAccouting) {
        this.omSalesAccouting = omSalesAccouting;
    }
    @Column(name="creation_date")
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    @Column(name="created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }
    @Column(name="last_updated_date")
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
    @Column(name="last_updated_by")
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy == null ? null : lastUpdatedBy.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    @Column(name="vol_size")
    public String getVolSize() {
        return volSize;
    }

    public void setVolSize(String volSize) {
        this.volSize = volSize == null ? null : volSize.trim();
    }
    @Column(name="check_cycle")
    public BigDecimal getCheckCycle() {
        return checkCycle;
    }

    public void setCheckCycle(BigDecimal checkCycle) {
        this.checkCycle = checkCycle;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }
    @Column(name="last_checked_date")
    public Date getLastCheckedDate() {
        return lastCheckedDate;
    }

    public void setLastCheckedDate(Date lastCheckedDate) {
        this.lastCheckedDate = lastCheckedDate;
    }
    @Column(name="next_checking_date")
    public Date getNextCheckingDate() {
        return nextCheckingDate;
    }

    public void setNextCheckingDate(Date nextCheckingDate) {
        this.nextCheckingDate = nextCheckingDate;
    }
    @Column(name="check_qty")
    public BigDecimal getCheckQty() {
        return checkQty;
    }

    public void setCheckQty(BigDecimal checkQty) {
        this.checkQty = checkQty;
    }
    @Column(name="pack_mode")
    public String getPackMode() {
        return packMode;
    }

    public void setPackMode(String packMode) {
        this.packMode = packMode == null ? null : packMode.trim();
    }
    @Column(name="packing_qty")
    public BigDecimal getPackingQty() {
        return packingQty;
    }

    public void setPackingQty(BigDecimal packingQty) {
        this.packingQty = packingQty;
    }
    @Column(name="packing_vendor_qty")
    public BigDecimal getPackingVendorQty() {
        return packingVendorQty;
    }

    public void setPackingVendorQty(BigDecimal packingVendorQty) {
        this.packingVendorQty = packingVendorQty;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }
    @Column(name="unpack_flag")
    public Character getUnpackFlag() {
        return unpackFlag;
    }

    public void setUnpackFlag(Character unpackFlag) {
        this.unpackFlag = unpackFlag;
    }
    @Column(name="logistic_mode")
    public String getLogisticMode() {
        return logisticMode;
    }

    public void setLogisticMode(String logisticMode) {
        this.logisticMode = logisticMode == null ? null : logisticMode.trim();
    }
    @Column(name="is_succedaneum")
	public Integer getIsSuccedaneum() {
		return isSuccedaneum;
	}

	public void setIsSuccedaneum(Integer isSuccedaneum) {
		this.isSuccedaneum = isSuccedaneum;
	}

	public String getSubstitutes() {
		return substitutes;
	}

	public void setSubstitutes(String substitutes) {
		this.substitutes = substitutes;
	}
	@Column(name="mtl_group")
	public String getMtlGroup() {
		return mtlGroup;
	}

	public void setMtlGroup(String mtlGroup) {
		this.mtlGroup = mtlGroup;
	}
	@Column(name="mtl_group_detailed")
	public String getMtlGroupDetailed() {
		return mtlGroupDetailed;
	}

	public void setMtlGroupDetailed(String mtlGroupDetailed) {
		this.mtlGroupDetailed = mtlGroupDetailed;
	}

	public String getPurchasing_group() {
		return purchasing_group;
	}

	public void setPurchasing_group(String purchasing_group) {
		this.purchasing_group = purchasing_group;
	}
    
    
}