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
	
	
	public long getIdRdv() {
		return idRdv;
	}
	public void setIdRdv(long idRdv) {
		this.idRdv = idRdv;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Rdv(long idRdv, Date date, String motif, Medecin medecin, Patient patient) {
		super();
		this.idRdv = idRdv;
		this.date = date;
		this.motif = motif;
		this.medecin = medecin;
		this.patient = patient;
	}
	public Rdv() {
		super();
	}
	@Override
	public String toString() {
		return "Rdv [idRdv=" + idRdv + ", date=" + date + ", motif=" + motif + ", medecin=" + medecin + ", patient="
				+ patient + "]";
	}
	
	
	

}
