package com.projet.clinique.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IPatientDao;
import com.projet.clinique.entity.Patient;

@Service
public class PatientService {
	
	@Autowired
	private IPatientDao dao;

	public IPatientDao getDao() {
		return dao;
	}

	public void setDao(IPatientDao dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Patient obj) {
		dao.save(obj);
	}
	
	public void SuppService(Patient obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Patient> FindByIdService(Long id) {
	    Optional<Patient> res = dao.findById(id);
		return res;
	}
	
	public Patient GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Patient obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Patient> GetAll() {
		List<Patient> res = dao.findAll();
		return res;
	}
	
	public long GetNewPatId() {
		List<Patient> lstpat = this.GetAll();
		int n = lstpat.size();
		long taille = n;
		
		return taille;
//		lstpat.add(new Patient(1L));
//		List<Long> res = new ArrayList<>();
//		
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
	
	}
	
	public Patient GetByNumSecu(int x) {
		List<Patient> allPat = this.GetAll();
		Patient res = new Patient();
		for (Patient pat : allPat) {
			if (pat.getNumSecu()==x) {
				res=pat;
			}
		}
		return res;
	}
}
