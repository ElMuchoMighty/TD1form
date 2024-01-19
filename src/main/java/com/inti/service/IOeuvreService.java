package com.inti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inti.model.Oeuvre;
@Service
public interface IOeuvreService {
	public Oeuvre save (Oeuvre oeuvre);
	public List<Oeuvre> getAllOeuvre();
	public void delete(int id);
	public boolean update(Oeuvre oeuvre);
}
