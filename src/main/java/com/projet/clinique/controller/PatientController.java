package com.projet.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Patient;
import com.projet.clinique.service.PatientService;

@Controller
@RequestMapping(value="/Patient")
public class PatientController {
	
	@Autowired
	private PatientService pserv;

	public PatientService getPserv() {
		return pserv;
	}

	public void setPserv(PatientService pserv) {
		this.pserv = pserv;
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String init(ModelMap model) {
		Patient p = new Patient();
		model.addAttribute("pat" , p);
		return "patient";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutPatient(@ModelAttribute("p") Patient p, Model model) {
		pserv.AjoutService(p);
		return "redirect:All";
	}
	
	@RequestMapping(value="/Supp", method=RequestMethod.POST)
	public String SupprimerPatient(@ModelAttribute("p") Patient p, Model model) {
		pserv.SuppService(p);
		return "redirect:All";
	}
	
	@RequestMapping(value="/SupByID", method=RequestMethod.POST)
	public String SupPatientByID(@ModelAttribute("p") Patient p, Model model) {
		pserv.SuppByIdService(p.getIdPatient());
		return "redirect:All";
	}
	
	@RequestMapping(value="/ByID", method=RequestMethod.GET)
	public String GetPatientByID(@ModelAttribute("p") Patient p, Model model) {
		model.addAttribute("lepatient", pserv.GetOne(p.getIdPatient()));
		return "lePatient";
	}
	
	@RequestMapping(value="/Update", method=RequestMethod.POST)
	public String UpdatePatient(@ModelAttribute("p") Patient p, Model model) {
		pserv.Update(p);
		return "redirect:All";
	}
	
	@RequestMapping(value="/All", method=RequestMethod.GET)
	public String getAllPatient(ModelMap model) {
		model.addAttribute("listeDesPatients", pserv.GetAll());
		return "patient";
	}

}
