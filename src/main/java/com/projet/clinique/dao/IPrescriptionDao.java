package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Prescription;

public interface IPrescriptionDao extends JpaRepository<Prescription , Long> {

}
