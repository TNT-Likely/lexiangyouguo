package lxyg.service;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T> {
	public void save(T entity);  
	  
    public void update(T entity);  
  
    public void delete(Class<T> clazz,Serializable id);  
  
    public T getById(Class<T> clazz,Serializable id);  
  
    public List<T> findBySQL(Class<T> clazz,String sql, Object... params);
    
    public void querySql(String sql, Object... params);
    
    public T getBySQL(Class<T> clazz,String sql, Object... params);
}
