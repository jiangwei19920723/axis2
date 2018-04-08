package cn.jcloud.srm.dao.sap;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.FiSettlementInfo;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 上午10:33:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface FiSettlementInfoDao extends BaseDao<FiSettlementInfo> {
	public FiSettlementInfo findBysettlementCode(String code);
	public List<FiSettlementInfo> findByStates(String pushState, Integer confirm);
	public FiSettlementInfo findByReceivingVoucherAndReceivingLineItem(String receivingVoucher,String receivingLineItem);
}
