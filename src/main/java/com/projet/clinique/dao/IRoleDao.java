package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Roles;

public interface IRoleDao  extends JpaRepository<Roles , Long> {

}
