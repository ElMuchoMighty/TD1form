package com.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.ChefOrchestre;
import com.inti.repository.IChefRepository;

@Service
public class ChefOrchestreServiceImpl implements IChefOrchestreService{

	@Autowired
	IChefRepository icf;
	
	@Override
	public ChefOrchestre save(ChefOrchestre chefOrchestre) {
		return icf.save(chefOrchestre);
	}

	@Override
	public List<ChefOrchestre> getAllChefOrchestre() {
		return icf.findAll();
	}

	@Override
	public void delete(long id) {
		icf.deleteById((long) id);
		
	}

	@Override
	public boolean update(ChefOrchestre chefOrchestre) {
		icf.save(chefOrchestre);
		return true;
	}

}
