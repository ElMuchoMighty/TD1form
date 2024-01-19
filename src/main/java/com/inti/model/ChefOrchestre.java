package com.inti.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * @author guill
 *model Chef d'orchestre
 */
@Entity
@Table(name = "CHEFORCHESTRE")
@Data
public class ChefOrchestre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private  String nationalite;
	private String cachet;
	private String Commentaires;
	
	@ManyToOne
	@JoinColumn(name = "oeuvre_id", nullable = false)
	private Oeuvre oeuvre;
}
