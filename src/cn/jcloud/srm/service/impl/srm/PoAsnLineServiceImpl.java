package cn.jcloud.srm.service.impl.srm;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.srm.PoAsnLineDao;
import cn.jcloud.srm.entity.srm.PoAsnLine;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.srm.PoAsnLineService;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午3:14:42
* @version 1.0
*/
@Service
public class PoAsnLineServiceImpl extends AbstractbaseService<PoAsnLine, BaseDao<PoAsnLine>> implements PoAsnLineService {

	@Override
	public List<PoAsnLine> getByOrderIdAndStatus(Long orderId, int status) {
		return ((PoAsnLineDao)dao).findByOrderIdAndStatus(orderId, status);
	}

}
