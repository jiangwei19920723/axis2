package cn.jcloud.srm.dao.impl.sap;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.PoInfoRecordDao;
import cn.jcloud.srm.entity.sap.PoInfoRecord;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 下午2:29:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class PoInfoRecordDaoImpl extends AbstractBaseDao<PoInfoRecord> implements PoInfoRecordDao {

	@Override
	protected Class<PoInfoRecord> getEntityClass() {
		return PoInfoRecord.class;
	}

}
