package cn.jcloud.srm.beans.srm;

/**
 * 取消定点申请物料信息
 * 
 * @author zhl
 * @time 2017年10月17日 下午7:32:48
 * @Description TODO
 */
public class PoFixedRequestSuspendItems {
	private String item_name;
	private String item_code;
	private String vendor_name;
	private String vendor_code;
	private String base_factory;
	private String item_id;
	private String vendor_id;
	private String invitation_id;
	private String relation_id;

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_code() {
		return item_code;
	}

	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
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

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getInvitation_id() {
		return invitation_id;
	}

	public void setInvitation_id(String invitation_id) {
		this.invitation_id = invitation_id;
	}

	public String getRelation_id() {
		return relation_id;
	}

	public void setRelation_id(String relation_id) {
		this.relation_id = relation_id;
	}

}
