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
				+ rdv + ", facture=" + facture + ", lstPrescription=" + lstPrescription + "]";
	}
	
	
	

}
