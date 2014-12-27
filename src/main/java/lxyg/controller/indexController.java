package lxyg.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import lxyg.domain.Apple;
import lxyg.service.imp.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {
	
	@Autowired
	private BaseService<Apple> baseService;
	
	@RequestMapping(value = {"/","index"}, method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		Apple a=new Apple();
		a.setColor("aaa");
		a.setId("aaa");
		a.setSize((float) 1.56);
		a.setWeight((float) 2.15);
		//baseService.save(a);
		//a=baseService.getById("aaa");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("name", "sunxiaoIndex" );
		return "index";
	}
	
	@RequestMapping(value = "/productDetail", method = RequestMethod.GET)
	public String index2(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("name", "sunxiaoIndex" );
		return "productDetail";
	}
}
