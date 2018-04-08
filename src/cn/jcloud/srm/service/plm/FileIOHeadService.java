package cn.jcloud.srm.service.plm;

import cn.jcloud.srm.entity.plm.FileIOHead;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午2:11:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface FileIOHeadService extends BaseService<FileIOHead> {
	public FileIOHead getByCode(String code);
}
