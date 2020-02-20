package com.projet.clinique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IFactureDao;
import com.projet.clinique.entity.Facture;
import com.projet.clinique.entity.Medecin;

@Service
public class FactureService {
	
	@Autowired
	private IFactureDao dao;

	public IFactureDao getDao() {
		return dao;
	}

	public void setDao(IFactureDao dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Facture obj) {
		dao.save(obj);
	}
	
	public void SuppService(Facture obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Facture> FindByIdService(Long id) {
	    Optional<Facture> res = dao.findById(id);
		return res;
	}
	
	public Facture GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public Facture Update(Facture obj) {
		return dao.saveAndFlush(obj);
	}
	
	public List<Facture> GetAll() {
		List<Facture> res = dao.findAll();
		return res;
	}
	
public Facture getAllByFkDept(Long id){
		
		Facture facs = dao.getAllByFkDept(id);
		
		return facs;
	}
	
	

}
