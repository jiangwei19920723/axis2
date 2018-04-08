package cn.jcloud.srm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.jcloud.srm.dao.BaseDao;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 上午11:45:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
public class AbstractbaseService<T,D extends BaseDao<T>> implements BaseService<T> {
	@Autowired
	protected D dao;
	@Override
	@Transactional(readOnly=false)
	public void save(T entity) {
		dao.save(entity);
	}

	@Override
	@Transactional(readOnly=false)
	public void update(T entity) {
		dao.update(entity);
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(T entity) {
		dao.delete(entity);
	}

	@Override
	@Transactional(readOnly=false)
	public void saves(List<T> entitys) {
		dao.saves(entitys);
	}

	@Override
	public T getById(int id) {
		return dao.findById(id);
	}

}
