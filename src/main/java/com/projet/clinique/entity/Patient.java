package com.projet.clinique.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
	
	@Id
	private long idPatient;
	@Column
	private String nomPatient;
	@Column
	private String prenomPatient;
	@Column
	private String sexe;
	@Column
	private String dateNaissance;
	@Column
	private int numSecu;
	@Column
	private String mailPatient;
	@OneToOne
	@JoinColumn(name = "id_user")
	private Users user;
	
	
	public long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public String getPrenomPatient() {
		return prenomPatient;
	}
	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public int getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(int numSecu) {
		this.numSecu = numSecu;
	}
	public String getMailPatient() {
		return mailPatient;
	}
	public void setMailPatient(String mailPatient) {
		this.mailPatient = mailPatient;
	}
	public Patient(long idPatient, String nomPatient, String prenomPatient, String sexe, String dateNaissance,
			int numSecu, String mailPatient , Users user) {
		super();
		this.idPatient = idPatient;
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.numSecu = numSecu;
		this.mailPatient = mailPatient;
		this.user = user;
	}
	public Patient() {
		super();
	}
	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
				+ ", sexe=" + sexe + ", dateNaissance=" + dateNaissance + ", numSecu=" + numSecu + ", mailPatient="
				+ mailPatient  + "]";
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Patient(long idPatient) {
		super();
		this.idPatient = idPatient;
	}
	
	
	

}
