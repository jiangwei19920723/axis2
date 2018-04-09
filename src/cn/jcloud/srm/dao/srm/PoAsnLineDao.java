package cn.jcloud.srm.dao.srm;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.srm.PoAsnLine;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午2:59:32
* @version 1.0
*/
public interface PoAsnLineDao extends BaseDao<PoAsnLine> {
	public List<PoAsnLine> findByOrderIdAndStatus(Long orderId,int status);
}
