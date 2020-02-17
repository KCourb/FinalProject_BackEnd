package com.adaming.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Departement;
import com.projet.clinique.service.DepartementService;

@Controller
@RequestMapping(value = "/Departement")
public class DepartementController {
	
	@Autowired
	private DepartementService dserv;

	public DepartementService getDserv() {
		return dserv;
	}

	public void setDserv(DepartementService dserv) {
		this.dserv = dserv;
	}
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init(@ModelAttribute("d") Departement d) {
		d = new Departement();
		return "departement";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutDepartement(@ModelAttribute("d") Departement d, Model model) {
		dserv.AjoutService(d);
		return "redirect:All";
	}
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerDepartement(@ModelAttribute("d") Departement d, Model model) {
		dserv.SuppService(d);
		return "redirect:All";
	}
	
	@RequestMapping(value="/SupByID", method=RequestMethod.POST)
	public String SupDepartementByID(@ModelAttribute("d") Departement d, Model model) {
		dserv.SuppByIdService(d.getIdDepartement());
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetDepartementByID(@ModelAttribute("d") Departement d, Model model) {
		model.addAttribute("ledepartement", dserv.GetOne(d.getIdDepartement()));
		return "leDepartement";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdateDepartement(@ModelAttribute("d") Departement d, Model model) {
		dserv.Update(d);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllDepartement(ModelMap model) {
		model.addAttribute("listeDesDepartements", dserv.GetAll());
		return "departement";
	}

}
