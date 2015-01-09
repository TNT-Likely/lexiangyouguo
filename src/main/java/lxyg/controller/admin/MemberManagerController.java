package lxyg.controller.admin;

import lxyg.domain.Member;
import lxyg.service.imp.BaseService;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MemberManagerController {
	@Autowired
	private BaseService<Member> baseService;
	
	@RequestMapping(value =  "admin/memlist", method = RequestMethod.GET)
	public String pclist(Model model) {
		model.addAttribute("list", baseService.findBySQL(Member.class, "select * from member"));
		return "admin/memlist";
	}
	
	@RequestMapping(value =  "admin/memadd", method = RequestMethod.GET)
	public String memadd(Model model) {
		return "admin/memadd";
	}
	
	@RequestMapping(value ="admin/memadd", method = RequestMethod.POST)
	public String memadd(Model model,Member member) {
		if(baseService.getBySQL(Member.class,"select * from member where MemberName = ?", member.getMemberName())!=null){
			return "";
		}
		BasicPasswordEncryptor bpe=new BasicPasswordEncryptor();
		member.setMemberPassword (bpe.encryptPassword(member.getMemberPassword()));
		baseService.save(member);
		return "admin/memadd";
	}
	@RequestMapping(value =  "admin/memupdate", method = RequestMethod.GET)
	public String memupdate(Model model) {

		return "admin/memupdate";
	}
}
