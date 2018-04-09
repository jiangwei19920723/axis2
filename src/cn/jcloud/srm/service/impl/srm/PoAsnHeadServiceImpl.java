package cn.jcloud.srm.service.impl.srm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.srm.PoAsnHeadDao;
import cn.jcloud.srm.entity.srm.PoAsnHead;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.srm.PoAsnHeadService;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午2:57:10
* @version 1.0
*/
@Service
public class PoAsnHeadServiceImpl extends AbstractbaseService<PoAsnHead, BaseDao<PoAsnHead>> implements PoAsnHeadService {
	@Override
	public List<PoAsnHead> getBystatus(int status) {
		return ((PoAsnHeadDao)dao).findByStatus(status);
	}

}
