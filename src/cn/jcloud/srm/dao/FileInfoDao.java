package cn.jcloud.srm.dao;

import java.math.BigDecimal;

import cn.jcloud.srm.entity.FileInfo;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月16日 下午6:14:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface FileInfoDao extends BaseDao<FileInfo> {
	public FileInfo findById(BigDecimal id);
	public BigDecimal findMaxId();
	public Long newSave(FileInfo info);
}
