package cn.jcloud.srm.common.msg;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����11:28:03 
 * @version 1.0 
 * @parameter  ��Ϣͷ
 * @since  
 * @return  
 */
public class Header {
	private String msgId;//消息id
	private String busId;//业务id
	private String tlgId;//接口编码
	private String tlgName;//接口名称
	private String dtsEnd;//发送时间
	private String sender;//发送方
	private String receiver;//接收方
	private String freeUse;//备用字段

	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getTlgId() {
		return tlgId;
	}
	public void setTlgId(String tlgId) {
		this.tlgId = tlgId;
	}
	public String getTlgName() {
		return tlgName;
	}
	public void setTlgName(String tlgName) {
		this.tlgName = tlgName;
	}
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
	public String getFreeUse() {
		return freeUse;
	}
	public void setFreeUse(String freeUse) {
		this.freeUse = freeUse;
	}

	
}
