package com.inti.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Classe lieu
 */

@Data
@Entity
@Table
public class Lieu {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numero;
	private String nom;
	private LocalDate date;
	
	// @ManyToOne
	// private List<Concert> listeDesConcerts;
}
