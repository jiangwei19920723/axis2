package cn.jcloud.srm.dao;

import java.text.ParseException;
import java.util.List;

import cn.jcloud.srm.entity.VendorInfo;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����2:02:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface VendorInfoDao extends BaseDao<VendorInfo> {
	public List<VendorInfo> findByUpdateTime(String startTime,String endTime,String type) throws ParseException;
	public VendorInfo fingByCode(String code);
}
