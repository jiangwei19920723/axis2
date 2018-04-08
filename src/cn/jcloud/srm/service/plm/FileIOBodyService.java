package cn.jcloud.srm.service.plm;

import java.util.List;

import cn.jcloud.srm.entity.plm.FileIOBody;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月10日 下午2:17:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface FileIOBodyService extends BaseService<FileIOBody> {
	public List<FileIOBody> getByCode(String code);
	public FileIOBody getFileInfoId(int fileInfoId);
}
