package cn.jcloud.srm.service;

import java.text.ParseException;
import java.util.List;

import cn.jcloud.srm.entity.VendorInfo;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����2:04:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface VendorInfoService extends BaseService<VendorInfo> {
	public List<VendorInfo> getByUpdateTime(String startTime , String endTime, String type) throws ParseException;
	public VendorInfo getByCode(String code);
}
