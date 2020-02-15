package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Rdv;

public interface IRdvDao extends JpaRepository<Rdv , Long> {

}
