package com.football.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.football.domain.RegisterRequest;
import com.football.mapper.UserMapper;
import com.football.service.MatchService;
import com.football.service.MatchU21Service;
import com.football.service.NewsService;
import com.football.service.TeamService;
import com.football.service.TeamU21Service;
import com.football.service.UserService;

@Controller
@RequestMapping("/")
public class BaseController {
	
	@Autowired
	private TeamService teamService;
	@Autowired
	private MatchService matchService;
	@Autowired
	private NewsService newsService;
	@Autowired
	private UserService userService;
	@Autowired
	private TeamU21Service teamU21Service;
	@Autowired
	private MatchU21Service matchU21Service;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("admin")
	public String showAdminPage() {
		
		return "admin/admin";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("userModel",new RegisterRequest());
		return "register";
	}
	@PostMapping("/register")
	public String saveNewUser(@Valid @ModelAttribute("userModel")RegisterRequest request, BindingResult br) {
		if( br.hasErrors()) {
		return "register";	
	}
		userService.saveUser(UserMapper.registerToEntity(request));
		return "redirect:/login";
	}
	

	@GetMapping("/team")
	public String showTeamPage(Model model) {
		model.addAttribute("teamEntity", teamService.findAllTeam());
		return "team";
}
	@GetMapping("/teamU21")
	public String showTeamU21Page(Model model) {
		model.addAttribute("teamU21Entity", teamU21Service.findAllTeamU21());
		return "teamU21";
}
	@GetMapping("/results")
	public String showResultsPage(Model model) {
		model.addAttribute("matchEntity", matchService.findAllMAtches());
		return "results";
}
	@GetMapping("/resultsU21")
	public String showResultsU21Page(Model model) {
		model.addAttribute("matchU21Entity", matchU21Service.findAllMAtchesU21());
		return "resultsU21";
}
	@GetMapping("/news")
	public String showNewsPage(Model model) {
		model.addAttribute("newsEntity",newsService.findAllNews());
		return "news";
	}
	@GetMapping("/{newsId}/shownews")
	public String showSelectedNews(@PathVariable("newsId") int newsId, Model model) {
		model.addAttribute("newsEntity",newsService.findNewsById(newsId));
		return "selectednews";
	}
	
}

