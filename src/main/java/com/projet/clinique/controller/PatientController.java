package com.projet.clinique.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projet.clinique.entity.Patient;
import com.projet.clinique.entity.Roles;
import com.projet.clinique.entity.Users;
import com.projet.clinique.service.PatientService;
import com.projet.clinique.service.RoleService;
import com.projet.clinique.service.UserService;

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
	
	@Autowired
	private RoleService rserv;
	
	
	
	

	public RoleService getRserv() {
		return rserv;
	}

	public void setRserv(RoleService rserv) {
		this.rserv = rserv;
	}
	@Autowired
	private UserService userv;
	
	
	
	
	
	public UserService getUserv() {
		return userv;
	}

	public void setUserv(UserService userv) {
		this.userv = userv;
	}

	@RequestMapping(value="", method=RequestMethod.GET)
	public String init(ModelMap model) {
		String password = null;
		model.addAttribute("password" , password );
		return "portailPatient";
	}
	
	@RequestMapping(value="/Login", method=RequestMethod.POST)
	public String init(@ModelAttribute("password") String password , Model model) {
		int numsecu = Integer.parseInt(password);
		
		Patient patient = pserv.GetByNumSecu(numsecu);
		model.addAttribute("patient", patient);		
		return "patientConnecte";
	}
	
	
	
	

	
//	@RequestMapping(value="", method=RequestMethod.POST)
//	public ModelAndView qerhdfhgfswdfnc(@ModelAttribute("idPat") Long idPat, Model model) {
//		
//		model.addAttribute("idPat"  , idPat );
//		
//		return new ModelAndView("http://localhost:1010/Patient/Portail?id="+idPat);
//	}
	
	
	
	
	@RequestMapping(value="/Portail", method=RequestMethod.GET)
	public String AjoutPatient(HttpServletRequest request, Model model) {
		long idUser  = Long.parseLong(request.getParameter("id"));
		Patient pat = pserv.GetOne((long) idUser/2);
		model.addAttribute("patient" , pat);		
		return "patientConnecte";
	}
	
	@RequestMapping(value="/Inscription", method=RequestMethod.GET)
	public String AjoutPatient(ModelMap model) {
		Users u = new Users();
		Patient patient = new Patient();
		model.addAttribute("user" , u);
		model.addAttribute("patient" , patient);
//		String username = null;
//		String password = null;
//		model.addAttribute("username" , username);
//		model.addAttribute("password" , password);
		return "patientInscription";
	}
	
	@RequestMapping(value="/PostInscription", method=RequestMethod.POST)
	public String Inscription(@ModelAttribute("patient") Patient patient ,Model model
		 ) {
		
		long idPat = pserv.GetNewPatId();
		patient.setIdPatient(idPat);
		
		Roles role = rserv.GetOne(2L);

		
		Users user = new Users(2*idPat + 1 , patient.getNomPatient() + patient.getPrenomPatient() , "{noop}"+ patient.getNumSecu(), true , role);
		userv.AjoutService(user);
		patient.setUser(user);		
		pserv.AjoutService(patient);
				
		return "redirect:/Patient";
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
