package com.inti.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "oeuvre")
public class Oeuvre {
	@Id
	@GeneratedValue
	private long num;
	private String nom;
	private long duree;
	
	@ManyToMany(mappedBy = "oeuvres")
	private List<Soliste> soliste = new ArrayList<>();

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getDuree() {
		return duree;
	}

	public void setDuree(long duree) {
		this.duree = duree;
	}

	public List<Soliste> getSoliste() {
		return soliste;
	}

	public void setSoliste(List<Soliste> soliste) {
		this.soliste = soliste;
	}

	public Oeuvre(long num, String nom, long duree, List<Soliste> soliste) {
		super();
		this.num = num;
		this.nom = nom;
		this.duree = duree;
		this.soliste = soliste;
	}

	public Oeuvre(String nom, long duree, List<Soliste> soliste) {
		super();
		this.nom = nom;
		this.duree = duree;
		this.soliste = soliste;
	}
	
	

}
