package lxyg.service.imp;

import java.io.Serializable;  
import java.util.List;  

import javax.annotation.Resource;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public void delete(Serializable id) {  
    	baseDAO.delete(id);  
    }  
  
    public T getById(Serializable id) {  
        return baseDAO.findById(id);  
    }  
  
    public List<T> getByHQL(String hql, Object... params) {  
        return baseDAO.findByHQL(hql, params);  
    }  
}  