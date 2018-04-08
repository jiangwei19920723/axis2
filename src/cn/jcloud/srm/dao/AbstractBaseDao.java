package cn.jcloud.srm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月12日 上午11:25:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public abstract class AbstractBaseDao<T> implements BaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	protected abstract Class<T> getEntityClass();
	@Override
	public void save(T entity) {
		getSession().save(entity);
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
	}

	@Override
	public void delete(T entity) {
		getSession().delete(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public T findById(int id) {
		Query query = getSession().createQuery("from "+getClass().getSimpleName()+" where id=:id");
		query.setParameter("id", id);
		return (T) query.uniqueResult();
	}

	@Override
	public void saves(List<T> entitys) {
		for (T t : entitys) {
			getSession().save(t);
		}
	}

}
