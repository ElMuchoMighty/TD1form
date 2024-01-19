package com.inti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inti.model.Soliste;

@Service
public interface ISolisteService {
	public Soliste save (Soliste soliste);
	public List<Soliste> getAllSoliste();
	public void delete(Long id);
	public boolean update(Soliste soliste);
	public List<Soliste> findByNom(String nom);
	public long getSolisteCount();
}
