package com.projet.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Creneau;
import com.projet.clinique.service.CreneauService;

@Controller
@RequestMapping(value="/Creneau")
public class CreneauController {
	
	@Autowired
	private CreneauService dserv;

	public CreneauService getDserv() {
		return dserv;
	}

	public void setDserv(CreneauService dserv) {
		this.dserv = dserv;
	}
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init(@ModelAttribute("d") Creneau d) {	
		return "creneau";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutDemain(@ModelAttribute("d") Creneau d, Model model) {
		dserv.AjoutService(d);
		return "redirect:All";
	}
	
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerDemain(@ModelAttribute("d") Creneau d, Model model) {
		dserv.SuppService(d);
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetDemainByID(@ModelAttribute("d") Creneau d, Model model) {
		model.addAttribute("lecreneau", dserv.GetOne(d.getId()));
		return "leCreneau";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdateRdv(@ModelAttribute("d") Creneau d, Model model) {
		dserv.Update(d);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllDemain(ModelMap model) {
		model.addAttribute("listeDesCreneaux", dserv.GetAll());
		return "creneau";
	}

}
