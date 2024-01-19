package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inti.model.Soliste;
import com.inti.service.ISolisteService;
@Controller
@RequestMapping("soliste")
public class SolisteController {
	
	@Autowired
	ISolisteService iss;
	
	@PostMapping("saveSoliste")
	public String saveSoliste(@ModelAttribute("soliste") Soliste soliste)
	{
		iss.save(soliste);
		return "formulaireSoliste";
	}
	
	@PostMapping("getAllSoliste")
	public String getAllSoliste(Model m)
	{
		m.addAttribute("allSoloist", iss.getAllSoliste());
		return "formulaireSoliste";
	}
	
	@PostMapping("deleteSoliste")
	public String deleteSoliste(@ModelAttribute("soliste") Soliste soliste)
	{
		iss.delete(soliste.getId());
		return "formulaireSoliste";
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
