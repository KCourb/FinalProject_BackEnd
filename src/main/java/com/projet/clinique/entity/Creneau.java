package com.projet.clinique.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Creneau {
	
	@Id
	private long id;
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "medecin")
	private Medecin medecin;
	@Column
	private String horaire;
	@Column
	private boolean reserve;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	public String getHoraire() {
		return horaire;
	}
	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}
	public boolean isReserve() {
		return reserve;
	}
	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}
	
	public Creneau(long id, Medecin medecin, String horaire, boolean reserve) {
		super();
		this.id = id;
		this.medecin = medecin;
		this.horaire = horaire;
		this.reserve = reserve;
	}
	public Creneau() {
		super();
	}
	@Override
	public String toString() {
		return "Creneau [id=" + id + ", medecin=" + medecin + ", horaire=" + horaire + ", reserve=" + reserve + "]";
	}
	


	
	
	

}
