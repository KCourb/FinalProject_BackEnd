package com.projet.clinique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.ICreneauDAO;
import com.projet.clinique.entity.Creneau;

@Service
public class CreneauService {
	
	@Autowired
	private ICreneauDAO dao;

	public ICreneauDAO getDao() {
		return dao;
	}

	public void setDaodemain(ICreneauDAO dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Creneau obj) {
		dao.save(obj);
	}
	
	public void SuppService(Creneau obj) {
		dao.delete(obj);
	}
	
	public Creneau GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Creneau obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Creneau> GetAll() {
		List<Creneau> res = dao.findAll();
		return res;
	}
}
