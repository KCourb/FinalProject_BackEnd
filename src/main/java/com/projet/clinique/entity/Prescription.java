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
	
	
	public long getIdPrescription() {
		return idPrescription;
	}
	public void setIdPrescription(long idPrescription) {
		this.idPrescription = idPrescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Prescription(long idPrescription, String description, Consultation consultation) {
		super();
		this.idPrescription = idPrescription;
		this.description = description;
		this.consultation = consultation;
	}
	public Prescription() {
		super();
	}
	@Override
	public String toString() {
		return "Prescription [idPrescription=" + idPrescription + ", description=" + description + ", consultation="
				+ consultation + "]";
	}
	
	

}

