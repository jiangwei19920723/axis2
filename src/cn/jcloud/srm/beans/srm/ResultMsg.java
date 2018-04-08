package cn.jcloud.srm.beans.srm;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月19日 下午3:30:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class ResultMsg {
	private int status;
	private String error_msg;
	private Long flow_id;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public Long getFlow_id() {
		return flow_id;
	}
	public void setFlow_id(Long flow_id) {
		this.flow_id = flow_id;
	}
	
}
