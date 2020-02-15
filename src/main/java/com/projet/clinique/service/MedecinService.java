package com.projet.clinique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IMedecinDao;
import com.projet.clinique.entity.Medecin;

@Service
public class MedecinService {
	
	@Autowired
	private IMedecinDao dao;

	public IMedecinDao getDao() {
		return dao;
	}

	public void setDao(IMedecinDao dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Medecin obj) {
		dao.save(obj);
	}
	
	public void SuppService(Medecin obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Medecin> FindByIdService(Long id) {
	    Optional<Medecin> res = dao.findById(id);
		return res;
	}
	
	public Medecin GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Medecin obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Medecin> GetAll() {
		List<Medecin> res = dao.findAll();
		return res;
	}

}
