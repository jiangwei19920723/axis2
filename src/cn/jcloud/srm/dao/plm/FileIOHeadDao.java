package cn.jcloud.srm.dao.plm;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.plm.FileIOHead;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午2:05:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface FileIOHeadDao extends BaseDao<FileIOHead> {
	public FileIOHead findByCode(String code);
}
