package lxyg.dao;

import java.util.List;

public interface IBaseDAO<T> {
	List<T> listAll();

	Object findById(Class<T> c, int id);

	boolean save(Object object);

	boolean update(Object object);

	boolean delete(Object object);

}