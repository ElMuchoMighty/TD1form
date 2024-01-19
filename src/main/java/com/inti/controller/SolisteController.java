package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inti.model.Soliste;
import com.inti.service.ISolisteService;
@Controller
@RequestMapping("soliste")
public class SolisteController {
	
	@Autowired
	ISolisteService iss;
	
	@GetMapping("getAllSoliste")
	public String getAllSoliste(Model m)
	{
		m.addAttribute("total", iss.getAllSoliste().size());
		m.addAttribute("listeSol", iss.getAllSoliste());
		return "viewAll";
	}
	
	@GetMapping("addSoliste")
	public String getFormAddSoliste() {
		return "newSoliste";
	}
	
	@PostMapping("saveSoliste")
	public String saveSoliste(@ModelAttribute("soliste") Soliste soliste)
	{
		iss.save(soliste);
		return "redirect:/soliste/getAllSoliste";
	}
	
	
	@GetMapping("deleteSoliste/{id}")
	public String deleteSoliste(@PathVariable Long id) {
		iss.delete(id);
		return "redirect:/soliste/getAllSoliste";
	}
	
	@PostMapping("updateSoliste")
	public String updateSoliste(@ModelAttribute("soliste") Soliste soliste)
	{
		iss.update(soliste);
		return "formulaireSoliste";
	}
	@PostMapping("findByNom")
	public String findByNom(@ModelAttribute("nom") String nom, Model m)
	{
		m.addAttribute("nom", iss.findByNom(nom));
		return "formulaireSoliste";
	}
	@PostMapping("count")
	public String countSoliste(Model m)
	{
		m.addAttribute("numberSoliste", iss.getSolisteCount());
		return "formulaireSoliste";
	}
}
