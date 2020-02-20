package com.projet.clinique.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.clinique.entity.Creneau;
import com.projet.clinique.entity.Medecin;
import com.projet.clinique.service.CreneauService;

@CrossOrigin
@RequestMapping(value="/CreneauREST")
@RestController
public class RESTControllerCreneau {
	
	@Autowired
	private CreneauService srv;
@RequestMapping(value="/ajout", method= RequestMethod.POST)
public void ajout(@RequestBody Creneau obj) {
	
	srv.AjoutService(obj);
	
	
	
}




@RequestMapping(value="/suppression", method= RequestMethod.POST)
public void suppr(@RequestBody Creneau obj) {
	
	srv.SuppService(obj);
	
	
	
	
	
}


@RequestMapping(value="/affichage", method = RequestMethod.GET)
public ResponseEntity<Object> getAll() {
	
	
	
	
	return new ResponseEntity<> (srv.GetAll(), HttpStatus.OK);
	
	
}

@RequestMapping(value="/recherchefk", method=RequestMethod.POST)
public ResponseEntity<Object> getAllByfkMed(@RequestBody Medecin obj) {
	
	List<Creneau> oui = srv.getAllByFkMed(obj.getIdMedecin());
	
	

	
	
	
	
	return new ResponseEntity<> (oui, HttpStatus.OK);
}




}
