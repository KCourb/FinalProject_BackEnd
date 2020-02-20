package com.projet.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Patient;
import com.projet.clinique.entity.Roles;
import com.projet.clinique.entity.Users;
import com.projet.clinique.service.RoleService;
import com.projet.clinique.service.UserService;

@Controller
@RequestMapping (value="")
public class MenuController {
	
	@Autowired
	private RoleService rserv;
	
	
	
	

	public RoleService getRserv() {
		return rserv;
	}

	public void setRserv(RoleService rserv) {
		this.rserv = rserv;
	}
	
	@Autowired
	private UserService userv;
	
	
	
	

	public UserService getUserv() {
		return userv;
	}

	public void setUserv(UserService userv) {
		this.userv = userv;
	}
	

	

	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init() {
		
		
		Roles role0 = new Roles(0L , "MASTER");
		rserv.Update(role0);
		Roles role1 = new Roles(1L , "MEDECIN");
		rserv.AjoutService(role1);
		Roles role2 = new Roles(2L , "PATIENT");
		rserv.AjoutService(role2);
		
		Users chef = new Users(0 , "admin" , "{noop}admin" , true , role0);
		userv.AjoutService(chef);
		

		
		
		

		return "Menu";
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String init2() {
			
		

		return "Menu";
	}

}
