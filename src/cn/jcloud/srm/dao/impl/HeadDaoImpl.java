package cn.jcloud.srm.dao.impl;

import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.HeadDao;
import cn.jcloud.srm.entity.Head;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 上午11:18:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class HeadDaoImpl extends AbstractBaseDao<Head> implements HeadDao {

	@Override
	protected Class<Head> getEntityClass() {
		return Head.class;
	}
	
}
