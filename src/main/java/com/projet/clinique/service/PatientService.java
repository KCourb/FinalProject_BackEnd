package com.projet.clinique.service;

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

}
