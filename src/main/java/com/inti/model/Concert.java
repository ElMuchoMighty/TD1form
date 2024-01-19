package com.inti.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "concert")
@Data
public class Concert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;

	private String nom;
	private Date date;

	@OneToMany(mappedBy = "concert")
	private List<Oeuvre> oeuvres;
	
	@OneToMany(mappedBy = "concert")
	private List<Lieu> lieux;

}
