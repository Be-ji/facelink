package be.bt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

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
	
	//@RequestMapping(path="/signup", method=RequestMethod.POST, headers="Content-Type=application/json")
	@PostMapping("signup")
	public ResponseEntity<Void> signUp(@RequestBody Utilisateur utilisateur) {

		service.ajouterUtilisateur(utilisateur);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PostMapping("signup/checkEmail")
	public ResponseEntity<Integer> checkEmail(@RequestBody String email) {
		return new ResponseEntity<>(service.emailExistant(email), HttpStatus.ACCEPTED);
	}
	
}
