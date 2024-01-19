package com.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Concert;
import com.inti.repository.IConcertRepository;

@Service
public class ConcertServiceImpl implements IConcertService {

	@Autowired
	IConcertRepository iConcertRepository;

	@Override
	public Concert save(Concert concert) {
		return iConcertRepository.save(concert);
	}

	@Override
	public List<Concert> getAllConcert() {
		return iConcertRepository.findAll();
	}

	@Override
	public void delete(long id) {
		iConcertRepository.deleteById(id);
	}

	@Override
	public boolean update(Concert concert) {
		iConcertRepository.save(concert);
		return true;
	}

}
