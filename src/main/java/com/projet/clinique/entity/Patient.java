package com.projet.clinique.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
	
	@Id
	private long idPatient;
	@Column
	private String nomPatient;
	@Column
	private String prenomPatient;
	@Column
	private String sexe;
	@Column
	private Date dateNaissance;
	@Column
	private int numSecu;
	@Column
	private String mailPatient;
	

}
