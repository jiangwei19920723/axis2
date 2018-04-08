package cn.jcloud.srm.common.msg;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 下午2:06:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class MsgResult {
	private char ztype;//消息类型: S 成功,E 错误  
	private String zmessage;//消息文本
	private String freeUse1;
	private String freeUse2;
	private String freeUse3;
	private String freeUse4;
	private String freeUse5;
	public char getZtype() {
		return ztype;
	}
	public void setZtype(char ztype) {
		this.ztype = ztype;
	}
	public String getZmessage() {
		return zmessage;
	}
	public void setZmessage(String zmessage) {
		this.zmessage = zmessage;
	}
	public String getFreeUse1() {
		return freeUse1;
	}
	public void setFreeUse1(String freeUse1) {
		this.freeUse1 = freeUse1;
	}
	public String getFreeUse2() {
		return freeUse2;
	}
	public void setFreeUse2(String freeUse2) {
		this.freeUse2 = freeUse2;
	}
	public String getFreeUse3() {
		return freeUse3;
	}
	public void setFreeUse3(String freeUse3) {
		this.freeUse3 = freeUse3;
	}
	public String getFreeUse4() {
		return freeUse4;
	}
	public void setFreeUse4(String freeUse4) {
		this.freeUse4 = freeUse4;
	}
	public String getFreeUse5() {
		return freeUse5;
	}
	public void setFreeUse5(String freeUse5) {
		this.freeUse5 = freeUse5;
	}
	
}
