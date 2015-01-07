package lxyg.service.imp;

import java.io.Serializable;  
import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxyg.dao.imp.BaseDAO;
import lxyg.service.IBaseService;
  
  
/** 
 * BaseServiceImpl 定义Service的通用操作的实现 
 *  
 * @author Monday 
 */  
@Service
public class BaseService<T> implements IBaseService<T> {  
      
	@Autowired
    private BaseDAO<T> baseDAO;  
  
    public void save(T entity) {  
    	baseDAO.save(entity);  
    }  
  
    public void update(T entity) {  
    	baseDAO.update(entity);  
    }  

    public void delete(Class<T> clazz,Serializable id) {  
    	baseDAO.delete(clazz,id);  
    }  
  
    public List<T> getByHQL(String hql, Object... params) {  
        return baseDAO.findByHQL(hql, params);  
    }

	@Override
	public T getById(Class<T> clazz, Serializable id) {
		// TODO Auto-generated method stub
		return baseDAO.findById(clazz,id);
	}

	@Override
	public List<T> findBySQL(String sql, Object... params) {
		// TODO Auto-generated method stub
		return baseDAO.findBySQL(sql, params);
	}

	@Override
	public void querySql(String sql, Object... params) {
		baseDAO.querySql(sql, params);	
	}

	@Override
	public T getBySQL(String sql, Object... params) {
		// TODO Auto-generated method stub
		return baseDAO.getBySQL(sql, params);
	}  
}  