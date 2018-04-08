package cn.jcloud.srm.dao.plm;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.plm.FileIOBody;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午2:14:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface FileIOBodyDao extends BaseDao<FileIOBody> {
	public List<FileIOBody> findByCode(String code);
	public FileIOBody findByFileInfoId(int fileInfoId);
}
