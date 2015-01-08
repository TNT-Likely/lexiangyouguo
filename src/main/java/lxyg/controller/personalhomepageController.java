package lxyg.controller;

import lxyg.domain.Member;
import lxyg.service.imp.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class personalhomepageController {
 
	@Autowired
	private BaseService<Member> baseService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/personalhomepage", method = RequestMethod.GET)
	public String index(Model model,int mid) {
		Member member=baseService.getById(Member.class, mid);
		model.addAttribute("info", member );
		return "personalhomepage";
	}
 
	
}
