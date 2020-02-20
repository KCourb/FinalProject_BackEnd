package com.projet.clinique.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projet.clinique.entity.Creneau;

public interface ICreneauDAO extends JpaRepository<Creneau, Long> {
	
	@Query("select f from Creneau f where f.medecin.idMedecin = ?1")
	List<Creneau> getAllByFkMed(Long id);


}
