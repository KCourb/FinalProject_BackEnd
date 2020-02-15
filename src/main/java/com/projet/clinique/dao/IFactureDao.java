package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Facture;

public interface IFactureDao extends JpaRepository<Facture , Long> {

}
