package com.projet.clinique.entity;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Rdv {
	
	@Id
	private long idRdv;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "créneau")
	private Creneau creneau;
	@Column
	private String motif;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "medecin")
	private Medecin medecin;   
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "patient")
	private Patient patient;
	
	
	public long getIdRdv() {
		return idRdv;
	}
	public void setIdRdv(long idRdv) {
		this.idRdv = idRdv;
	}
	
	public Creneau getCreneau() {
		return creneau;
	}
	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
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
	public Rdv(long idRdv, Creneau creneau, String motif, Medecin medecin, Patient patient) {
		super();
		this.idRdv = idRdv;
		this.creneau = creneau;
		this.motif = motif;
		this.medecin = medecin;
		this.patient = patient;
	}
	public Rdv() {
		super();
		
	}
	@Override
	public String toString() {
		return "Rdv [idRdv=" + idRdv + ", creneau=" + creneau + ", motif=" + motif + ", medecin=" + medecin
				+ ", patient=" + patient + "]";
	}
	

	
	
	

}
