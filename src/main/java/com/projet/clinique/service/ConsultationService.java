package com.projet.clinique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IConsultationDao;
import com.projet.clinique.entity.Consultation;


@Service
public class ConsultationService {
	
	@Autowired
	private IConsultationDao dao;

	public IConsultationDao getDao() {
		return dao;
	}

	public void setDao(IConsultationDao dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Consultation obj) {
		dao.save(obj);
	}
	
	public void SuppService(Consultation obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Consultation> FindByIdService(Long id) {
	    Optional<Consultation> res = dao.findById(id);
		return res;
	}
	
	public Consultation GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Consultation obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Consultation> GetAll() {
		List<Consultation> res = dao.findAll();
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
