 package lxyg.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lxyg.domain.Member;
import lxyg.service.imp.BaseService;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class memberloginController {
	
	@Autowired
	private BaseService<Member> baseService;
	
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
	public void login(Model model,Member member,HttpSession session,HttpServletResponse response) throws IOException {
		BasicPasswordEncryptor bpe=new BasicPasswordEncryptor();
		Member cc=(Member)baseService.getBySQL(Member.class,"select * from Member where MemberName=?", member.getMemberName());
		if(member== null || !bpe.checkPassword(member.getMemberPassword(), cc.getMemberPassword())){
			return;
		}
		else{
			session.setAttribute("memberInfo", cc);
			response.sendRedirect("index");
		}
	}
}
 