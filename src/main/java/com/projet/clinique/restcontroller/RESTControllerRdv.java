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

import com.projet.clinique.entity.Rdv;
import com.projet.clinique.service.RdvService;


@CrossOrigin
@RequestMapping(value="/RdvREST")
@RestController
public class RESTControllerRdv {
	
	@Autowired
	private RdvService srv;
	
@RequestMapping(value="/ajout", method= RequestMethod.POST)
public void ajout(@RequestBody Rdv obj) {
	
	srv.AjoutService(obj);
	
	
	
}




@RequestMapping(value="/suppression", method= RequestMethod.POST)
public void suppr(@RequestBody Rdv obj) {
	
	srv.SuppService(obj);
	
	
	
	
	
}

@RequestMapping(value="/recherche", method=RequestMethod.POST)
public ResponseEntity<Object> getById(@RequestBody Rdv obj) {
	
	Optional<Rdv> oui = srv.FindByIdService(obj.getIdRdv());
	

	
	
	
	
	return new ResponseEntity<> (oui, HttpStatus.OK);
}



@RequestMapping(value="/affichage", method = RequestMethod.GET)
public ResponseEntity<Object> getAll() {
	
	
	
	
	return new ResponseEntity<> (srv.GetAll(), HttpStatus.OK);
	
	
}

}
