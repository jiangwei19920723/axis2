package cn.jcloud.srm.dao.impl.cs.sap;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.cs.sap.PoInventoryOrderDao;
import cn.jcloud.srm.entity.cs.sap.PoInventoryOrder;

/**
* @author 蒋维
* @date 创建时间：2018年4月9日 上午11:56:50
* @version 1.0
*/
@Repository
public class PoInventoryOrderDaoImpl extends AbstractBaseDao<PoInventoryOrder> implements PoInventoryOrderDao {

	@Override
	protected Class<PoInventoryOrder> getEntityClass() {
		// TODO Auto-generated method stub
		return PoInventoryOrder.class;
	}
	@Override
	public void save(PoInventoryOrder order) {
		order.setCreate_time(new Date());
		order.setUpdate_by("0");
		order.setUpdate_time(new Date());
		order.setUpdate_by("0");
		order.setDistrib_type("P3");
		order.setClose_status(0);
		order.setDelete_status(0);
		order.setStatus(0);
		order.setSend_count(BigDecimal.valueOf(0));
		order.setReceipt_count(BigDecimal.valueOf(0));
		order.setAccept_count(BigDecimal.valueOf(0));
		super.save(order);
	}

}
