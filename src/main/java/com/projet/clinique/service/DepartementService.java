package com.projet.clinique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IDepartementDao;
import com.projet.clinique.entity.Departement;

@Service
public class DepartementService {
	
	@Autowired
	private IDepartementDao dao;

	public IDepartementDao getDao() {
		return dao;
	}

	public void setDao(IDepartementDao dao) {
		this.dao = dao;
	}
	
	
	public void AjoutService(Departement obj) {
		dao.save(obj);
	}
	
	public void SuppService(Departement obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Departement> FindByIdService(Long id) {
	    Optional<Departement> res = dao.findById(id);
		return res;
	}
	
	public Departement GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Departement obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Departement> GetAll() {
		List<Departement> res = dao.findAll();
		return res;
	}

}
