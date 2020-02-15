package com.projet.clinique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IPrescriptionDao;
import com.projet.clinique.entity.Prescription;

@Service
public class PrescriptionService {
	
	@Autowired
	private IPrescriptionDao dao;

	public IPrescriptionDao getDao() {
		return dao;
	}

	public void setDao(IPrescriptionDao dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Prescription obj) {
		dao.save(obj);
	}
	
	public void SuppService(Prescription obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Prescription> FindByIdService(Long id) {
	    Optional<Prescription> res = dao.findById(id);
		return res;
	}
	
	public Prescription GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Prescription obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Prescription> GetAll() {
		List<Prescription> res = dao.findAll();
		return res;
	}

}
