package cn.jcloud.srm.common.msg;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月2日 上午9:36:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class MaterialPlanMsgResult extends MsgResult {
	private List<String> materialPlan_codes;

	public List<String> getMaterialPlan_codes() {
		return materialPlan_codes;
	}

	public void setMaterialPlan_codes(List<String> materialPlan_codes) {
		this.materialPlan_codes = materialPlan_codes;
	}
	
}
