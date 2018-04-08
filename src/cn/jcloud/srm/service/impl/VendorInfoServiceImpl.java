package cn.jcloud.srm.service.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.VendorInfoDao;
import cn.jcloud.srm.entity.VendorInfo;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.VendorInfoService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����2:06:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class VendorInfoServiceImpl extends AbstractbaseService<VendorInfo, BaseDao<VendorInfo>> implements VendorInfoService {
	@Override
	public List<VendorInfo> getByUpdateTime(String startTime , String endTime , String type) throws ParseException {
		return ((VendorInfoDao) dao).findByUpdateTime(startTime, endTime, type);		
	}

	@Override
	public VendorInfo getByCode(String code) {
		return ((VendorInfoDao) dao).fingByCode(code);
	}

}
