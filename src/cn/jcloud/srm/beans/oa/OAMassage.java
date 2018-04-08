package cn.jcloud.srm.beans.oa;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月20日 下午3:29:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OAMassage {
	private String sendUserId;
	private String[] loginNames;
	private String content;
	private String[] url;
	public String getSendUserId() {
		return sendUserId;
	}
	public void setSendUserId(String sendUserId) {
		this.sendUserId = sendUserId;
	}
	public String[] getLoginNames() {
		return loginNames;
	}
	public void setLoginNames(String[] loginNames) {
		this.loginNames = loginNames;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String[] getUrl() {
		return url;
	}
	public void setUrl(String[] url) {
		this.url = url;
	}
	
}
