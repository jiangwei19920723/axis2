package cn.jcloud.srm.dao.impl.cs.sap;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.cs.sap.PoInventoryPlanDao;
import cn.jcloud.srm.entity.cs.sap.PoInventoryPlan;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 下午12:00:19
* @version 1.0
*/
@Repository
public class PoInventoryPlanDaoImpl extends AbstractBaseDao<PoInventoryPlan> implements PoInventoryPlanDao{

	@Override
	protected Class<PoInventoryPlan> getEntityClass() {
		// TODO Auto-generated method stub
		return PoInventoryPlan.class;
	}

}
