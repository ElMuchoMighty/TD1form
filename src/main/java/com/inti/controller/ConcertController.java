package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inti.model.Concert;
import com.inti.model.Oeuvre;
import com.inti.service.IConcertService;

@Controller
@RequestMapping("concert")
public class ConcertController {

	@Autowired
	IConcertService iConcertService;

	@PostMapping("saveConcert")
	public String saveConcert(@ModelAttribute("concert") Concert concert) {
		iConcertService.save(concert);
		return "formulaireConcert";

	}

	@GetMapping("allConcert")
	public void getAllConcert(Model m) {
		m.addAttribute("concerts", iConcertService.getAllConcert());
	}

	@DeleteMapping("deleteConcert")
	public String delete(@ModelAttribute("concert") Concert concert) {
		iConcertService.delete(concert.getNum());
		return "concertList";
	}

	@PutMapping("updateConcert")
	public String updateConcert(@ModelAttribute("concert") Concert concert) {
		iConcertService.update(concert);
		return "formulaireConcert";
	}

}
