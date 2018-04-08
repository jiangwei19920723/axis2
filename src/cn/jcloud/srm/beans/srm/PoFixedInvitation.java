package cn.jcloud.srm.beans.srm;

import java.util.List;
import java.util.Map;

/**
 * 定点询价流程
 * 
 * @author zhl
 * @time 2017年10月17日 下午7:04:42
 * @Description TODO
 */
public class PoFixedInvitation {
	private String invitation_title;
	private String car_type;
	private String offer_stop_date;
	private Long invitation_file;
	private String business_by;
	private String business_number;
	private String technology_by;
	private String technology_number;
	private String scheme;
	private String scheme_back;
	private String invitation_id;
	private String strategy_id;
	private String strategy_code;
	private String fixed_code;
	private List<PoFixedRequestItems> items;
	private List<PoFixedRequstVendors> vendors;
	private Map<String,List<PoFixedInvitationTechnologyDetails>> vendorDetailMap;
	
	public Map<String, List<PoFixedInvitationTechnologyDetails>> getVendorDetailMap() {
		return vendorDetailMap;
	}

	public void setVendorDetailMap(Map<String, List<PoFixedInvitationTechnologyDetails>> vendorDetailMap) {
		this.vendorDetailMap = vendorDetailMap;
	}

	public String getInvitation_title() {
		return invitation_title;
	}

	public void setInvitation_title(String invitation_title) {
		this.invitation_title = invitation_title;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getOffer_stop_date() {
		return offer_stop_date;
	}

	public void setOffer_stop_date(String offer_stop_date) {
		this.offer_stop_date = offer_stop_date;
	}

	public Long getInvitation_file() {
		return invitation_file;
	}

	public void setInvitation_file(Long invitation_file) {
		this.invitation_file = invitation_file;
	}

	public String getBusiness_by() {
		return business_by;
	}

	public void setBusiness_by(String business_by) {
		this.business_by = business_by;
	}

	public String getBusiness_number() {
		return business_number;
	}

	public void setBusiness_number(String business_number) {
		this.business_number = business_number;
	}

	public String getTechnology_by() {
		return technology_by;
	}

	public void setTechnology_by(String technology_by) {
		this.technology_by = technology_by;
	}

	public String getTechnology_number() {
		return technology_number;
	}

	public void setTechnology_number(String technology_number) {
		this.technology_number = technology_number;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getScheme_back() {
		return scheme_back;
	}

	public void setScheme_back(String scheme_back) {
		this.scheme_back = scheme_back;
	}

	public String getInvitation_id() {
		return invitation_id;
	}

	public void setInvitation_id(String invitation_id) {
		this.invitation_id = invitation_id;
	}

	public String getStrategy_id() {
		return strategy_id;
	}

	public void setStrategy_id(String strategy_id) {
		this.strategy_id = strategy_id;
	}

	public String getStrategy_code() {
		return strategy_code;
	}

	public void setStrategy_code(String strategy_code) {
		this.strategy_code = strategy_code;
	}

	public String getFixed_code() {
		return fixed_code;
	}

	public void setFixed_code(String fixed_code) {
		this.fixed_code = fixed_code;
	}

	public List<PoFixedRequestItems> getItems() {
		return items;
	}

	public void setItems(List<PoFixedRequestItems> items) {
		this.items = items;
	}

	public List<PoFixedRequstVendors> getVendors() {
		return vendors;
	}

	public void setVendors(List<PoFixedRequstVendors> vendors) {
		this.vendors = vendors;
	}


}
