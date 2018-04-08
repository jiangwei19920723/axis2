package cn.jcloud.srm.dao.impl.mes;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.mes.AsnOutInfoDao;
import cn.jcloud.srm.entity.mes.AsnOutInfo;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月4日 上午10:01:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class AsnOutInfoDaoImpl extends AbstractBaseDao<AsnOutInfo> implements AsnOutInfoDao {

	@Override
	protected Class<AsnOutInfo> getEntityClass() {
		return AsnOutInfo.class;
	}

}
