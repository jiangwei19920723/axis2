package cn.jcloud.srm.service.srm;

import java.util.List;

import cn.jcloud.srm.entity.srm.PoAsnLine;
import cn.jcloud.srm.service.BaseService;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午3:13:33
* @version 1.0
*/
public interface PoAsnLineService extends BaseService<PoAsnLine> {
	public List<PoAsnLine> getByOrderIdAndStatus(Long orderId,int status);
}
