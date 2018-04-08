package cn.jcloud.srm.dao;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月8日 上午10:19:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface BaseDao<T> {
	public void save(T entity);
	public void update(T entity);
	public void delete(T entity);
	public T findById(int id);
	public void saves(List<T> entitys);
}
