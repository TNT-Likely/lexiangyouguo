package lxyg.test;

import lxyg.domain.Apple;
import lxyg.service.imp.BaseService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseService<Apple> service=new BaseService<Apple>();
		Apple apple=new Apple();
		apple.setId("ccc");
		service.save(apple);
	}

}
