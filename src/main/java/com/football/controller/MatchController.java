package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.football.entity.MatchEntity;
import com.football.service.MatchService;

@Controller
@SessionAttributes("matchEntity")
@RequestMapping("admin")
	public class MatchController {
	
	@Autowired
	private MatchService matchService;

		@GetMapping("/addmatch")
		public String showAddMatchPage(Model model) {
			model.addAttribute("matchEntity", new MatchEntity());
			return "admin/addmatch";
		}
		
		@PostMapping("/addmatch")
		public String saveMatch(@ModelAttribute("matchEntity") MatchEntity matchEntity) {
			matchService.saveMatch(matchEntity);
			return "redirect:/admin/matchlist";
		}
		@GetMapping("/matchlist")
		public String showMatchList(Model model) {
			model.addAttribute("matchEntityList", matchService.findAllMAtches());
			return "admin/matchlist";
		}
		@GetMapping("{matchId}/delete")
		public String deleteMatch(@PathVariable("matchId") int matchId){
			matchService.deleteMatchById(matchId);
			return "redirect:/admin/matchlist";
		}
		
		@GetMapping("/{matchId}/editmatch")
		public String editMatch(@PathVariable("matchId") int matchId, Model model) {
			model.addAttribute("matchEntity", matchService.findMatchById(matchId));
			return "admin/editmatch";
		}
		@PostMapping("/{matchId}/editmatch")
		public String saveEditedMatches(@ModelAttribute("matchEntity") MatchEntity matchEntity) {
			matchService.saveMatch(matchEntity);
			return "redirect:/admin/matchlist";
		}
}
