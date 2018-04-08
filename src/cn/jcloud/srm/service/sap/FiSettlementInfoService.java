package cn.jcloud.srm.service.sap;

import java.util.List;

import cn.jcloud.srm.entity.sap.FiSettlementInfo;
import cn.jcloud.srm.service.BaseService;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月16日 上午10:34:42
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public interface FiSettlementInfoService extends BaseService<FiSettlementInfo> {
	public FiSettlementInfo getBysettlementCode(String code);

	public List<FiSettlementInfo> getByStates(String pushState, Integer confirm);

	public FiSettlementInfo getByReceivingVoucherAndReceivingLineItem(String receivingVoucher,
			String receivingLineItem);
}
