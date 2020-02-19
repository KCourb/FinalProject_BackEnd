package com.projet.clinique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Departement;
import com.projet.clinique.entity.Medecin;
import com.projet.clinique.entity.Roles;
import com.projet.clinique.entity.Users;
import com.projet.clinique.service.DepartementService;
import com.projet.clinique.service.MedecinService;
import com.projet.clinique.service.RoleService;
import com.projet.clinique.service.UserService;

@Controller
@RequestMapping (value="/HeadMaster")
public class HeadMasterController {
	
	@Autowired
	private MedecinService mserv;

	public MedecinService getMserv() {
		return mserv;
	}

	public void setMserv(MedecinService mserv) {
		this.mserv = mserv;
	}
	
	@Autowired
	private DepartementService dserv;

	public DepartementService getDserv() {
		return dserv;
	}

	public void setDserv(DepartementService dserv) {
		this.dserv = dserv;
	}
	
	@Autowired
	private UserService userv;
	
	
	
	
	public UserService getUserv() {
		return userv;
	}

	public void setUserv(UserService userv) {
		this.userv = userv;
	}
	
	@Autowired
	private RoleService rserv;
	
	
	
	

	public RoleService getRserv() {
		return rserv;
	}

	public void setRserv(RoleService rserv) {
		this.rserv = rserv;
	}

	@RequestMapping(value="", method=RequestMethod.GET)
	public String init() {
		return "headMasterView";
	}
	
	
	
	@RequestMapping(value="/AjoutMedecin", method=RequestMethod.GET)
	public String init(ModelMap model) {
		Medecin m = new Medecin();
		model.addAttribute("med", m);
		List<Departement> lstDprt = dserv.GetAll();
		model.addAttribute("lstDprt", lstDprt);
		long idDprt = 0l;
		model.addAttribute("idDprt", idDprt);
		return "ajoutMedecin";
	}
	
	@RequestMapping(value="/AjoutDepartement", method=RequestMethod.GET)
	public String init(@ModelAttribute("d") Departement d) {
		d = new Departement();
		return "ajoutDepartement";
	}
	
	@RequestMapping(value="/AjoutDepartement", method=RequestMethod.POST)
	public String AjoutDepartement(@ModelAttribute("d") Departement d, Model model) {
		dserv.AjoutService(d);
		return "headMasterView";
	}
	
	@RequestMapping(value="/AjoutMedecin", method=RequestMethod.POST)
	public String AjoutMedecin(@ModelAttribute("idDprt") long idDprt , @ModelAttribute("med") Medecin med ,  Model model) {
		med.setDepartement(dserv.GetOne(idDprt));
		
		Roles role = new Roles(1L , "MEDECIN");
		rserv.AjoutService(role);
		Users user = new Users(2*(med.getIdMedecin()) , med.getNomMedecin() , " {noop}0000" , true , role);
		userv.AjoutService(user);
		med.setUser(user);
		mserv.AjoutService(med);
		return "headMasterView";
	}
	
	

}
