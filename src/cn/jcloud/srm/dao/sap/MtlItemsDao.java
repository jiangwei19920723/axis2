package cn.jcloud.srm.dao.sap;

import java.util.List;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.entity.sap.MtlItems;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月18日 下午8:19:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface MtlItemsDao extends BaseDao<MtlItems> {
	public void updates(List<MtlItems> items);
	public MtlItems findByCode(String code);
}
