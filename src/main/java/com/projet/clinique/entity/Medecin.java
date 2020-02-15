package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Medecin {
	
	@Id
	private long idMedecin;
	@Column
	private String nomMedecin;
	@Column
	private Departement departement;  //ManyToOne avec dpt
	@Column
	private List<Rdv> lstrdv;  //OneToMany avec rdv
	public long getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(long idMedecin) {
		this.idMedecin = idMedecin;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public List<Rdv> getLstrdv() {
		return lstrdv;
	}
	public void setLstrdv(List<Rdv> lstrdv) {
		this.lstrdv = lstrdv;
	}
	public Medecin(long idMedecin, String nomMedecin, Departement departement, List<Rdv> lstrdv) {
		super();
		this.idMedecin = idMedecin;
		this.nomMedecin = nomMedecin;
		this.departement = departement;
		this.lstrdv = lstrdv;
	}
	public Medecin() {
		super();
	}
	@Override
	public String toString() {
		return "Medecin [idMedecin=" + idMedecin + ", nomMedecin=" + nomMedecin + ", departement=" + departement
				+ ", lstrdv=" + lstrdv + "]";
	}

	
}
