package cn.jcloud.srm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 上午10:57:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="synchronous_state")
public class SynchronousState {
	private int id;
	private Date syncStartDate;//同步开始时间
	private Date syncEndDate;//同步结束时间
	private String interfaceName;//接口名称
	private String operationState;//操作状态
	private String syncOrAsyn;//同步\异步
	private int headId;//消息头id
	private String jsonRoute;//json数据文件路径
	private Date createTime;//创建时间
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_synchronous_state_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="sync_start_date")
	public Date getSyncStartDate() {
		return syncStartDate;
	}
	public void setSyncStartDate(Date syncStartDate) {
		this.syncStartDate = syncStartDate;
	}
	@Column(name="sync_end_date")
	public Date getSyncEndDate() {
		return syncEndDate;
	}
	public void setSyncEndDate(Date syncEndDate) {
		this.syncEndDate = syncEndDate;
	}
	@Column(name="interface_name")
	public String getInterfaceName() {
		return interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}
	@Column(name="operation_state")
	public String getOperationState() {
		return operationState;
	}
	public void setOperationState(String operationState) {
		this.operationState = operationState;
	}
	@Column(name="sync_or_asyn")
	public String getSyncOrAsyn() {
		return syncOrAsyn;
	}
	public void setSyncOrAsyn(String syncOrAsyn) {
		this.syncOrAsyn = syncOrAsyn;
	}
	@Column(name="head_id")
	public int getHeadId() {
		return headId;
	}
	public void setHeadId(int headId) {
		this.headId = headId;
	}
	@Column(name="json_route")
	public String getJsonRoute() {
		return jsonRoute;
	}
	public void setJsonRoute(String jsonRoute) {
		this.jsonRoute = jsonRoute;
	}
	@Column(name="create_time")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
