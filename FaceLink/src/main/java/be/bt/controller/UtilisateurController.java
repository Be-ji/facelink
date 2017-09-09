package be.bt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import be.bt.entity.Utilisateur;
import be.bt.service.UtilisateurService;

@RestController
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService service;
	
//	public String index(Model model) {
//
//		model.addAttribute("utilisateur", service.tousLesUtilisateurs());
//
//		return "index";
//	}
	
	@GetMapping(path="/users")
	public ResponseEntity <List <Utilisateur>> get() {
		return new ResponseEntity <>(service.trouverTousLesUtilisateurs(), HttpStatus.OK);
	}
	
	
	@GetMapping(path="/user/{id}")
	public ResponseEntity <Utilisateur> get(@PathVariable Long id) {
		return new ResponseEntity <>(service.trouverUtilisateur(id), HttpStatus.OK);
	}
	
}
