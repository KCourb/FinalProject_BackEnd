package com.projet.clinique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.clinique.dao.IUserDao;
import com.projet.clinique.entity.Users;

@Service
public class UserService {
	
	@Autowired
	private IUserDao dao;

	public IUserDao getDao() {
		return dao;
	}

	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	
	public void AjoutService(Users obj) {
		dao.save(obj);
	}
	
	public void SuppService(Users obj) {
		dao.delete(obj);
	}
	
	public void SuppByIdService(Long id) {
		dao.deleteById(id);
	}
	
	public Optional<Users> FindByIdService(Long id) {
	    Optional<Users> res = dao.findById(id);
		return res;
	}
	
	public Users GetOne(Long id) {
		return dao.getOne(id);
	}
	
	public void Update(Users obj) {
		dao.saveAndFlush(obj);
	}
	
	public List<Users> GetAll() {
		List<Users> res = dao.findAll();
		return res;
	}


}
