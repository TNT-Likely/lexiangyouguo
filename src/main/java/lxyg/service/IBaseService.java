package lxyg.service;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T> {
	public void save(T entity);  
	  
    public void update(T entity);  
  
    public void delete(Class<T> clazz,Serializable id);  
  
    public T getById(Class<T> clazz,Serializable id);  
  
    public List<T> getByHQL(String hql, Object... params); 
    
    public List<T> findBySQL(String sql, Object... params);
    
    public void querySql(String sql, Object... params);
    
    public T getBySQL(String sql, Object... params);
}
