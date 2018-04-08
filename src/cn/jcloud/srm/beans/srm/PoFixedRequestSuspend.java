package cn.jcloud.srm.beans.srm;

import java.util.List;

/**
 * 取消定点申请流程
 * 
 * @author zhl
 * @time 2017年10月17日 下午7:32:10
 * @Description TODO
 */
public class PoFixedRequestSuspend {

	private String create_by;
	private String theme;
	private String reason;
	private String vendor_id;
	private String item_id;
	private String af_status;
	private String cancel_af_id;

	private List<PoFixedRequestSuspendItems> items;

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getAf_status() {
		return af_status;
	}

	public void setAf_status(String af_status) {
		this.af_status = af_status;
	}

	public String getCancel_af_id() {
		return cancel_af_id;
	}

	public void setCancel_af_id(String cancel_af_id) {
		this.cancel_af_id = cancel_af_id;
	}

	public List<PoFixedRequestSuspendItems> getItems() {
		return items;
	}

	public void setItems(List<PoFixedRequestSuspendItems> items) {
		this.items = items;
	}

}
