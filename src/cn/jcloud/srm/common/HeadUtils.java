package cn.jcloud.srm.common;

import java.util.Date;

import cn.jcloud.srm.common.msg.Header;
import cn.jcloud.srm.entity.Head;
import cn.jcloud.srm.service.HeadService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月14日 上午11:44:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class HeadUtils {
	public static int save(HeadService headService,Header header){
		Head head = new Head();
		head.setBusId(header.getBusId());
		head.setDtsEnd(header.getDtsEnd());
		head.setFreeUse(header.getFreeUse() !=null?header.getFreeUse():"");
		head.setMsgId(header.getMsgId());
		head.setReceiver(header.getReceiver());
		head.setSender(header.getSender());
		head.setTlgId(header.getTlgId());
		head.setTlgName(header.getTlgName());
		head.setCreate_time(new Date());
		headService.save(head);
		return head.getId();
	}
}
