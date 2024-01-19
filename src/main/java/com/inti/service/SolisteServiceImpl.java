package com.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Soliste;
import com.inti.repository.ISolisteRepository;

@Service
public class SolisteServiceImpl implements ISolisteService{
	
	@Autowired
	ISolisteRepository isr;

	@Override
	public Soliste save(Soliste soliste) {
		
		return isr.save(soliste);
	}

	@Override
	public List<Soliste> getAllSoliste() {
		
		return isr.findAll();
	}


	@Override
	public boolean update(Soliste soliste) {
		isr.save(soliste);
		return true;
	}

	@Override
	public List<Soliste> findByNom(String nom) {
		return isr.findByNom(nom);
	}

	@Override
	public long getSolisteCount() {
		return isr.count();
	}
	
	@Override
	public Optional<Soliste> getSoliste(long id) {
		return isr.findById(id);
	}

	@Override
	public void delete(Long id) {
		isr.deleteById(id);
	}

}
