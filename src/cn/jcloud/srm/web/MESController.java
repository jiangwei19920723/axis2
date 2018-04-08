package cn.jcloud.srm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jcloud.srm.quartz.SendMESDeliverynote;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月13日 上午9:13:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Controller
public class MESController {
	@Autowired
	private SendMESDeliverynote deliverynote;
	/**
	 * MES送货单信息接口
	 * 
	 * @param item
	 * @return
	 */
	@RequestMapping("toMESDeliverynote")
	@ResponseBody
	public void toMESDeliverynote() {
		deliverynote.run();
	}
}
