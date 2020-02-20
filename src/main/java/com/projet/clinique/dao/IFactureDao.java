package com.projet.clinique.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projet.clinique.entity.Facture;


public interface IFactureDao extends JpaRepository<Facture , Long> {
	

	@Query("select f from Facture f where f.consultation.idConsultation = ?1")
	Facture getAllByFkDept(Long id);

}
