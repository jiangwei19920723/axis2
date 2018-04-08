package cn.jcloud.srm.dao.impl.sap;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.jcloud.srm.dao.AbstractBaseDao;
import cn.jcloud.srm.dao.sap.MtlItemsDao;
import cn.jcloud.srm.entity.sap.MtlItems;

/**
 * @author 蒋维
 * @date 创建时间：2017年9月18日 下午8:20:25
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Repository
public class MtlItemsDaoImpl extends AbstractBaseDao<MtlItems> implements MtlItemsDao {

	@Override
	protected Class<MtlItems> getEntityClass() {
		return MtlItems.class;
	}

	@Override
	public void updates(List<MtlItems> items) {
		for (MtlItems item : items) {
			getSession().update(item);
		}
	}

	@Override
	public MtlItems findByCode(String code) {
		Query query = getSession().createQuery("from MtlItems where itemCode =:code");
		query.setParameter("code", code);
		return (MtlItems) query.uniqueResult();
	}

	@Override
	public void save(MtlItems entity) {
		Query query = getSession().createSQLQuery(
				"insert into mtl_items(item_code,descriptions,item_sort,uom_code,mtl_group,last_updated_date,creation_date,created_by) values(?,?,?,?,?,?,?,?)");
		query.setParameter(0, entity.getItemCode());
		query.setParameter(1, entity.getDescriptions());
		query.setParameter(2, entity.getItemSort());
		query.setParameter(3, entity.getUomCode());
		query.setParameter(4, entity.getMtlGroup());
		query.setParameter(5, entity.getLastUpdatedDate());
		query.setParameter(6, entity.getCreationDate());
		query.setParameter(7, entity.getCreatedBy());
		query.executeUpdate();
	}
	
	@Override
	public void saves(List<MtlItems> entitys) {
		for (MtlItems mtlItems : entitys) {
			save(mtlItems);
		}
	}

}
