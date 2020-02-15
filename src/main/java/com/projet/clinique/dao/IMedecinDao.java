package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Medecin;



public interface IMedecinDao extends JpaRepository<Medecin , Long> {

}
