package cn.jcloud.srm.webservices.cs.mes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.jcloud.srm.beans.cs.mes.MEStoSRM_ReturnedRequest;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;

/** 
 * 退货单
 * @author  蒋维 
 * @date 创建时间：2018年3月30日 上午10:36:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("CsReturnedService")
@Scope("prototype")
public class CsReturnedService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CsReturnedService.class);
	public MsgResult MEStoSRM_Returned(Header header,MEStoSRM_ReturnedRequest request){
		return null;
	}

}
