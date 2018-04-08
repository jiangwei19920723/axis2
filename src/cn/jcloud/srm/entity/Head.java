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
 * @date 创建时间：2017年9月12日 上午11:07:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="head")
public class Head {
	private int id;//id
	private Date create_time;//创建时间
	private String msgId;//消息id
	private String busId;//业务id
	private String tlgId;//接口编码
	private String tlgName;//接口名称
	private String dtsEnd;//发送时间
	private String sender;//发送方
	private String receiver;//接收方
	private String freeUse;//备用字段
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="intId")
	@SequenceGenerator(name="intId",sequenceName="seq_head_id",allocationSize=1)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="msg_id")
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	@Column(name="bus_id")
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	@Column(name="tlg_id")
	public String getTlgId() {
		return tlgId;
	}
	public void setTlgId(String tlgId) {
		this.tlgId = tlgId;
	}
	@Column(name="tlg_name")
	public String getTlgName() {
		return tlgName;
	}
	public void setTlgName(String tlgName) {
		this.tlgName = tlgName;
	}
	@Column(name="dts_end")
	public String getDtsEnd() {
		return dtsEnd;
	}
	public void setDtsEnd(String dtsEnd) {
		this.dtsEnd = dtsEnd;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	@Column(name="free_use")
	public String getFreeUse() {
		return freeUse;
	}
	public void setFreeUse(String freeUse) {
		this.freeUse = freeUse;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

}
