package com.projet.clinique.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.clinique.entity.Consultation;
import com.projet.clinique.service.ConsultationService;



@CrossOrigin
@RequestMapping(value="/ConsultationREST")
@RestController

public class RESTControllerConsultation {
	
	
	@Autowired
	private ConsultationService srv;
@RequestMapping(value="/ajout", method= RequestMethod.POST)
public void ajout(@RequestBody Consultation obj) {
	
	srv.AjoutService(obj);
	
	
	
}




@RequestMapping(value="/suppression", method= RequestMethod.POST)
public void suppr(@RequestBody Consultation obj) {
	
	srv.SuppService(obj);
	
	
	
	
	
}

@RequestMapping(value="/recherche", method= RequestMethod.POST)
public ResponseEntity<Object> getById(@RequestBody Consultation obj) {
	
	Optional<Consultation> oui = srv.FindByIdService(obj.getIdConsultation());
	
//	if(!oui.isPresent()) {
//		
//		String erreur = "je trouve pas ";
//		
//	}
//	else {
//		Client non =  oui.get();
//		
//	}
	
	
	
	
	return new ResponseEntity<> (oui, HttpStatus.OK);
}



@RequestMapping(value="/affichage", method = RequestMethod.GET)
public ResponseEntity<Object> getAll() {
	
	
	
	
	return new ResponseEntity<> (srv.GetAll(), HttpStatus.OK);
	
	
}


}
