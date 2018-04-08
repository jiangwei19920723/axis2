package cn.jcloud.srm.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="VENDOR_INFO")
public class VendorInfo {
    private BigDecimal vendorId;

    private Short infoStatus;

    private Short vendorStatus;

    private String vendorCode;

    private String vendorName;

    private String vendorMail;

    private String contact;

    private String telephone;

    private String corporate;

    private BigDecimal busLenFile;

    private Short companyType;

    private String postcode;

    private Long workerCount;

    private Long techniciansCount;

    private BigDecimal capital;

    private BigDecimal salesVolume;

    private String address;

    private BigDecimal orgCodePicFile;

    private String creditCertificateFile;

    private String products;

    private Long factoryProvince;

    private Long factoryCities;

    private Long factoryCountry;

    private String factoryAddress;

    private String openBank;

    private String account;

    private BigDecimal bankPicFile;

    private String taxNumber;

    private BigDecimal taxPicFile;

    private String website;

    private BigDecimal regFund;

    private String vendorLevel;

    private BigDecimal abstractFile;

    private Date regTime;

    private Date updateTime;

    private Short infoCheckStatus;

    private Short startEvaluate;

    private String baseFactory;

    private String vendorShortName;

    private BigDecimal vendorScore;

    private Long addressProvince;

    private Long addressCountry;

    private Long addressCities;

    private String addressAddr;

    private String busLenNumber;

    private String currency;
    
    private String fax;
    
    private Long start_evaluate_file;
    
    private String vendor_type;
    
    private Integer vendor_technology_score;
    private Integer vendor_quality_score;
    private Integer vendor_bussiness_score;
    private Integer vendor_logistics_score;
    private Integer protocol_status;//协议确认状态
    private Integer uc_status;//支付状态 
    
    @Id()
    @Column(name="VENDOR_ID")
    public BigDecimal getVendorId() {
        return vendorId;
    }

    public void setVendorId(BigDecimal vendorId) {
        this.vendorId = vendorId;
    }
    @Column(name="INFO_STATUS")
    public Short getInfoStatus() {
        return infoStatus;
    }

    public void setInfoStatus(Short infoStatus) {
        this.infoStatus = infoStatus;
    }
    @Column(name="VENDOR_STATUS")
    public Short getVendorStatus() {
        return vendorStatus;
    }

