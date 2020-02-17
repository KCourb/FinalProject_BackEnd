package com.projet.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Prescription;
import com.projet.clinique.service.PrescriptionService;

@Controller
@RequestMapping(value="/Prescription")
public class PrescriptionController {
	
	@Autowired
	private PrescriptionService pserv;

	public PrescriptionService getPserv() {
		return pserv;
	}

	public void setPserv(PrescriptionService pserv) {
		this.pserv = pserv;
	}
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init(@ModelAttribute("p") Prescription p) {
		p = new Prescription();
		return "prescription";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutPrescription(@ModelAttribute("p") Prescription p, Model model) {
		pserv.AjoutService(p);
		return "redirect:All";
	}
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerPrescription(@ModelAttribute("p") Prescription p, Model model) {
		pserv.SuppService(p);
		return "redirect:All";
	}
	
	@RequestMapping(value="/SupByID", method=RequestMethod.POST)
	public String SupPrescriptionByID(@ModelAttribute("p") Prescription p, Model model) {
		pserv.SuppByIdService(p.getIdPrescription());
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetPrescriptionByID(@ModelAttribute("p") Prescription p, Model model) {
		model.addAttribute("laprescription", pserv.GetOne(p.getIdPrescription()));
		return "laPrescription";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdatePrescription(@ModelAttribute("p") Prescription p, Model model) {
		pserv.Update(p);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllPrescription(ModelMap model) {
		model.addAttribute("listeDesPrescriptions", pserv.GetAll());
		return "prescription";
	}

}
