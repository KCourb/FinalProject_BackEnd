package com.projet.clinique.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.clinique.entity.Consultation;
import com.projet.clinique.entity.Facture;
import com.projet.clinique.entity.Medecin;
import com.projet.clinique.entity.Prescription;
import com.projet.clinique.service.ConsultationService;
import com.projet.clinique.service.FactureService;

@Controller
@RequestMapping(value = "/Facture")
public class FactureController {

	@Autowired
	private FactureService fserv;
	
	@Autowired
	private ConsultationService cserv;

	public FactureService getFserv() {
		return fserv;
	}

	public void setFserv(FactureService fserv) {
		this.fserv = fserv;
	}

	@RequestMapping(value = "/init", method = RequestMethod.GET)
	public String init(@ModelAttribute("f") Facture f, HttpServletRequest req, Model model) {
		model.addAttribute("listeDesFactures", fserv.GetAll());
		Long idConsultation = Long.parseLong(req.getParameter("id"));
		model.addAttribute("laconsultation", cserv.GetOne(idConsultation));
		Medecin medecin = ((cserv.GetOne(idConsultation)).getRdv()).getMedecin();
		model.addAttribute("medecin", medecin);
		return "facture";
	}

	@RequestMapping(value = "/Ajout", method = RequestMethod.POST)
	public String AjoutFacture(@ModelAttribute("f") Facture f, Model model) {
		fserv.AjoutService(f);
		return "facture";
	}

	@RequestMapping(value = "/Supp", method = RequestMethod.POST)
	public String SupprimerFacture(@ModelAttribute("f") Facture f, Model model) {
		fserv.SuppService(f);
		return "redirect:All";
	}

	@RequestMapping(value = "/SupByID", method = RequestMethod.POST)
	public String SupFactureByID(@ModelAttribute("f") Facture f, Model model) {
		fserv.SuppByIdService(f.getIdFacture());
		return "redirect:All";
	}

	@RequestMapping(value = "/ByID", method = RequestMethod.GET)
	public String GetFactureByID(@ModelAttribute("f") Facture f, Model model) {
		model.addAttribute("lafacture", fserv.GetOne(f.getIdFacture()));
		model.addAttribute("laconsultation", (fserv.GetOne(f.getIdFacture())).getConsultation());
		return "laFacture";
	}

	@RequestMapping(value = "/Update", method = RequestMethod.POST)
	public String UpdateFacture(@ModelAttribute("f") Facture f, Model model, HttpServletRequest req) {
		Long idConsultation = Long.parseLong(req.getParameter("id"));
		model.addAttribute("laconsultation", cserv.GetOne(idConsultation));
		Medecin medecin = ((cserv.GetOne(idConsultation)).getRdv()).getMedecin();
		model.addAttribute("medecin", medecin);
		fserv.Update(f);
		if (f.getPayee() == true) {
			Consultation c = f.getConsultation();
			List<Prescription> p = c.getLstPrescription();
			String texte = p.toString();			
				try {
					File file = new File("D:\\prescription.txt"); // création du fichier
					FileOutputStream fos = new FileOutputStream(file); // ouvre un flux de sortie vers le fichier
					for (int j = 0; j < texte.length(); j++) { // parcours tout le message
						fos.write(texte.charAt(j)); // copie chaque caractère dans le flux
					}
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			
		}
		return "facture";
	}

//	@RequestMapping(value = "/All", method = RequestMethod.GET)
//	public String getAllFacture(ModelMap model , HttpServletRequest req) {
//		model.addAttribute("listeDesFactures", fserv.GetAll());
//		Long idConsultation = Long.parseLong(req.getParameter("idConsultation"));
//		model.addAttribute("consultation", cserv.GetOne(idConsultation));
//		return "facture";
//	}

	@RequestMapping(value = "/Txt", method = RequestMethod.GET)
	public String Exporttxt(@ModelAttribute("f") Facture f, Model model, HttpServletRequest req) {
//		Long idConsultation = Long.parseLong(req.getParameter("id"));
//		model.addAttribute("laconsultation", cserv.GetOne(idConsultation));
//		Medecin medecin = ((cserv.GetOne(idConsultation)).getRdv()).getMedecin();
//		model.addAttribute("medecin", medecin);
		String texte = fserv.GetOne(f.getIdFacture()).toString();
		try {
			File file = new File("D:\\facture.txt"); // création du fichier
			FileOutputStream fos = new FileOutputStream(file); // ouvre un flux de sortie vers le fichier
			for (int i = 0; i < texte.length(); i++) { // parcours tout le message
				fos.write(texte.charAt(i)); // copie chaque caractère dans le flux
			}
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "Menu";
	}
	
	

}
