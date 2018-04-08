package cn.jcloud.srm.service;

import java.math.BigDecimal;

import cn.jcloud.srm.entity.FileInfo;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月16日 下午6:19:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface FileInfoService extends BaseService<FileInfo> {
	public FileInfo getById(BigDecimal id);
	public BigDecimal getMaxId();
	public Long newSave(FileInfo info);
}
