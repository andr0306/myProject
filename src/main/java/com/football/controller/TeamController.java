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

import com.football.entity.TeamEntity;
import com.football.service.TeamService;

@Controller
@SessionAttributes("teamEntity")
@RequestMapping("/admin")
	public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/addteam")
	public String showAddTeamPage(Model model) {
		model.addAttribute("teamEntity", new TeamEntity());
		return "admin/addteam";
	}
	
	@PostMapping("/addteam")
	public String saveTeam (@ModelAttribute("teamEntity") TeamEntity teamEntity) {
		teamService.saveTeam(teamEntity);
		return "redirect:/admin/teamlist";
	}
	@GetMapping("/teamlist")
	public String showTeamList (Model model) {
		model.addAttribute("teamEntityList", teamService.findAllTeam());
		return "admin/teamlist";
	}
	@GetMapping("/{teamId}/deleteplayer")
	public String deletePlayer(@PathVariable("teamId") int teamId) {
		teamService.deleteTeamById(teamId);
		return "redirect:/admin/teamlist";
	}
	@GetMapping("/{teamId}/editteam")
	public String editNews(@PathVariable("teamId") int teamId , Model model) {
		model.addAttribute("teamEntity",teamService.findTeamById(teamId));
		return "admin/editteam";
	}
	@PostMapping("/{teamId}/editteam")
	public String saveEditedTeam(@ModelAttribute("teamEntity") TeamEntity teamEntity) {
		teamService.saveTeam(teamEntity);
		return "redirect:/admin/teamlist";
	}
}
