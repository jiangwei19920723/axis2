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
public class RefundMsgResult extends MsgResult {
	private List<String> refund_numbers;

	public List<String> getRefund_numbers() {
		return refund_numbers;
	}

	public void setRefund_numbers(List<String> refund_numbers) {
		this.refund_numbers = refund_numbers;
	}


}
