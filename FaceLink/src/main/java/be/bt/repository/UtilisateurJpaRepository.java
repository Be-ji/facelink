package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import be.bt.entity.Utilisateur;

@Repository
public interface UtilisateurJpaRepository extends JpaRepository<Utilisateur, Long> {
	
//	@Query("SELECT AVG (popularite) FROM utilisateur")	
//	public double populariteMoyenne();
	
}
