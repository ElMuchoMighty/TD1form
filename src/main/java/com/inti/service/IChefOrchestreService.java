package com.inti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inti.model.ChefOrchestre;

@Service
public interface IChefOrchestreService {
	public ChefOrchestre save (ChefOrchestre chefOrchestre);
	public List<ChefOrchestre> getAllChefOrchestre();
	public void delete(long l);
	public boolean update(ChefOrchestre chefOrchestre);
}
