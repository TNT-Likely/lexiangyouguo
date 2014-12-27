package lxyg.test;

import java.lang.reflect.ParameterizedType;

public class Base<T> implements IBase<T> {

	private Class<T> clazz; 
	@SuppressWarnings("unchecked")
	public Base() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();  
        clazz = (Class<T>) type.getActualTypeArguments()[0];  
        System.out.println("DAO的真实实现类是：" + this.clazz.getName());
	}

}
