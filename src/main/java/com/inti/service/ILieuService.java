package com.inti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inti.model.Lieu;

public interface ILieuService {
	public Lieu save (Lieu lieu);
	public List<Lieu> getAllLieu();
	public void delete(long id);
	public boolean update(Lieu lieu);
}
