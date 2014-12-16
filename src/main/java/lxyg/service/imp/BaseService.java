package lxyg.service.imp;

import java.util.List;

import lxyg.dao.IBaseDAO;
import lxyg.dao.imp.BaseDAO;
import lxyg.service.IBaseService;

public class BaseService<T> implements IBaseService<T> {

	private IBaseDAO baseDAO=new BaseDAO();
	@Override
	public List<T> listAll() {
		// TODO Auto-generated method stub
		return baseDAO.listAll();
	}

	@Override
	public Object findById(Class<T> c, int id) {
		// TODO Auto-generated method stub
		return baseDAO.findById(c, id);
	}

	@Override
	public boolean save(Object object) {
		// TODO Auto-generated method stub
		return baseDAO.save(object);
	}

	@Override
	public boolean update(Object object) {
		// TODO Auto-generated method stub
		return baseDAO.update(object);
	}

	@Override
	public boolean delete(Object object) {
		// TODO Auto-generated method stub
		return baseDAO.delete(object);
	}

}
