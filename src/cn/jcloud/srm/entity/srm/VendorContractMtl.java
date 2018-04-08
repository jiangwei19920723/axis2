package cn.jcloud.srm.entity.srm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VENDOR_CONTRACT_MTL")
public class VendorContractMtl {
    private Long id;

    private String stage_price;

    private String single_price;

    private String mtl_name;

    private Long mtl_id;

    private String mtl_code;

    private Long contract_id;

    private String evers;

    private String mwskz;

	
    @Id
    @Column(name="contract_mtl_id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStage_price() {
		return stage_price;
	}

	public void setStage_price(String stage_price) {
		this.stage_price = stage_price;
	}

	public String getSingle_price() {
		return single_price;
	}

	public void setSingle_price(String single_price) {
		this.single_price = single_price;
	}

	public String getMtl_name() {
		return mtl_name;
	}

	public void setMtl_name(String mtl_name) {
		this.mtl_name = mtl_name;
	}

	public Long getMtl_id() {
		return mtl_id;
	}

	public void setMtl_id(Long mtl_id) {
		this.mtl_id = mtl_id;
	}

	public String getMtl_code() {
		return mtl_code;
	}

	public void setMtl_code(String mtl_code) {
		this.mtl_code = mtl_code;
	}

	public Long getContract_id() {
		return contract_id;
	}

	public void setContract_id(Long contract_id) {
		this.contract_id = contract_id;
	}

	public String getEvers() {
		return evers;
	}

	public void setEvers(String evers) {
		this.evers = evers;
	}

	public String getMwskz() {
		return mwskz;
	}

	public void setMwskz(String mwskz) {
		this.mwskz = mwskz;
	}

  
}