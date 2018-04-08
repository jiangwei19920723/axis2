package cn.jcloud.srm.service.impl.sap;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.FiSettlementInfoDao;
import cn.jcloud.srm.entity.sap.FiSettlementInfo;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.FiSettlementInfoService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月16日 上午10:35:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class FiSettlementInfoServiceImpl extends AbstractbaseService<FiSettlementInfo, BaseDao<FiSettlementInfo>> implements FiSettlementInfoService {
	@Override
	public FiSettlementInfo getBysettlementCode(String code) {
		return ((FiSettlementInfoDao) dao).findBysettlementCode(code);
	}

	@Override
	public List<FiSettlementInfo> getByStates(String pushState, Integer confirm) {
		return ((FiSettlementInfoDao) dao).findByStates(pushState, confirm);
	}

	@Override
	public FiSettlementInfo getByReceivingVoucherAndReceivingLineItem(String receivingVoucher,
			String receivingLineItem) {
		return ((FiSettlementInfoDao) dao).findByReceivingVoucherAndReceivingLineItem(receivingVoucher, receivingLineItem);
	}

}
