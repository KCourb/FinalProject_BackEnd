package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Consultation {
	
	@Id
	private long idConsultation;
	@Column
	private String bilanPrescription;
	@Column
	private Rdv rdv;  //OneTone avec Rdv
	@Column
	private Facture facture;  //OneTone avec Facture
	@Column
	private List<Prescription> lstPrescription;   //OneToMany

}
