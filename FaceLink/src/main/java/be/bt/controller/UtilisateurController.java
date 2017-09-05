package be.bt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import be.bt.service.UtilisateurService;

@Controller
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService service;
	
	public String index(Model model) {
		
		model.addAttribute("utilisateur", service.tousLesUtilisateurs());
		
		return  "index";
	}
}
