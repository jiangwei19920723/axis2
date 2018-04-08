package cn.jcloud.srm.service.impl.sap;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.sap.PoInfoPlanLineItem2Dao;
import cn.jcloud.srm.entity.sap.PoInfoPlanLineItem2;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.sap.PoInfoPlanLineItem2Service;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��7�� ����5:17:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class PoInfoPlanLineItem2ServiceImpl extends AbstractbaseService<PoInfoPlanLineItem2, BaseDao<PoInfoPlanLineItem2>> implements PoInfoPlanLineItem2Service{
	@Override
	public List<PoInfoPlanLineItem2> getByOmCode(String code) {
		return ((PoInfoPlanLineItem2Dao) dao).findByOmCode(code);
	}

	@Override
	public List<PoInfoPlanLineItem2> getByHeadId(int headId) {
		return ((PoInfoPlanLineItem2Dao) dao).findByHeadId(headId);
	}

	@Override
	public List<PoInfoPlanLineItem2> getByCode(String code) {
		return ((PoInfoPlanLineItem2Dao) dao).findByCode(code);
	}

	@Override
	public PoInfoPlanLineItem2 getByHeaderIdAndLineCode(int headId, String lineCode) {
		return ((PoInfoPlanLineItem2Dao) dao).findByHeaderIdAndLineCode(headId, lineCode);
	}

	@Override
	@Transactional(readOnly=false)
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount) {
		return ((PoInfoPlanLineItem2Dao) dao).updateCountByLineId(lineId, collection_count, recCount, quaCount, illquaCount);
	}

}
