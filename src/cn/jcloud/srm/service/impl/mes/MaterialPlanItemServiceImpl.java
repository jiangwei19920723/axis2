package cn.jcloud.srm.service.impl.mes;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;
import cn.jcloud.srm.dao.mes.MaterialPlanItemDao;
import cn.jcloud.srm.entity.mes.MaterialPlanItem;
import cn.jcloud.srm.service.AbstractbaseService;
import cn.jcloud.srm.service.mes.MaterialPlanItemService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月31日 下午4:37:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service
public class MaterialPlanItemServiceImpl extends AbstractbaseService<MaterialPlanItem, BaseDao<MaterialPlanItem>> implements MaterialPlanItemService {

	@Override
	public List<MaterialPlanItem> getByHeadId(int head_id) {
		return ((MaterialPlanItemDao)dao).findByHeadId(head_id);
	}

	@Override
	public List<MaterialPlanItem> getByCode(String code) {
		return ((MaterialPlanItemDao)dao).findByCode(code);
	}

	@Override
	public MaterialPlanItem getByHeaderIdAndLineCode(int headerId, String lineCode) {
		return ((MaterialPlanItemDao)dao).findByHeaderIdAndLineCode(headerId, lineCode);
	}

	@Override
	@Transactional(readOnly=false)
	public int updateCountByLineId(int lineId, BigDecimal collection_count, BigDecimal recCount, BigDecimal quaCount, BigDecimal illquaCount) {
		return ((MaterialPlanItemDao)dao).updateCountByLineId(lineId, collection_count, recCount, quaCount, illquaCount);
	}

	@Override
	public int updateCancelStatusByLineId(int lineId, int cancel_status) {
		return ((MaterialPlanItemDao)dao).updateCancelStatusByLineId(lineId, cancel_status);
	}

}
