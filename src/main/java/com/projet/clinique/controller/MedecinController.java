package com.projet.clinique.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Medecin;
import com.projet.clinique.entity.Patient;
import com.projet.clinique.service.MedecinService;

@Controller
@RequestMapping (value="/Medecin")
public class MedecinController {
	
	@Autowired
	private MedecinService mserv;
	

	public MedecinService getMserv() {
		return mserv;
	}

	public void setMserv(MedecinService mserv) {
		this.mserv = mserv;
	}
	

	@RequestMapping(value="", method=RequestMethod.GET)
	public String init2(ModelMap model) {	
		String username = null;
		model.addAttribute("username" , username );
		return "portailMedecin";
	}
	
	
	@RequestMapping(value="/Login", method=RequestMethod.POST)
	public String init(@ModelAttribute("username") String username , ModelMap model) {
		
		
		Medecin medecin = mserv.GetByNom(username);
		model.addAttribute("medecin", medecin);		
		return "medecinConnecte";
	}
	
	
	
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutMedecin(@ModelAttribute("m") Medecin m, Model model) {
		mserv.AjoutService(m);
		return "redirect:All";
	}
	
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerMedecin(@ModelAttribute("m") Medecin m, Model model) {
		mserv.SuppService(m);
		return "redirect:All";
	}
	
	@RequestMapping(value="/SupByID", method=RequestMethod.POST)
	public String SupMedecinByID(@ModelAttribute("m") Medecin m, Model model) {
		mserv.SuppByIdService(m.getIdMedecin());
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetMedecinByID(@ModelAttribute("m") Medecin m, Model model) {
		model.addAttribute("lemedecin", mserv.GetOne(m.getIdMedecin()));
		return "leMedecin";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdateMedecin(@ModelAttribute("m") Medecin m, Model model) {
		mserv.Update(m);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllMedecin(ModelMap model) {
		model.addAttribute("listeDesMedecins", mserv.GetAll());
		return "medecin";
	}
	
	@RequestMapping(value="/HeadMaster", method=RequestMethod.GET)
	public String getHeadMaster(ModelMap model) {
		model.addAttribute("Medecin", mserv.GetAll());
		return "headMasterView";
	}
	
	
	

}
