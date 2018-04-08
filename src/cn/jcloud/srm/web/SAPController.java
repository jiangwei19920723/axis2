package cn.jcloud.srm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jcloud.srm.quartz.GetMaterial;
import cn.jcloud.srm.quartz.SendSAPPostatus;
import cn.jcloud.srm.quartz.SendSAPRecord;
import cn.jcloud.srm.quartz.SendSAPconfirm;
import cn.jcloud.srm.quartz.SendVendorContract;

/**
 * @author 蒋维
 * @date 创建时间：2017年11月10日 下午4:52:58
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Controller
public class SAPController {
	@Autowired
	private GetMaterial mtl;
	@Autowired
	private SendVendorContract contract;
	@Autowired
	private SendSAPRecord record;
	@Autowired
	private SendSAPPostatus postatus;
	@Autowired
	private SendSAPconfirm confirm;

	@RequestMapping("sendVendorContract")
	@ResponseBody
	public void sendVendorContract() {
		contract.run();
	}

	@RequestMapping("SendSAPRecord")
	@ResponseBody
	public void sendSAPRecord() {
		record.run();
	}

	@RequestMapping("sendSAPPostatus")
	@ResponseBody
	public void sendSAPPostatus() {
		postatus.run();
	}

	@RequestMapping("sendSAPconfirm")
	@ResponseBody
	public void sendSAPconfirm() {
		confirm.run();
	}

	/**
	 * sap物料同步
	 */
	@RequestMapping("sendSAPmtl")
	@ResponseBody
	public void sendSAPmtl() {
		mtl.run();
	}
}
