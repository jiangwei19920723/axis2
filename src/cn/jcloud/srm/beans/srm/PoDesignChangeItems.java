package cn.jcloud.srm.beans.srm;

/** 
 * 设变目标价格管理流程_物料信息
 * @author  蒋维 
 * @date 创建时间：2017年10月17日 下午5:28:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PoDesignChangeItems {
	private String item_code;
	private String item_name;
	private String price;
	private String remark_list;
	private String line_id;
	private String item_id;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getRemark_list() {
		return remark_list;
	}
	public void setRemark_list(String remark_list) {
		this.remark_list = remark_list;
	}
	public String getLine_id() {
		return line_id;
	}
	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	
}
