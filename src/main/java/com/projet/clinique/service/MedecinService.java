package com.projet.clinique.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IMedecinDao;
import com.projet.clinique.entity.Medecin;
import com.projet.clinique.entity.Patient;

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
	
	public long GetNewMedId() {
		List<Medecin> lstmed = this.GetAll();
		int n = lstmed.size();
		long taille = n;
		
		return taille;
		
//		for(Patient setri : lstpat) {			
//			res.add(setri.getIdPatient());
//		}
//		
//		Long nouveau = Collections.max(res);
//		
//		
//		
//		
//		if (nouveau%2 == 0) {nouveau+=1;}
//		return nouveau; 
//	
	}

}
