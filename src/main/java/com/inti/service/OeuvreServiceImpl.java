package com.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Oeuvre;
import com.inti.repository.IOeuvreRepository;

@Service
public class OeuvreServiceImpl implements IOeuvreService{
	
	@Autowired
	IOeuvreRepository or;

	@Override
	public Oeuvre save(Oeuvre oeuvre) {
		return or.save(oeuvre);
	}

	@Override
	public List<Oeuvre> getAllOeuvre() {
		return or.findAll();
	}

	@Override
	public void delete(int id) {
		or.deleteById((long) id);
	}

	@Override
	public boolean update(Oeuvre oeuvre) {
		or.save(oeuvre);
		return true;
	}

}
