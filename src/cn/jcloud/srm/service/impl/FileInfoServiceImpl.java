package cn.jcloud.srm.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.FileInfoDao;
import cn.jcloud.srm.entity.FileInfo;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.FileInfoService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月16日 下午6:20:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class FileInfoServiceImpl extends AbstractbaseService<FileInfo, BaseDao<FileInfo>> implements FileInfoService {

	@Override
	public FileInfo getById(BigDecimal id) {
		return ((FileInfoDao)dao).findById(id);
	}

	@Override
	public BigDecimal getMaxId() {
		return ((FileInfoDao)dao).findMaxId();
	}

	@Override
	public Long newSave(FileInfo info) {
		return ((FileInfoDao)dao).newSave(info);
	}

}
