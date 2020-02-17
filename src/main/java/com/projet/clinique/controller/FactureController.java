package com.projet.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Facture;
import com.projet.clinique.service.FactureService;

@Controller
@RequestMapping(value="/Facture")
public class FactureController {
	
	@Autowired
	private FactureService fserv;

	public FactureService getFserv() {
		return fserv;
	}

	public void setFserv(FactureService fserv) {
		this.fserv = fserv;
	}
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init(@ModelAttribute("f") Facture f) {
		f = new Facture();
		return "facture";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutFacture(@ModelAttribute("f") Facture f, Model model) {
		fserv.AjoutService(f);
		return "redirect:All";
	}
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerFacture(@ModelAttribute("f") Facture f, Model model) {
		fserv.SuppService(f);
		return "redirect:All";
	}
	
	@RequestMapping(value="/SupByID", method=RequestMethod.POST)
	public String SupFactureByID(@ModelAttribute("f") Facture f, Model model) {
		fserv.SuppByIdService(f.getIdFacture());
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetFactureByID(@ModelAttribute("f") Facture f, Model model) {
		model.addAttribute("lafacture", fserv.GetOne(f.getIdFacture()));
		return "laFacture";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdateFacture(@ModelAttribute("f") Facture f, Model model) {
		fserv.Update(f);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllFacture(ModelMap model) {
		model.addAttribute("listeDesFactures", fserv.GetAll());
		return "facture";
	}
	

}
