package cn.jcloud.srm.dao.impl.mes;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.mes.AsnInInfoDao;
import cn.jcloud.srm.entity.mes.AsnInInfo;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年11月3日 下午2:39:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class AsnInInfoDaoImpl extends AbstractBaseDao<AsnInInfo> implements AsnInInfoDao {

	@Override
	protected Class<AsnInInfo> getEntityClass() {
		return AsnInInfo.class;
	}

}
