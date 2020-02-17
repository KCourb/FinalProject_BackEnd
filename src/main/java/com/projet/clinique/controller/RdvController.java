package com.projet.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Rdv;
import com.projet.clinique.service.RdvService;

@Controller
@RequestMapping(value="/Rdv")
public class RdvController {
	
	@Autowired
	private RdvService rserv;

	public RdvService getRserv() {
		return rserv;
	}

	public void setRserv(RdvService rserv) {
		this.rserv = rserv;
	}
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init(@ModelAttribute("r") Rdv r) {
		r = new Rdv();
		return "rdv";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutRdv(@ModelAttribute("r") Rdv r, Model model) {
		rserv.AjoutService(r);
		return "redirect:All";
	}
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerRdv(@ModelAttribute("r") Rdv r, Model model) {
		rserv.SuppService(r);
		return "redirect:All";
	}
	
	@RequestMapping(value="/SupByID", method=RequestMethod.POST)
	public String SupRdvByID(@ModelAttribute("r") Rdv r, Model model) {
		rserv.SuppByIdService(r.getIdRdv());
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetRdvByID(@ModelAttribute("r") Rdv r, Model model) {
		model.addAttribute("lerdv", rserv.GetOne(r.getIdRdv()));
		return "leRdv";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdateRdv(@ModelAttribute("r") Rdv r, Model model) {
		rserv.Update(r);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllRdv(ModelMap model) {
		model.addAttribute("listeDesRdvs", rserv.GetAll());
		return "rdv";
	}


}
