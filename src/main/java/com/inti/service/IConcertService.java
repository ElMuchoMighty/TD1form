package com.inti.service;

import java.util.List;

import com.inti.model.Concert;

public interface IConcertService{
	public Concert save (Concert concert);
	public List<Concert> getAllConcert();
	public void delete(long id);
	public boolean update(Concert concert);
}
