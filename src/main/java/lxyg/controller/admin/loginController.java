package lxyg.controller.admin;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("name", "sunxiaoIndex" );
		return "admin/login";
	}
	
	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public String login(Model model,user User) {
		model.addAttribute("name", "sunxiaoIndex" );
		return "admin/login";
	}
}

class user{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

