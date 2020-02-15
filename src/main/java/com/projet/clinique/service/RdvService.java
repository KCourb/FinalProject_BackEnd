package com.projet.clinique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IRdvDao;
import com.projet.clinique.entity.Rdv;

@Service
public class RdvService {
	
	@Autowired
	private IRdvDao dao;

	public IRdvDao getDao() {
		return dao;
	}

	public void setDao(IRdvDao dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Rdv obj) {
		dao.save(obj);
	}
	
	public void SuppService(Rdv obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Rdv> FindByIdService(Long id) {
	    Optional<Rdv> res = dao.findById(id);
		return res;
	}
	
	public Rdv GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Rdv obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Rdv> GetAll() {
		List<Rdv> res = dao.findAll();
		return res;
	}

}
