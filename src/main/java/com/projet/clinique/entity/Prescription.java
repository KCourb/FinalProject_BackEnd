package com.projet.clinique.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Boolean validee;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "consultation")
	private Consultation consultation;   
	
	
	public Boolean getValidee() {
		return validee;
	}
	public void setValidee(Boolean validee) {
		this.validee = validee;
	}
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

	public Prescription(long idPrescription, String description, Boolean validee, Consultation consultation) {
		super();
		this.idPrescription = idPrescription;
		this.description = description;
		this.validee = validee;
		this.consultation = consultation;
	}
	@Override
	public String toString() {
		return "Prescription [idPrescription=" + idPrescription + ", description=" + description + ", validee="
				+ validee + ", consultation=" + consultation + "]";
	}
	
	
	

}

