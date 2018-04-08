package cn.jcloud.srm.webservices.cs.mes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.jcloud.srm.beans.cs.mes.WMStoSRM_3PLRequest;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;

/** 
 * 拉动需求
 * @author  蒋维 
 * @date 创建时间：2018年3月30日 上午10:36:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("Cs3plService")
@Scope("prototype")
public class Cs3plService {
	private static final Logger LOGGER = LoggerFactory.getLogger(Cs3plService.class);
	public MsgResult WMStoSRM_3PL(Header header,WMStoSRM_3PLRequest request){
		return null;
	}

}
