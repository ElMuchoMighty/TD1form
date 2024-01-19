package com.inti.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

}
