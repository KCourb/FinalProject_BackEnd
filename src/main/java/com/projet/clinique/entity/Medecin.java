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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Medecin {
	
	@Id
	private long idMedecin;
	@Column
	private String nomMedecin;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "departement")
	private Departement departement;
	
	@JsonIgnore
	@OneToMany(mappedBy = "medecin", cascade = CascadeType.PERSIST)
	private List<Rdv> lstrdv;
	@OneToOne
	@JoinColumn(name = "id_user")
	private Users user;
	@OneToMany(mappedBy="medecin", cascade=CascadeType.PERSIST)
	private List<Creneau> lstdemain;
	
	
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
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
	
	public List<Creneau> getLstdemain() {
		return lstdemain;
	}
	public void setLstdemain(List<Creneau> lstdemain) {
		this.lstdemain = lstdemain;
	}
	public Medecin(long idMedecin, String nomMedecin, Departement departement, List<Rdv> lstrdv , Users user) {
		super();
		this.idMedecin = idMedecin;
		this.nomMedecin = nomMedecin;
		this.departement = departement;
		this.lstrdv = lstrdv;
		this.user = user;
	}
	public Medecin() {
		super();
	}
	
	public Medecin(long idMedecin, String nomMedecin, Departement departement, List<Rdv> lstrdv, Users user,
			List<Creneau> lstdemain) {
		super();
		this.idMedecin = idMedecin;
		this.nomMedecin = nomMedecin;
		this.departement = departement;
		this.lstrdv = lstrdv;
		this.user = user;
		this.lstdemain = lstdemain;
	}
	@Override
	public String toString() {
		return "Medecin [idMedecin=" + idMedecin + "]";
	}
	public Medecin(long idMedecin, String nomMedecin, Departement departement) {
		super();
		this.idMedecin = idMedecin;
		this.nomMedecin = nomMedecin;
		this.departement = departement;
	}

	
}
