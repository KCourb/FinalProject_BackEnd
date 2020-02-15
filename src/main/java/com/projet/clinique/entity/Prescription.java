package com.projet.clinique.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

                                                 //EXPORT PDF

@Entity
@Table
public class Prescription {
	
	@Id
	private long idPrescription;
	@Column
	private String description;
	@Column
	private Consultation consultation;   //ManyToOne avec Consulation

}
