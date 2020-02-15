package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Medecin {
	
	@Id
	private long idMedecin;
	@Column
	private String nomMedecin;
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "departement")
	private Departement departement;  
	@OneToMany(mappedBy = "medecin", cascade = CascadeType.PERSIST)
	private List<Rdv> lstrdv;
	
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
