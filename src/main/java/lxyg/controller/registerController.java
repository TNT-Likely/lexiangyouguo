package lxyg.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import lxyg.domain.Member;
import lxyg.service.imp.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.jasypt.util.password.*;
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
	public void register(Member member,HttpServletResponse response) throws IOException {
		if(baseService.getBySQL(Member.class,"select * from member where MemberName = ?", member.getMemberName())!=null){
			return;
		}
		BasicPasswordEncryptor bpe=new BasicPasswordEncryptor();
		member.setPassword(bpe.encryptPassword(member.getPassword()));
		baseService.save(member);
		response.sendRedirect("login");
	}
}
