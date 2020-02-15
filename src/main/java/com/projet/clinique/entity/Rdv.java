package com.projet.clinique.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rdv {
	
	@Id
	private long idRdv;
	@Column
	private Date date;
	@Column
	private String motif;
	@Column
	private Medecin medecin;   //ManyToOne avec Medecin
	@Column
	private Patient patient;   //ManyToOne avec Patient
	
	

}
