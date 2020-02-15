package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Consultation;

public interface IConsultationDao extends JpaRepository<Consultation , Long> {

}
