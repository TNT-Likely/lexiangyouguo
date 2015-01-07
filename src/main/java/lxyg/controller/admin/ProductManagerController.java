package lxyg.controller.admin;

import lxyg.domain.Member;
import lxyg.service.imp.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductManagerController {
	
	@Autowired
	private BaseService<Member> baseService;
	
	@RequestMapping(value =  "admin/pclist", method = RequestMethod.GET)
	public String pclist(Model model) {
		model.addAttribute("list", baseService.findBySQL(Member.class, "select * from member"));
		return "admin/pclist";
	}
	
	@RequestMapping(value =  "admin/pcadd", method = RequestMethod.GET)
	public String pcadd(Model model) {

		return "admin/pcadd";
	}
	
	@RequestMapping(value =  "admin/pcupdate", method = RequestMethod.GET)
	public String pcupdate(Model model) {

		return "admin/pcupdate";
	}
}
