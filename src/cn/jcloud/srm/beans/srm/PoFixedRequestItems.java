package cn.jcloud.srm.beans.srm;

/**
 * 定点申请物料
 * 
 * @author zhl
 * @time 2017年10月17日 下午6:45:51
 * @Description TODO
 */
public class PoFixedRequestItems {
	private String item_code;
	private String item_name;
	private String item_type;
	private String use_mould;
	private String item_category;
	private String tec_desc;
	private Long file_to_vendor_file;
	private Long file_to_onwer_file;
	private String mould_desc;
	private String new_or_old;
	private String re_item_id;
	private String item_id;	
	
	/*
	 * 拓展字段
	 */
	private String single_use;
	public String getSingle_use() {
		return single_use;
	}

	public void setSingle_use(String single_use) {
		this.single_use = single_use;
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

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

	public String getUse_mould() {
		return use_mould;
	}

	public void setUse_mould(String use_mould) {
		this.use_mould = use_mould;
	}

	public String getItem_category() {
		return item_category;
	}

	public void setItem_category(String item_category) {
		this.item_category = item_category;
	}

	public String getTec_desc() {
		return tec_desc;
	}

	public void setTec_desc(String tec_desc) {
		this.tec_desc = tec_desc;
	}

	public Long getFile_to_vendor_file() {
		return file_to_vendor_file;
	}

	public void setFile_to_vendor_file(Long file_to_vendor_file) {
		this.file_to_vendor_file = file_to_vendor_file;
	}

	public Long getFile_to_onwer_file() {
		return file_to_onwer_file;
	}

	public void setFile_to_onwer_file(Long file_to_onwer_file) {
		this.file_to_onwer_file = file_to_onwer_file;
	}

	public String getMould_desc() {
		return mould_desc;
	}

	public void setMould_desc(String mould_desc) {
		this.mould_desc = mould_desc;
	}

	public String getNew_or_old() {
		return new_or_old;
	}

	public void setNew_or_old(String new_or_old) {
		this.new_or_old = new_or_old;
	}

	public String getRe_item_id() {
		return re_item_id;
	}

	public void setRe_item_id(String re_item_id) {
		this.re_item_id = re_item_id;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

}
