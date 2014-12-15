package lxyg.test;

import lxyg.service.imp.BaseService;
import lxyg.domain.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseService service=new BaseService();
		student a=new student();
		service.save(a);
	}
}
