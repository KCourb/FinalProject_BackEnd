package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Departement {
	
	@Id
	private long idDepartement;
	@Column
	private String nomDepartement;
	@Column
	private List<Medecin> lstMedecin;  //OneToMany avec Medecin
	
	public long getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(long idDepartement) {
		this.idDepartement = idDepartement;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	public List<Medecin> getLstMedecin() {
		return lstMedecin;
	}
	public void setLstMedecin(List<Medecin> lstMedecin) {
		this.lstMedecin = lstMedecin;
	}
	public Departement() {
		super();
	}
	@Override
	public String toString() {
		return "Departement [idDepartement=" + idDepartement + ", nomDepartement=" + nomDepartement + ", lstMedecin="
				+ lstMedecin + "]";
	}
	
	

}
