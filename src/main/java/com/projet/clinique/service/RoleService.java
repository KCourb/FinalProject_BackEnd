package com.projet.clinique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IRoleDao;
import com.projet.clinique.entity.Roles;

@Service
public class RoleService {
	
	@Autowired
	private IRoleDao dao;

	public IRoleDao getDao() {
		return dao;
	}

	public void setDao(IRoleDao dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Roles obj) {
		dao.save(obj);
	}
	
	public void SuppService(Roles obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Roles> FindByIdService(Long id) {
	    Optional<Roles> res = dao.findById(id);
		return res;
	}
	
	public Roles GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Roles obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Roles> GetAll() {
		List<Roles> res = dao.findAll();
		return res;
	}

	
	

}
