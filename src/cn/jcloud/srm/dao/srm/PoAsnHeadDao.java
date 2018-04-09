package cn.jcloud.srm.dao.srm;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.srm.PoAsnHead;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午2:46:00
* @version 1.0
*/
public interface PoAsnHeadDao extends BaseDao<PoAsnHead> {
	public List<PoAsnHead> findByStatus(int status);
}
