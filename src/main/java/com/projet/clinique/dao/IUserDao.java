package com.projet.clinique.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.clinique.entity.Users;

public interface IUserDao extends JpaRepository<Users , Long> {

}
