package com.projet.clinique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	@RequestMapping(value="/login")
	public String getLogin() {
		return"login";
	}
	
	@RequestMapping(value="/erreur")
	public String aux() {
		return "erreur";
	}

}
