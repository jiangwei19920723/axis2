package cn.jcloud.srm.service.impl.plm;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.plm.FileIOBodyDao;
import cn.jcloud.srm.entity.plm.FileIOBody;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.plm.FileIOBodyService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午2:18:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class FileIOBodyServiceImpl extends AbstractbaseService<FileIOBody, BaseDao<FileIOBody>> implements FileIOBodyService {

	@Override
	public List<FileIOBody> getByCode(String code) {
		return ((FileIOBodyDao)dao).findByCode(code);
	}

	@Override
	public FileIOBody getFileInfoId(int fileInfoId) {
		return ((FileIOBodyDao)dao).findByFileInfoId(fileInfoId);
	}

}
