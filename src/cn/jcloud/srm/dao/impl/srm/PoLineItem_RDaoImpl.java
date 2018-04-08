package cn.jcloud.srm.dao.impl.srm;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.PoLineItem_RDao;
import cn.jcloud.srm.entity.srm.PoLineItem_R;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月28日 上午10:40:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoLineItem_RDaoImpl extends AbstractBaseDao<PoLineItem_R> implements PoLineItem_RDao {

	@Override
	protected Class<PoLineItem_R> getEntityClass() {
		return PoLineItem_R.class;
	}

}
