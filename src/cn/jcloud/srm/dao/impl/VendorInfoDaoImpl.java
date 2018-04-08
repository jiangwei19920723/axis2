package cn.jcloud.srm.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.VendorInfoDao;
import cn.jcloud.srm.entity.VendorInfo;

/**
 * @author ��ά
 * @date ����ʱ�䣺2017��9��7�� ����2:05:39
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Repository
public class VendorInfoDaoImpl extends AbstractBaseDao<VendorInfo> implements VendorInfoDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<VendorInfo> findByUpdateTime(String startTime, String endTime, String type) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		Date startDate = null;
		Date endDate = null;
		startTime = startTime+"000000";
		endTime = endTime+"235959";
		startDate = new Date(sdf.parse(startTime).getTime());
		endDate = new Date(sdf.parse(endTime).getTime());
		String hql = "from VendorInfo where updateTime >=:startDate and updateTime <=:endDate and vendorStatus = 1 and vendor_type like :type";		
		Query query = getSession().createQuery(hql);
		query.setParameter("startDate", startDate);
		query.setParameter("endDate", endDate);
		query.setParameter("type", "%"+type+"%");
		return query.list();
	}

	@Override
	protected Class<VendorInfo> getEntityClass() {
		return VendorInfo.class;
	}

	@Override
	public VendorInfo fingByCode(String code) {
		String hql = "from VendorInfo where vendorCode =:code";
		Query query = getSession().createQuery(hql);
		query.setParameter("code", code);
		return (VendorInfo) query.uniqueResult();
	}
	
}
