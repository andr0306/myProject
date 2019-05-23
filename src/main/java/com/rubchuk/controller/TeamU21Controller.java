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

import com.rubchuk.entity.TeamEntity;
import com.rubchuk.entity.TeamU21Entity;
import com.rubchuk.service.TeamU21Service;

@Controller
@SessionAttributes("teamU21Entity")
@RequestMapping("/admin")
public class TeamU21Controller {
	
	@Autowired
	private TeamU21Service teamU21Service;
	
	@GetMapping("/addteamU21")
	public String showAddTeamU21Page(Model model) {
		model.addAttribute("teamU21Entity", new TeamU21Entity());
		return "admin/addteamU21";
	}
	
	@PostMapping("/addteamU21")
	public String saveTeamU21 (@ModelAttribute("teamU21Entity") TeamU21Entity teamU21Entity) {
		teamU21Service.saveTeamU21(teamU21Entity);
		return "redirect:/admin/teamU21list";
	}
	@GetMapping("/teamU21list")
	public String showTeamU21List (Model model) {
		model.addAttribute("teamU21EntityList", teamU21Service.findAllTeamU21());
		return "admin/teamU21list";
	}
	@GetMapping("/{teamU21Id}/deleteplayerU21")
	public String deletePlayerU21(@PathVariable("teamU21Id") int teamU21Id) {
		teamU21Service.deleteTeamU21ById(teamU21Id);
		return "redirect:/admin/teamU21list";
	}
	@GetMapping("/{teamId}/editteamU21")
	public String editNews(@PathVariable("teamU21Id") int teamU21Id , Model model) {
		model.addAttribute("teamU21Entity",teamU21Service.findTeamU21ById(teamU21Id));
		return "admin/editU21team";
	}
	@PostMapping("/{teamId}/editteamU21")
	public String saveEditedTeamU21(@ModelAttribute("teamU21Entity") TeamU21Entity teamU21Entity) {
		teamU21Service.saveTeamU21(teamU21Entity);
		return "redirect:/admin/teamU21list";
	}
}


