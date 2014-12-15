package lxyg.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface IBaseDAO<Entity, ID extends Serializable> {

	Entity getByID(ID id);

	List getList();

	List search(Map<String, Object> parameterMap);

	ID insert(Entity entity);

	void update(Entity entity);

	void delete(Entity entity);

	void deleteById(ID id);

}