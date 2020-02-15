package com.projet.clinique.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

                                                    //    EXPORT PDF

@Entity
@Table
public class Facture {
	
	@Id
	private long idFacture;	
	@Column
	private Date dateEdition;
	@Column
	private Boolean payee;
	@Column
	private Consultation consultation;  //OneTone avec Consulation

}
