package cn.jcloud.srm.service.sap;

import java.util.List;

import cn.jcloud.srm.entity.sap.MtlItems;
import cn.jcloud.srm.service.BaseService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月18日 下午8:21:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface MtlItemsService extends BaseService<MtlItems> {
	public void updates(List<MtlItems> items);
	public MtlItems getByCode(String code);
}
