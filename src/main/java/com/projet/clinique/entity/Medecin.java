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

}
