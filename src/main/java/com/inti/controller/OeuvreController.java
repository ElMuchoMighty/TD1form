package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inti.model.Oeuvre;
import com.inti.service.IOeuvreService;

@Controller
@RequestMapping("oeuvre")
public class OeuvreController {
	@Autowired
	IOeuvreService ios;
	
	@PostMapping("saveOeuvre")
	public String saveOeuvre(@ModelAttribute("oeuvre") Oeuvre oeuvre)
	{
		ios.save(oeuvre);
		return "formulaireSoliste";
		
	}
	
	@PostMapping("deleteOeuvre")
	public String delete(@ModelAttribute("oeuvre") Oeuvre oeuvre)
	{
		ios.delete((int) oeuvre.getNum());
		return "formulaire oeuvre";
	}
	@PostMapping("getAllOeuvre")
	public String getAllOeuvre(Model m)
	{
	m.addAttribute("ListOeuvre", ios.getAllOeuvre());
	return "formulaireSoliste";
	}
	@PostMapping("updateOeuvre")
	public String updateOeuvre(@ModelAttribute("oeuvre") Oeuvre oeuvre)
	{
		ios.update(oeuvre);
		return "formulaireSoliste";
	}
	
}
