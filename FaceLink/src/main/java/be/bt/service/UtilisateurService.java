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
	
	
	public List<Utilisateur> tousLesUtilisateurs() {
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
	
}
