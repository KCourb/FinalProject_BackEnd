package com.adaming.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Consultation;
import com.projet.clinique.service.ConsultationService;

@Controller
@RequestMapping(value="/Consultation")
public class ConsultationController {
	
	@Autowired
	private ConsultationService cserv;

	public ConsultationService getCserv() {
		return cserv;
	}

	public void setCserv(ConsultationService cserv) {
		this.cserv = cserv;
	}
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init(@ModelAttribute("co") Consultation co) {
		co = new Consultation();
		return "consultation";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutConsultation(@ModelAttribute("co") Consultation co, Model model) {
		cserv.AjoutService(co);
		return "redirect:All";
	}
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerConsultation(@ModelAttribute("co") Consultation co, Model model) {
		cserv.SuppService(co);
		return "redirect:All";
	}
	
	@RequestMapping(value="/SupByID", method=RequestMethod.POST)
	public String SupConsultationByID(@ModelAttribute("co") Consultation co, Model model) {
		cserv.SuppByIdService(co.getIdConsultation());
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetConsultationByID(@ModelAttribute("co") Consultation co, Model model) {
		model.addAttribute("laconsultation", cserv.GetOne(co.getIdConsultation()));
		return "laConsultation";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdateConsultation(@ModelAttribute("co") Consultation co, Model model) {
		cserv.Update(co);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllConsultation(ModelMap model) {
		model.addAttribute("listeDesConsultations", cserv.GetAll());
		return "consultation";
	}
	
	
	
	
	

}