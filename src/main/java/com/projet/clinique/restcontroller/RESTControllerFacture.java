package com.projet.clinique.restcontroller;

import java.util.List;
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
import com.projet.clinique.entity.Departement;
import com.projet.clinique.entity.Facture;
import com.projet.clinique.entity.Medecin;
import com.projet.clinique.service.FactureService;

@CrossOrigin
@RequestMapping(value="/FactureREST")
@RestController

public class RESTControllerFacture {

	
	@Autowired
	private FactureService srv;
@RequestMapping(value="/ajout", method= RequestMethod.POST)
public void ajout(@RequestBody Facture obj) {
	
	srv.AjoutService(obj);
	
	
	
}




@RequestMapping(value="/suppression", method= RequestMethod.POST)
public void suppr(@RequestBody Facture obj) {
	
	srv.SuppService(obj);
	
	
	
	
	
}

@RequestMapping(value="/recherche", method=RequestMethod.POST)
public ResponseEntity<Object> getById(@RequestBody Facture obj) {
	
	Optional<Facture> oui = srv.FindByIdService(obj.getIdFacture());
	

	
	
	
	
	return new ResponseEntity<> (oui, HttpStatus.OK);
}



@RequestMapping(value="/affichage", method = RequestMethod.GET)
public ResponseEntity<Object> getAll() {
	
	
	
	
	return new ResponseEntity<> (srv.GetAll(), HttpStatus.OK);
	
	
}

@RequestMapping(value="/recherchefk", method=RequestMethod.POST)
public ResponseEntity<Object> getAllByfkDept(@RequestBody Consultation obj) {
	
	Facture oui = srv.getAllByFkDept(obj.getIdConsultation());
	
	

	
	
	
	
	return new ResponseEntity<> (oui, HttpStatus.OK);
}

@RequestMapping(value="/update", method=RequestMethod.POST)
public ResponseEntity<Object> update(@RequestBody Facture obj) {
	
	 Facture oui = srv.Update(obj);
	
	

	
	
	
	
	return new ResponseEntity<> (oui, HttpStatus.OK);
}

}
