package com.projet.clinique.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

///

@Entity
@Table
public class Departement {
	
	@Id
	private long idDepartement;
	@Column
	private String nomDepartement;
	@Column
	private List<Medecin> lstMedecin;  //OneToMany avec Medecin
	
	

}
