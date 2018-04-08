package cn.jcloud.srm.dao.impl;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.FileInfoDao;
import cn.jcloud.srm.entity.FileInfo;

/**
 * @author 蒋维
 * @date 创建时间：2017年10月16日 下午6:16:00
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Repository
public class FileInfoDaoImpl extends AbstractBaseDao<FileInfo> implements FileInfoDao {

	@Override
	protected Class<FileInfo> getEntityClass() {
		return FileInfo.class;
	}

	@Override
	public FileInfo findById(BigDecimal id) {
		Query query = getSession().createQuery("from FileInfo where fileId =:id");
		query.setParameter("id", id);
		return (FileInfo) query.uniqueResult();
	}

	@Override
	public Long newSave(FileInfo info) {
//TODO 完善ID策略
		Query queryId = getSession().createSQLQuery("select file_info_seq.nextval from dual");
		Long result = ((BigDecimal) queryId.uniqueResult()).longValue();
		Query query = getSession().createSQLQuery(
				"insert into FILE_INFO(file_id,file_path,file_name,file_model,status,expiry_date,upload_by,upload_time) VALUES(?,?,?,?,?,?,?,?)");
		query.setParameter(0, result);
		query.setParameter(1, info.getFilePath());
		query.setParameter(2, info.getFileName());
		query.setParameter(3, info.getFileModel());
		query.setParameter(4, info.getStatus());
		query.setParameter(5, new Date(info.getExpiryDate().getTime()));
		query.setParameter(6, info.getUploadBy());
		query.setParameter(7, new Date(info.getUploadTime().getTime()));
		query.executeUpdate();
		return result;
	}

	@Override
	public BigDecimal findMaxId() {
		Query query = getSession().createQuery("select max(id) from FileInfo");
		return (BigDecimal) query.uniqueResult();
	}

}
