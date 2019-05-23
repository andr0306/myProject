package com.rubchuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubchuk.entity.InvestorEntity;
import com.rubchuk.entity.PeticionEntity;
import com.rubchuk.service.InvestorService;

@Controller
public class InvestorController {
	
	@Autowired
	private InvestorService investorService;
	
	@GetMapping("/addinvestor")
	public String showInvwstorAddPage(Model model) {
		model.addAttribute("investorEntity", new InvestorEntity());
		return "addinvestor";
	}
	@PostMapping("/addinvestor")
	public String saveInvestor(@ModelAttribute("investorEntity") InvestorEntity investorEntity) {
		investorService.saveInvestor(investorEntity);
		return "redirect:/investors";
	}
	
	@GetMapping("/investors")
	 public String showInvestorsList(Model model) {
		  model.addAttribute("investorEntity",investorService.findAllInvestors());
		 return "investors";
	 }
	
}
