package lxyg.service.imp;

import java.io.Serializable;  
import java.util.List;  
import javax.annotation.Resource;  
import javax.transaction.Transactional;

import lxyg.dao.imp.BaseDAO;
import lxyg.service.IBaseService;
  
  
/** 
 * BaseServiceImpl ����Service��ͨ�ò�����ʵ�� 
 *  
 * @author Monday 
 */  
@Transactional  
public class BaseService<T> implements IBaseService<T> {  
      
    /** 
     * ע��BaseDao 
     */  
    private BaseDAO<T> dao;  
    @Resource  
    public void setDao(BaseDAO<T> dao) {  
        this.dao = dao;  
    }  
  
    public void save(T entity) {  
        dao.save(entity);  
    }  
  
    public void update(T entity) {  
        dao.update(entity);  
    }  
  
    public void delete(Serializable id) {  
        dao.delete(id);  
    }  
  
    public T getById(Serializable id) {  
        return dao.findById(id);  
    }  
  
    public List<T> getByHQL(String hql, Object... params) {  
        return dao.findByHQL(hql, params);  
    }  
}  