package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inti.model.Lieu;
import com.inti.service.ILieuService;

@Controller
@RequestMapping("lieu")
public class LieuController {
	
	@Autowired
	ILieuService ils;
	
	@GetMapping("listeLieux")
	public String getAllLieu(Model m) {
		m.addAttribute("listeLieux", ils.getAllLieu());
		return "listeLieux";
	}
	
	@GetMapping("formulaireSaisieLieu") 
	public String formulaireSaisieLieu() {
		return "formulaireSaisieLieu";
	}
	
	@PostMapping("enregistrerLieu")
	public String enregistrerLieu(@ModelAttribute("lieu") Lieu lieu) {
		ils.save(lieu);
		return "redirect:/lieu/listeLieux";
	}
	
	@GetMapping("supprimerLieu/{num}")
	public String supprimerLieu(@PathVariable("num") long num) {
		ils.delete(num);
		return "redirect:/lieu/listeLieux";
	}
}
