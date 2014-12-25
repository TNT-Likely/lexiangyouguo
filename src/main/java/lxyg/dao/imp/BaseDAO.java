package lxyg.dao.imp;

import java.io.Serializable;  
import java.util.List;  
 
import lxyg.dao.IBaseDAO;

import org.hibernate.Query;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
  
/** 
 * BaseDaoImpl 定义DAO的通用操作的实现 
 *  
 * @author Monday 
 */  
@Repository 
@Transactional
public class BaseDAO<T> implements IBaseDAO<T> {  
  
    private Class<T> clazz;  

    public BaseDAO(){	
    
    }
    @Autowired
    private SessionFactory sessionFactory;  
  
    protected Session getSession() {  
        return this.sessionFactory.getCurrentSession();  
    }  
  
    public void save(T entity) {  
        this.getSession().save(entity);  
    }  
  
    public void update(T entity) {  
        this.getSession().update(entity);  
    }  
  
    public void delete(Serializable id) {  
        this.getSession().delete(this.findById(id));  
    }  
  
    @SuppressWarnings("unchecked")
	public T findById(Serializable id) {  
        return (T) this.getSession().get(this.clazz, id);  
    }  
  
    @SuppressWarnings("unchecked")
	public List<T> findByHQL(String hql, Object... params) {  
        Query query = this.getSession().createQuery(hql);  
        for (int i = 0; params != null && i < params.length; i++) {  
            query.setParameter(i, params);  
        }  
        return query.list();  
    }  
}  