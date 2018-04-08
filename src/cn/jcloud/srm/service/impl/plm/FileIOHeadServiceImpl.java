package cn.jcloud.srm.service.impl.plm;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.plm.FileIOHeadDao;
import cn.jcloud.srm.entity.plm.FileIOHead;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.plm.FileIOHeadService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午2:13:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class FileIOHeadServiceImpl extends AbstractbaseService<FileIOHead, BaseDao<FileIOHead>> implements FileIOHeadService {

	@Override
	public FileIOHead getByCode(String code) {
		return ((FileIOHeadDao)dao).findByCode(code);
	}

}
