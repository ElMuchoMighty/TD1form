package com.inti.controller;

import java.util.List;

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
	
	@GetMapping("/updateSoliste/{id}")
	public String getUpdateSoliste(@PathVariable Long id, Model m) {
		m.addAttribute("sol", iss.getSoliste(id).get());
		return "updatePage";
	}
	
	
	@PostMapping("/updateSoliste/saveSoliste")
	public String updateSoliste(@ModelAttribute("soliste") Soliste s) {
		System.out.println(s);
		iss.save(s);
		return "redirect:/soliste/getAllSoliste";
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
