package com.projet.clinique.controller;

import java.util.ArrayList;
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
import com.projet.clinique.entity.Departement;
import com.projet.clinique.entity.Medecin;
import com.projet.clinique.entity.Patient;
import com.projet.clinique.entity.Rdv;
import com.projet.clinique.service.CreneauService;
import com.projet.clinique.service.DepartementService;
import com.projet.clinique.service.MedecinService;
import com.projet.clinique.service.PatientService;
import com.projet.clinique.service.RdvService;

@Controller
@RequestMapping(value="/Rdv")
public class RdvController {
	
	@Autowired
	private RdvService rserv;
	
	@Autowired
	private DepartementService dserv;
	
	@Autowired
	private MedecinService mserv;
	
	@Autowired
	private CreneauService cserv;
	
	@Autowired
	private PatientService pserv;
	
	Patient patTransversal = new Patient();
	
	

	public RdvService getRserv() {
		return rserv;
	}

	public void setRserv(RdvService rserv) {
		this.rserv = rserv;
	}
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
	public String init(@ModelAttribute("r") Rdv r , 
			HttpServletRequest request , ModelMap model) {
		Long idPatient  = Long.parseLong(request.getParameter("id"));
		model.addAttribute("patient", pserv.GetOne(idPatient));
	    patTransversal = pserv.GetOne(idPatient);
	    model.addAttribute("lstdep", dserv.GetAll());
		return "rdvDep";
	}
	
	@RequestMapping(value="/Ajout", method=RequestMethod.POST)
	public String AjoutRdv(@ModelAttribute("r") Rdv r, @ModelAttribute("patient") Patient patient , Model model) {
		r.setPatient(patient);
		
		rserv.AjoutService(r);
		Long idD = r.getCreneau().getId();
		Creneau c = cserv.GetOne(idD);
		String cre = c.getHoraire();
		Medecin m = c.getMedecin();		
		c.setHoraire(cre);
		c.setMedecin(m);
		c.setReserve(true);
		cserv.Update(c);
		model.addAttribute("lerdv", rserv.GetOne(r.getIdRdv()));
		return "leRdv";
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
		return "rdvCreneau";
	}
	
//	@RequestMapping(value="/AllDep", method=RequestMethod.GET)
//	public String GetAllDepartement(ModelMap model) {
//		model.addAttribute("lstdep", dserv.GetAll());
//		
//		return "rdvDep";
//	}
	
	
	@RequestMapping(value="/SelectDep", method=RequestMethod.POST)
public String SelectDep(@ModelAttribute("d") Departement d, HttpServletRequest request ,   ModelMap model ) {
		Long idPatient  = Long.parseLong(request.getParameter("idPat"));
		Patient patient = pserv.GetOne(idPatient);
	model.addAttribute("ledep", dserv.GetOne(d.getIdDepartement()));
	model.addAttribute("patient", patient);
	return "rdvMed";
}
	
	@RequestMapping(value="/SelectMed", method=RequestMethod.POST)
	public String SelectMed(@ModelAttribute("m") Medecin m,  @ModelAttribute("patient") Patient patient , ModelMap model, ModelMap modelmap ) {
		Medecin lemed = mserv.GetOne(m.getIdMedecin());
		model.addAttribute("lemed", lemed);
		List<Creneau> lstdemain = lemed.getLstdemain();
		List<Creneau> lstdispo = new ArrayList<Creneau>();
		for (int i=0; i<lstdemain.size(); i++) {
			if (lstdemain.get(i).isReserve() == false) {
				lstdispo.add(lstdemain.get(i));
			}
		}
		modelmap.addAttribute("lstdispo", lstdispo);
		model.addAttribute("patient", patient);
		return "rdvCreneau";
	}
	

	
	
	


}
