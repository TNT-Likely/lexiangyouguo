package lxyg.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author xiao
 *
 * @param <T>
 */
public interface IBaseDAO<T> {

	
	/**
	 * @param entity
	 */
	public void save(T entity);  
	  
    /**
     * @param entity
     */
    public void update(T entity);  
  
    /**
     * @param clazz
     * @param id
     */
    public void delete(Class<T> clazz,Serializable id);  
  
    /**
     * @param clazz
     * @param id
     * @return
     */
    public T findById(Class<T> clazz,Serializable id);  
  
    /**
     * @param hql
     * @param params
     * @return
     */
    public List<T> findByHQL(String hql, Object... params);  
    
    /**
     * @param sql
     * @param params
     * @return
     */
    public List<T> findBySQL(String sql, Object... params);
    
    public void querySql(String sql, Object... params);
    
    public T getBySQL(String sql, Object... params);
}