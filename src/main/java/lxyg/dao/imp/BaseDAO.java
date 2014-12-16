package lxyg.dao.imp;

import java.util.List;

import lxyg.dao.IBaseDAO;


public class BaseDAO<T> implements IBaseDAO<T>{

	@Override
	public List<T> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findById(Class<T> c, int id) {
		return null;
	}

	@Override
	public boolean save(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

}
