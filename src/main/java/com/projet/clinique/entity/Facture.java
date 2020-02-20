package com.projet.clinique.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

                                                    //    EXPORT PDF

@Entity
@Table
public class Facture {
	
	@Id
	private long idFacture;	
	@Column
	private String dateEdition;
	@Column
	private double montant;
	@Column
	private Boolean payee;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "consultation")
	private Consultation consultation;  
	
	public long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}
	public String getDateEdition() {
		return dateEdition;
	}
	public void setDateEdition(String dateEdition) {
		this.dateEdition = dateEdition;
	}
		
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Boolean getPayee() {
		return payee;
	}
	public void setPayee(Boolean payee) {
		this.payee = payee;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Facture(long idFacture, String dateEdition, double montant, Boolean payee, Consultation consultation) {
		super();
		this.idFacture = idFacture;
		this.dateEdition = dateEdition;
		this.montant = montant;
		this.payee = payee;
		this.consultation = consultation;
	}
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", dateEdition=" + dateEdition + ", montant=" + montant + ", payee="
				+ payee + ", consultation=" + consultation + "]";
	}
	public Facture() {
		super();
	
	}
}
