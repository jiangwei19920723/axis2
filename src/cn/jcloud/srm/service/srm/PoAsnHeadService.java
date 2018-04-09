package cn.jcloud.srm.service.srm;

import java.util.List;

import cn.jcloud.srm.entity.srm.PoAsnHead;
import cn.jcloud.srm.service.BaseService;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午2:56:23
* @version 1.0
*/
public interface PoAsnHeadService extends BaseService<PoAsnHead> {
	public List<PoAsnHead> getBystatus(int status);
}
