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
import com.rubchuk.entity.NewsEntity;
import com.rubchuk.entity.TeamEntity;
import com.rubchuk.service.NewsService;

@Controller
@SessionAttributes("newsEntity")
@RequestMapping("admin")
	public class NewsController {
	
	@Autowired
	private NewsService newsService;

	@GetMapping("/addnews")
	public String showNewsAddPage(Model model){
		model.addAttribute("newsEntity",new NewsEntity());
		return "admin/addnews";
	}
	
	@PostMapping("/addnews")
	public String saveNews(@ModelAttribute("newsEntity") NewsEntity newsEntity) {
		newsService.saveNews(newsEntity);
		return "redirect:/admin/newslist";
	}
	
	
	@GetMapping("/newslist")
	public String showNewsListPage(Model model) {
		model.addAttribute("newsEntityList", newsService.findAllNews());
		return "admin/newslist";
}
	@GetMapping("{newsId}/deletenews")
	public String deleteNews(@PathVariable("newsId") int newsId) {
		newsService.deleteNewsById(newsId);
		return "redirect:/admin/newslist";
	}
	@GetMapping("/{newsId}/editnews")
	public String editNews(@PathVariable("newsId") int newsId, Model model) {
		model.addAttribute("newsEntity",newsService.findNewsById(newsId));
		return "admin/editnews";
	}
	@PostMapping("/{newsId}/editnews")
	public String saveEditedMatches(@ModelAttribute("newsEntity") NewsEntity newsEntity) {
		newsService.saveNews(newsEntity);
		return "redirect:/admin/newslist";
	}
}
