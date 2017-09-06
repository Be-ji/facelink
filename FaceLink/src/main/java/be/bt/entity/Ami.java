package be.bt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ami {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
    @ManyToOne
	private Utilisateur utilisateur;

	private long idAmi;
	private Date dateAmitie;
	
	public Ami() {
		super();
	}

	public Ami(long id, Utilisateur utilisateur, long idAmi, Date dateAmitie) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.idAmi = idAmi;
		this.dateAmitie = dateAmitie;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public long getIdAmi() {
		return idAmi;
	}

	public void setIdAmi(long idAmi) {
		this.idAmi = idAmi;
	}

	public Date getDateAmitie() {
		return dateAmitie;
	}

	public void setDateAmitie(Date dateAmitie) {
		this.dateAmitie = dateAmitie;
	}

	@Override
	public String toString() {
		return "Ami [id=" + id + ", utilisateur=" + utilisateur + ", idAmi=" + idAmi + ", dateAmitie=" + dateAmitie
				+ "]";
	}
	
}
