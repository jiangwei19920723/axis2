package cn.jcloud.srm.service;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年9月8日 上午10:23:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface BaseService<T> {
	public void save(T entity);
	public void update(T entity);
	public void delete(T entity);
	public void saves(List<T> entitys);
	public T getById(int id);

}
