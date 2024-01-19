package com.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Lieu;
import com.inti.repository.ILieuRepository;

@Service
public class LieuServiceImpl implements ILieuService {
	
	@Autowired
	ILieuRepository ilr;

	@Override
	public Lieu save(Lieu lieu) {
		return ilr.save(lieu);
	}

	@Override
	public List<Lieu> getAllLieu() {
		return ilr.findAll();
	}

	@Override
	public void delete(long id) {
		ilr.deleteById(id);
	}

	@Override
	public boolean update(Lieu lieu) {
		ilr.save(lieu);
		return true;
	}

}
