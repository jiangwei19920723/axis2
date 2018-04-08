package cn.jcloud.srm.dao.impl.plm;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.plm.FileIOBodyDao;
import cn.jcloud.srm.entity.plm.FileIOBody;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午2:15:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository
public class FileIOBodyDaoImpl extends AbstractBaseDao<FileIOBody> implements FileIOBodyDao {

	@Override
	public List<FileIOBody> findByCode(String code) {
		Query query = getSession().createQuery("from FileIOBody where code =:code");
		query.setParameter("code", code);
		return query.list();
	}

	@Override
	protected Class<FileIOBody> getEntityClass() {
		return FileIOBody.class;
	}

	@Override
	public FileIOBody findByFileInfoId(int fileInfoId) {
		Query query = getSession().createQuery("from FileIOBody where fileInfoId =:fileInfoId");
		query.setParameter("fileInfoId", fileInfoId);
		return (FileIOBody) query.uniqueResult();
	}

}
