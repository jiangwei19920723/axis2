package cn.jcloud.srm.common.msg;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月3日 下午3:13:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AsnMsgResult extends MsgResult {
	private List<String> asnids;

	public List<String> getAsnids() {
		return asnids;
	}

	public void setAsnids(List<String> asnids) {
		this.asnids = asnids;
	}
}
