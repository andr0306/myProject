package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.football.entity.PeticionEntity;
import com.football.service.PeticionService;

@Controller
@SessionAttributes("peticionEnitity")
@RequestMapping("/")
public class PeticionController {
	
	@Autowired
	private PeticionService peticionService;
	
	@GetMapping("/addpeticion")
	public String showAddPage(Model model) {
		model.addAttribute("peticionEntity", new PeticionEntity());
		return "addpeticion";
	}
	@PostMapping("/addpeticion")
	public String savePeticion(@ModelAttribute("peticionEntity") PeticionEntity peticionEntity) {
		peticionService.savePeticion(peticionEntity);
		return "redirect:/peticion";
	}
	
	@GetMapping("/peticion")
	 public String showPeticionList(Model model) {
		  model.addAttribute("peticionEntity",peticionService.findAllPeticion());
		 return "peticion";
	 }
	
	
	
}
