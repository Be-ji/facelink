package be.bt.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	
	@Id
	@Column(name="id")
	private long id;
	private String prenom;
	private String nom;
	private String motDePasse;
	private int droit;
	private String email;
	private String statut;
	private String biographie;
	private long popularite;
	private Date dateInscription;
	private Date dateNaissance;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Ami> amis;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Experience> experiences;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Message> messages;
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(long id, String prenom, String nom, String motDePasse, int droit, String email, String statut,
			String biographie, long popularite, Date dateInscription, Date dateNaissance) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.motDePasse = motDePasse;
		this.droit = droit;
		this.email = email;
		this.statut = statut;
		this.biographie = biographie;
		this.popularite = popularite;
		this.dateInscription = dateInscription;
		this.dateNaissance = dateNaissance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getDroit() {
		return droit;
	}

	public void setDroit(int droit) {
		this.droit = droit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getBiographie() {
		return biographie;
	}

	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}

	public long getPopularite() {
		return popularite;
	}

	public void setPopularite(long popularite) {
		this.popularite = popularite;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", motDePasse=" + motDePasse
				+ ", droit=" + droit + ", email=" + email + ", statut=" + statut + ", biographie=" + biographie
				+ ", popularite=" + popularite + ", dateInscription=" + dateInscription + ", dateNaissance="
				+ dateNaissance + "]";
	}
	
}