    public void setVendorStatus(Short vendorStatus) {
        this.vendorStatus = vendorStatus;
    }
    @Column(name="VENDOR_CODE")
    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }
    @Column(name="VENDOR_NAME")
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }
    @Column(name="VENDOR_MAIL")
    public String getVendorMail() {
        return vendorMail;
    }

    public void setVendorMail(String vendorMail) {
        this.vendorMail = vendorMail == null ? null : vendorMail.trim();
    }
    @Column(name="CONTACT")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }
    @Column(name="TELEPHONE")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    @Column(name="CORPORATE")
    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate == null ? null : corporate.trim();
    }
    @Column(name="BUS_LEN_FILE")
    public BigDecimal getBusLenFile() {
        return busLenFile;
    }

    public void setBusLenFile(BigDecimal busLenFile) {
        this.busLenFile = busLenFile;
    }
    @Column(name="COMPANY_TYPE")
    public Short getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Short companyType) {
        this.companyType = companyType;
    }
    @Column(name="POSTCODE")
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
    @Column(name="WORKER_COUNT")
    public Long getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(Long workerCount) {
        this.workerCount = workerCount;
    }
    @Column(name="TECHNICIANS_COUNT")
    public Long getTechniciansCount() {
        return techniciansCount;
    }

    public void setTechniciansCount(Long techniciansCount) {
        this.techniciansCount = techniciansCount;
    }
    @Column(name="CAPITAL")
    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }
    @Column(name="SALES_VOLUME")
    public BigDecimal getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(BigDecimal salesVolume) {
        this.salesVolume = salesVolume;
    }
    @Column(name="ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    @Column(name="ORG_CODE_PIC_FILE")
    public BigDecimal getOrgCodePicFile() {
        return orgCodePicFile;
    }

    public void setOrgCodePicFile(BigDecimal orgCodePicFile) {
        this.orgCodePicFile = orgCodePicFile;
    }
    @Column(name="CREDIT_CERTIFICATE_FILE")
    public String getCreditCertificateFile() {
        return creditCertificateFile;
    }

    public void setCreditCertificateFile(String creditCertificateFile) {
        this.creditCertificateFile = creditCertificateFile == null ? null : creditCertificateFile.trim();
    }
    @Column(name="PRODUCTS")
    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products == null ? null : products.trim();
    }
    
    @Column(name="FACTORY_PROVINCE")
    public Long getFactoryProvince() {
		return factoryProvince;
	}

	public void setFactoryProvince(Long factoryProvince) {
		this.factoryProvince = factoryProvince;
	}

	@Column(name="FACTORY_CITIES")
	public Long getFactoryCities() {
		return factoryCities;
	}

	public void setFactoryCities(Long factoryCities) {
		this.factoryCities = factoryCities;
	}

	@Column(name="FACTORY_COUNTRY")
	public Long getFactoryCountry() {
		return factoryCountry;
	}

	public void setFactoryCountry(Long factoryCountry) {
		this.factoryCountry = factoryCountry;
	}

   
   
 
    
    
    @Column(name="FACTORY_ADDRESS")
    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress == null ? null : factoryAddress.trim();
    }
    @Column(name="OPEN_BANK")
    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank == null ? null : openBank.trim();
    }
    @Column(name="ACCOUNT")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }
    @Column(name="BANK_PIC_FILE")
    public BigDecimal getBankPicFile() {
        return bankPicFile;
    }

    public void setBankPicFile(BigDecimal bankPicFile) {
        this.bankPicFile = bankPicFile;
    }
    @Column(name="TAX_NUMBER")
    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber == null ? null : taxNumber.trim();
    }
    @Column(name="TAX_PIC_FILE")
    public BigDecimal getTaxPicFile() {
        return taxPicFile;
    }

    public void setTaxPicFile(BigDecimal taxPicFile) {
        this.taxPicFile = taxPicFile;
    }
    @Column(name="WEBSITE")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }
    @Column(name="REG_FUND")
    public BigDecimal getRegFund() {
        return regFund;
    }

    public void setRegFund(BigDecimal regFund) {
        this.regFund = regFund;
    }
    @Column(name="VENDOR_LEVEL")
    public String getVendorLevel() {
        return vendorLevel;
    }

    public void setVendorLevel(String vendorLevel) {
        this.vendorLevel = vendorLevel == null ? null : vendorLevel.trim();
    }
    @Column(name="ABSTRACT_FILE")
    public BigDecimal getAbstractFile() {
        return abstractFile;
    }

    public void setAbstractFile(BigDecimal abstractFile) {
        this.abstractFile = abstractFile;
    }
    @Column(name="REG_TIME")
    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
    @Column(name="UPDATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    @Column(name="INFO_CHECK_STATUS")
    public Short getInfoCheckStatus() {
        return infoCheckStatus;
    }

    public void setInfoCheckStatus(Short infoCheckStatus) {
        this.infoCheckStatus = infoCheckStatus;
    }
    @Column(name="START_EVALUATE")
    public Short getStartEvaluate() {
        return startEvaluate;
    }

    public void setStartEvaluate(Short startEvaluate) {
        this.startEvaluate = startEvaluate;
    }
    @Column(name="BASE_FACTORY")
    public String getBaseFactory() {
        return baseFactory;
    }

    public void setBaseFactory(String baseFactory) {
        this.baseFactory = baseFactory == null ? null : baseFactory.trim();
    }
    @Column(name="VENDOR_SHORT_NAME")
    public String getVendorShortName() {
        return vendorShortName;
    }

    public void setVendorShortName(String vendorShortName) {
        this.vendorShortName = vendorShortName == null ? null : vendorShortName.trim();
    }
    @Column(name="VENDOR_SCORE")
    public BigDecimal getVendorScore() {
        return vendorScore;
    }

    public void setVendorScore(BigDecimal vendorScore) {
        this.vendorScore = vendorScore;
    }
    
    @Column(name="ADDRESS_PROVINCE")
    public Long getAddressProvince() {
		return addressProvince;
	}

	public void setAddressProvince(Long addressProvince) {
		this.addressProvince = addressProvince;
	}

	@Column(name="ADDRESS_COUNTRY")
	public Long getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(Long addressCountry) {
		this.addressCountry = addressCountry;
	}

    
    
    @Column(name="ADDRESS_CITIES") 
    public Long getAddressCities() {
    	return addressCities;
    }
    
    public void setAddressCities(Long addressCities) {
    	this.addressCities = addressCities;
    }
    
    @Column(name="ADDRESS_ADDR")
    public String getAddressAddr() {
        return addressAddr;
    }


	public void setAddressAddr(String addressAddr) {
        this.addressAddr = addressAddr == null ? null : addressAddr.trim();
    }
    @Column(name="BUS_LEN_NUMBER")
    public String getBusLenNumber() {
        return busLenNumber;
    }

    public void setBusLenNumber(String busLenNumber) {
        this.busLenNumber = busLenNumber == null ? null : busLenNumber.trim();
    }
    @Column(name="CURRENCY")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

	public String getFax() {
		return fax;
	}
	@Column(name="FAX")
	public void setFax(String fax) {
		this.fax = fax;
	}

	public Long getStart_evaluate_file() {
		return start_evaluate_file;
	}

	public void setStart_evaluate_file(Long start_evaluate_file) {
		this.start_evaluate_file = start_evaluate_file;
	}

	public String getVendor_type() {
		return vendor_type;
	}

	public void setVendor_type(String vendor_type) {
		this.vendor_type = vendor_type;
	}

	public Integer getVendor_technology_score() {
		return vendor_technology_score;
	}

	public void setVendor_technology_score(Integer vendor_technology_score) {
		this.vendor_technology_score = vendor_technology_score;
	}

	public Integer getVendor_quality_score() {
		return vendor_quality_score;
	}

	public void setVendor_quality_score(Integer vendor_quality_score) {
		this.vendor_quality_score = vendor_quality_score;
	}

	public Integer getVendor_bussiness_score() {
		return vendor_bussiness_score;
	}

	public void setVendor_bussiness_score(Integer vendor_bussiness_score) {
		this.vendor_bussiness_score = vendor_bussiness_score;
	}

	public Integer getVendor_logistics_score() {
		return vendor_logistics_score;
	}

	public void setVendor_logistics_score(Integer vendor_logistics_score) {
		this.vendor_logistics_score = vendor_logistics_score;
	}

	public Integer getProtocol_status() {
		return protocol_status;
	}

	public void setProtocol_status(Integer protocol_status) {
		this.protocol_status = protocol_status;
	}

	public Integer getUc_status() {
		return uc_status;
	}

	public void setUc_status(Integer uc_status) {
		this.uc_status = uc_status;
	}
    
}