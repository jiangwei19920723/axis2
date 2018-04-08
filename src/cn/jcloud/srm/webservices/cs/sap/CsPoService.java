package cn.jcloud.srm.webservices.cs.sap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.jcloud.srm.beans.cs.sap.IF_SAP2SRM_PORequest;
import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.common.msg.MsgResult;

/**
 * 采购订单
* @author 蒋维
* @date 创建时间：2018年4月3日 下午3:41:06
* @version 1.0
*/
@Service("CsPoService")
@Scope("prototype")
public class CsPoService {
	public MsgResult IF_SAP2SRM_PO(Header header,IF_SAP2SRM_PORequest request){
		return null;
	}
}
