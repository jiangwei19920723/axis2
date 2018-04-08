package cn.jcloud.srm.dao.impl.srm;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.srm.PoInfoPlanLineItem2_RDao;
import cn.jcloud.srm.entity.srm.PoInfoPlanLineItem2_R;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年12月8日 上午9:32:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoInfoPlanLineItem2_RDaoImpl extends AbstractBaseDao<PoInfoPlanLineItem2_R> implements PoInfoPlanLineItem2_RDao {

	@Override
	protected Class<PoInfoPlanLineItem2_R> getEntityClass() {
		return PoInfoPlanLineItem2_R.class;
	}

}
