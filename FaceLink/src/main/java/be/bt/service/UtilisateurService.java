package be.bt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.entity.Utilisateur;
import be.bt.repository.UtilisateurJpaRepository;

@Service
public class UtilisateurService {
	
	@Autowired
	private UtilisateurJpaRepository repository;
	
	
	public List<Utilisateur> trouverTousLesUtilisateurs() {
		return repository.findAll();
	}
	
	public Utilisateur trouverUtilisateur(long idUtilisateur) {
			return repository.findOne(idUtilisateur);
	}
	
	public void supprimerUtilisateur(long idUtilisateur) {
		repository.delete(idUtilisateur);
	}
	
	public void actualiserUtilisateur(Utilisateur utilisateur) {
		repository.save(utilisateur);
	}
	
	public void ajouterUtilisateur (Utilisateur utilisateur) {
		repository.save(utilisateur);
	}
	
	public int emailExistant(String email) {
		return repository.countEmail(email);
	}
}
