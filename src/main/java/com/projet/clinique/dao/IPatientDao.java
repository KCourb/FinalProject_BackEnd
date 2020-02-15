package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Patient;

public interface IPatientDao extends JpaRepository<Patient , Long> {

}
