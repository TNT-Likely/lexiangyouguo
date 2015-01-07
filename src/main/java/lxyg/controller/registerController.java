package lxyg.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import lxyg.domain.Member;
import lxyg.service.imp.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class  registerController {
	@Autowired
	private BaseService<Member> baseService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
	 
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("name", "sunxiaoIndex" );
		return "register";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String login(Model model,Member member) {
		if(!baseService.findBySQL("select * from member where MemberName = ?", member.getMemberName()).isEmpty()){
			return null;
		}
		baseService.save(member);
		return "login";
	}
}
