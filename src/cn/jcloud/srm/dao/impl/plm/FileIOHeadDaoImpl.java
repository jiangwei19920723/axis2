package cn.jcloud.srm.dao.impl.plm;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.plm.FileIOHeadDao;
import cn.jcloud.srm.entity.plm.FileIOHead;

/**
 * @author 蒋维
 * @date 创建时间：2017年10月10日 下午2:08:53
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Repository
public class FileIOHeadDaoImpl extends AbstractBaseDao<FileIOHead> implements FileIOHeadDao {

	@Override
	public FileIOHead findByCode(String code) {
		Query query = getSession().createQuery("from FileIOHead where code =:code");
		query.setParameter("code", code);
		return (FileIOHead) query.uniqueResult();
	}

	@Override
	protected Class<FileIOHead> getEntityClass() {
		return FileIOHead.class;
	}

}
