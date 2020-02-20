package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Consultation {
	
	@Id
	private long idConsultation;
	@Column
	private String bilanPrescription;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rdv")
	private Rdv rdv;
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "facture")
	private Facture facture;
	@JsonIgnore
	@OneToMany(mappedBy = "consultation", cascade = CascadeType.PERSIST)
	private List<Prescription> lstPrescription;   
	
	public long getIdConsultation() {
		return idConsultation;
	}
	public void setIdConsultation(long idConsultation) {
		this.idConsultation = idConsultation;
	}
	public String getBilanPrescription() {
		return bilanPrescription;
	}
	public void setBilanPrescription(String bilanPrescription) {
		this.bilanPrescription = bilanPrescription;
	}
	public Rdv getRdv() {
		return rdv;
	}
	public void setRdv(Rdv rdv) {
		this.rdv = rdv;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public List<Prescription> getLstPrescription() {
		return lstPrescription;
	}
	public void setLstPrescription(List<Prescription> lstPrescription) {
		this.lstPrescription = lstPrescription;
	}
	public Consultation(long idConsultation, String bilanPrescription, Rdv rdv, Facture facture,
			List<Prescription> lstPrescription) {
		super();
		this.idConsultation = idConsultation;
		this.bilanPrescription = bilanPrescription;
		this.rdv = rdv;
		this.facture = facture;
		this.lstPrescription = lstPrescription;
	}
	public Consultation() {
		super();
	}
	@Override
	public String toString() {
		return "Consultation [idConsultation=" + idConsultation + ", bilanPrescription=" + bilanPrescription + ", rdv="
				+ rdv + "]";
	}
	
	
	

}
