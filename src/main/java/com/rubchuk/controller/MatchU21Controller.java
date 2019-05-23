package com.rubchuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rubchuk.entity.MatchEntity;
import com.rubchuk.entity.MatchU21Entity;
import com.rubchuk.service.MatchService;
import com.rubchuk.service.MatchU21Service;

@Controller
@SessionAttributes("matchU21Entity")
@RequestMapping("admin")
public class MatchU21Controller {

	@Autowired
	private MatchU21Service matchU21Service;

		@GetMapping("/addmatchU21")
		public String showAddMatchU21Page(Model model) {
			model.addAttribute("matchU21Entity", new MatchU21Entity());
			return "admin/addmatchU21";
		}
		
		@PostMapping("/addmatchU21")
		public String saveMatchU21(@ModelAttribute("matchU21Entity") MatchU21Entity matchU21Entity) {
			matchU21Service.saveMatchU21(matchU21Entity);
			return "redirect:/admin/matchU21list";
		}
		@GetMapping("/matchU21list")
		public String showMatchU21List(Model model) {
			model.addAttribute("matchU21EntityList", matchU21Service.findAllMAtches());
			return "admin/matchU21list";
		}
		@GetMapping("{matchU21Id}/delete")
		public String deleteMatchU21(@PathVariable("matchU21Id") int matchU21Id){
			matchU21Service.deleteMatchU21ById(matchU21Id);
			return "redirect:/admin/matchU21list";
		}
		
		@GetMapping("/{matchU21Id}/editmatch")
		public String editMatchU21(@PathVariable("matchU21Id") int matchU21Id, Model model) {
			model.addAttribute("matchU21Entity", matchU21Service.findMatchU21ById(matchU21Id));
			return "admin/editmatch";
		}
		@PostMapping("/{matchU21Id}/editmatch")
		public String saveEditedMatchesU21(@ModelAttribute("matchU21Entity") MatchU21Entity matchU21Entity) {
			matchU21Service.saveMatchU21(matchU21Entity);
			return "redirect:/admin/matchU21list";
		}
}
