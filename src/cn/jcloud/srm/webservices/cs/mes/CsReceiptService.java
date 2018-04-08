package cn.jcloud.srm.webservices.cs.mes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.jcloud.srm.beans.cs.mes.MEStoSRM_ReceiptRequest;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;

/** 
 * 收货单
 * @author  蒋维 
 * @date 创建时间：2018年3月30日 上午10:36:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("CsReceiptService")
@Scope("prototype")
public class CsReceiptService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CsReceiptService.class);
	public MsgResult MEStoSRM_Receipt(Header header,MEStoSRM_ReceiptRequest request){
		return null;
	}

}
