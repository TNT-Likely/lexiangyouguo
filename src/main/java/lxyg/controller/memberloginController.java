 package lxyg.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class memberloginController {
 
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("name", "sunxiaoIndex" );
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model,user User) {
		model.addAttribute("name", "sunxiaoIndex" );
		return "index";
	}
}