package cn.jcloud.srm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月20日 下午3:35:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="SRM_FLOW_STATE")
public class SRMFlowState {
	private long flowId;
	private String flowType;
	private int handle;
	private long flowState;
	private int srmhandle;
	private Date create_time;
	private Date update_time;
	@Id
	@Column(name="flow_id")
	public long getFlowId() {
		return flowId;
	}
	public void setFlowId(long flowId) {
		this.flowId = flowId;
	}
	@Column(name="flow_type")
	public String getFlowType() {
		return flowType;
	}
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}
	
	public int getHandle() {
		return handle;
	}
	public void setHandle(int handle) {
		this.handle = handle;
	}
	@Column(name="flow_state")
	public long getFlowState() {
		return flowState;
	}
	public void setFlowState(long flowState) {
		this.flowState = flowState;
	}
	@Column(name="srm_handle")
	public int getSrmhandle() {
		return srmhandle;
	}
	public void setSrmhandle(int srmhandle) {
		this.srmhandle = srmhandle;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	
}
