package com.projet.clinique.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projet.clinique.entity.Medecin;



public interface IMedecinDao extends JpaRepository<Medecin , Long> {

	@Query("select m from Medecin m where m.departement.idDepartement = ?1")
	List<Medecin> getAllByFkDept(Long id);	
}
