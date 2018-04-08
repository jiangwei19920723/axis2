package cn.jcloud.srm.beans.srm;

/** 
 * 设计变更中止流程_物料信息
 * @author  蒋维 
 * @date 创建时间：2017年10月17日 下午5:15:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Items {
	private String change_type;
	private String before_item_name;
	private String before_item_code;
	private String before_remark;
	private String before_file_show;
	private String after_item_name;
	private String after_item_code;
	private String after_remark;
	private String after_file_show;
	private String before_item_id;
	private String after_item_id;
	private long after_file;
	private long before_file;
	public String getChange_type() {
		return change_type;
	}
	public void setChange_type(String change_type) {
		this.change_type = change_type;
	}
	public String getBefore_item_name() {
		return before_item_name;
	}
	public void setBefore_item_name(String before_item_name) {
		this.before_item_name = before_item_name;
	}
	public String getBefore_item_code() {
		return before_item_code;
	}
	public void setBefore_item_code(String before_item_code) {
		this.before_item_code = before_item_code;
	}
	public String getBefore_remark() {
		return before_remark;
	}
	public void setBefore_remark(String before_remark) {
		this.before_remark = before_remark;
	}
	public String getBefore_file_show() {
		return before_file_show;
	}
	public void setBefore_file_show(String before_file_show) {
		this.before_file_show = before_file_show;
	}
	public String getAfter_item_name() {
		return after_item_name;
	}
	public void setAfter_item_name(String after_item_name) {
		this.after_item_name = after_item_name;
	}
	public String getAfter_item_code() {
		return after_item_code;
	}
	public void setAfter_item_code(String after_item_code) {
		this.after_item_code = after_item_code;
	}
	public String getAfter_remark() {
		return after_remark;
	}
	public void setAfter_remark(String after_remark) {
		this.after_remark = after_remark;
	}
	public String getAfter_file_show() {
		return after_file_show;
	}
	public void setAfter_file_show(String after_file_show) {
		this.after_file_show = after_file_show;
	}
	public String getBefore_item_id() {
		return before_item_id;
	}
	public void setBefore_item_id(String before_item_id) {
		this.before_item_id = before_item_id;
	}
	public String getAfter_item_id() {
		return after_item_id;
	}
	public void setAfter_item_id(String after_item_id) {
		this.after_item_id = after_item_id;
	}
	public long getAfter_file() {
		return after_file;
	}
	public void setAfter_file(long after_file) {
		this.after_file = after_file;
	}
	public long getBefore_file() {
		return before_file;
	}
	public void setBefore_file(long before_file) {
		this.before_file = before_file;
	}
	
}
