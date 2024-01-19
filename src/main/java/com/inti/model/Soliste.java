package com.inti.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * @author guill
 *Opération CRUD qu'on va faire la deussus
 */

@Entity
@Table(name = "soliste")
@Data
public class Soliste {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "num", length = 50)
	private long num;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String nationalite;
	
	@ManyToMany
	@JoinTable( name = "Asso_Oeuvre_Soliste", joinColumns = @JoinColumn(name = "id"),
	inverseJoinColumns = @JoinColumn( name = "num"))
	private List<Oeuvre> oeuvres = new ArrayList<>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public Soliste(long num, String nom, String prenom, Date dateNaissance, String nationalite) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.nationalite = nationalite;
	}
	public Soliste(int id, long num, String nom, String prenom, Date dateNaissance, String nationalite) {
		super();
		this.id = id;
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.nationalite = nationalite;
	}
	public List<Oeuvre> getOeuvres() {
		return oeuvres;
	}
	public void setOeuvres(List<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}
	public Soliste(long num, String nom, String prenom, Date dateNaissance, String nationalite, List<Oeuvre> oeuvres) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.nationalite = nationalite;
		this.oeuvres = oeuvres;
	}
	public Soliste() {
		super();
	}
	
}
