package cn.jcloud.srm.common.msg;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月14日 上午10:58:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class DipatchListMsgResult extends MsgResult {
	private String vbeln;
	private String posnr;
	public String getVbeln() {
		return vbeln;
	}
	public void setVbeln(String vbeln) {
		this.vbeln = vbeln;
	}
	public String getPosnr() {
		return posnr;
	}
	public void setPosnr(String posnr) {
		this.posnr = posnr;
	}
	
}
