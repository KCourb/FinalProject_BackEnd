package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Departement;

public interface IDepartementDao extends JpaRepository<Departement , Long> {

}
