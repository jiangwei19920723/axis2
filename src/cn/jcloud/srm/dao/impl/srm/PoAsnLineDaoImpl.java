package cn.jcloud.srm.dao.impl.srm;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.PoAsnLineDao;
import cn.jcloud.srm.entity.srm.PoAsnLine;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午3:02:08
* @version 1.0
*/
@Repository
public class PoAsnLineDaoImpl extends AbstractBaseDao<PoAsnLine> implements PoAsnLineDao {

	@Override
	protected Class<PoAsnLine> getEntityClass() {
		// TODO Auto-generated method stub
		return PoAsnLine.class;
	}

	@Override
	public List<PoAsnLine> findByOrderIdAndStatus(Long orderId, int status) {
		Query query = getSession().createQuery("from PoAsnLine where order_id=:order_id and asn_line_status=:asn_line_status");
		query.setParameter("asn_line_status", status);
		query.setParameter("order_id", orderId);
		return query.list();
	}

}
