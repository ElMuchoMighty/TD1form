package com.inti.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
	private long num;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String nationalite;
	
	@ManyToMany
	@JoinTable( name = "Asso_Oeuvre_Soliste", joinColumns = @JoinColumn(name = "num_soliste"),
	inverseJoinColumns = @JoinColumn( name = "num_oeuvre"))
	private List<Oeuvre> oeuvres = new ArrayList<>();

}
