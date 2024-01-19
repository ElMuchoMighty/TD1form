package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inti.model.ChefOrchestre;
import com.inti.service.IChefOrchestreService;

@Controller
@RequestMapping ("chef")
public class ChefController {
	@Autowired
	IChefOrchestreService icos;
	
	@PostMapping("saveChef")
	public String saveChef(@ModelAttribute("chef") ChefOrchestre chef)
	{
		icos.save(chef);
		return "formConcert";
		
	}
	
	@DeleteMapping("deletechef")
	public String delete(@ModelAttribute("chef") ChefOrchestre chef)
	{
		icos.delete(chef.getNum());
		return "formConcert";
	}
	
	@GetMapping("getAllChef")
	public String getAllChef(Model m)
	{
		m.addAttribute("allChef", icos.getAllChefOrchestre());
		return "formConcert";
		
	}
	
	@PostMapping("updateChef")
	public String updateChef(@ModelAttribute("chef") ChefOrchestre chef)
	{
		icos.update(chef);
		return "formConcert";
	}
	
	

}
