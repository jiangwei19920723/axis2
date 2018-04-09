package cn.jcloud.srm.dao.impl.srm;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.PoAsnHeadDao;
import cn.jcloud.srm.entity.srm.PoAsnHead;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午2:53:36
* @version 1.0
*/
@Repository
public class PoAsnHeadDaoImpl extends AbstractBaseDao<PoAsnHead> implements PoAsnHeadDao {

	@Override
	public List<PoAsnHead> findByStatus(int status) {
		Query query = getSession().createQuery("from PoAsnHead where send_status=:send_status");
		query.setParameter("send_status", status);
		return query.list();
	}

	@Override
	protected Class<PoAsnHead> getEntityClass() {
		// TODO Auto-generated method stub
		return PoAsnHead.class;
	}

}
