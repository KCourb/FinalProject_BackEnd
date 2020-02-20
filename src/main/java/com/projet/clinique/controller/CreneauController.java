package com.projet.clinique.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Creneau;
import com.projet.clinique.entity.Medecin;
import com.projet.clinique.service.CreneauService;
import com.projet.clinique.service.MedecinService;

@Controller
@RequestMapping(value="/Creneau")
public class CreneauController {
	
	@Autowired
	private CreneauService cserv;

	public CreneauService getDserv() {
		return cserv;
	}

	public void setDserv(CreneauService dserv) {
		this.cserv = dserv;
	}
	
	@Autowired
	private MedecinService mserv;
	
	
	
	public MedecinService getMserv() {
		return mserv;
	}

	public void setMserv(MedecinService mserv) {
		this.mserv = mserv;
	}

	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init(@ModelAttribute("d") Creneau d , HttpServletRequest request , Model model) {	
		long idMed  = Long.parseLong(request.getParameter("id"));
		Medecin med = mserv.GetOne(idMed);
		model.addAttribute("medecin" , med);	
		return "creneau";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutDemain( HttpServletRequest request  , @ModelAttribute("d") Creneau d, Model model) {
		d.setId(cserv.GetNewCreId());
		long idMed  = Long.parseLong(request.getParameter("id"));
		Medecin med = mserv.GetOne(idMed);
		d.setMedecin(med);
		cserv.AjoutService(d);
		model.addAttribute("medecin" , med);
		return "redirect:All";
	}
	
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerDemain(@ModelAttribute("d") Creneau d, Model model) {
		cserv.SuppService(d);
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetDemainByID(@ModelAttribute("d") Creneau d, Model model) {
		model.addAttribute("lecreneau", cserv.GetOne(d.getId()));
		return "leCreneau";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdateRdv(@ModelAttribute("d") Creneau d, Model model) {
		cserv.Update(d);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllDemain(ModelMap model) {
		List<Creneau> lstCre =cserv.GetAll();
		model.addAttribute("listeDesCreneaux", lstCre);
		model.addAttribute("medecin", lstCre.get(0).getMedecin());
		return "creneau";
	}
	
	@RequestMapping(value="/Return", method=RequestMethod.GET)
	public String init3(HttpServletRequest request , ModelMap model) {
		long idMed  = Long.parseLong(request.getParameter("id"));		
		Medecin medecin = mserv.GetOne(idMed);
		model.addAttribute("medecin", medecin);		
		return "medecinConnecte";
	}
	

}
