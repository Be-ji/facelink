package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import be.bt.entity.Utilisateur;

public interface UtilisateurJpaRepository extends JpaRepository<Utilisateur, Long> {
	
    @Query()
	int getAgeMoyen();
	
	
}
