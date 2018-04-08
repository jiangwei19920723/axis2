package cn.jcloud.srm.beans.oa;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月20日 下午3:51:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OAMsgResult {
	private int result;
	private int errorNumber;
	private String errorMessage;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getErrorNumber() {
		return errorNumber;
	}
	public void setErrorNumber(int errorNumber) {
		this.errorNumber = errorNumber;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
