package com.projet.clinique.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

                                                    //    EXPORT PDF

@Entity
@Table
public class Facture {
	
	@Id
	private long idFacture;	
	@Column
	private Date dateEdition;
	@Column
	private Boolean payee;
	@Column
	private Consultation consultation;  //OneTone avec Consulation
	public long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}
	public Date getDateEdition() {
		return dateEdition;
	}
	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
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
	public Facture(long idFacture, Date dateEdition, Boolean payee, Consultation consultation) {
		super();
		this.idFacture = idFacture;
		this.dateEdition = dateEdition;
		this.payee = payee;
		this.consultation = consultation;
	}
	public Facture() {
		super();
	}
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", dateEdition=" + dateEdition + ", payee=" + payee
				+ ", consultation=" + consultation + "]";
	}
	
	

}
