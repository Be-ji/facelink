package be.bt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	@Id
	@Column(name="id")
	private long id;
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	private long idDestinataire;
	private String message;
	private Date dateEnvoi;
	
	public Message() {
		super();
	}

	public Message(long id, Utilisateur utilisateur, long idDestinataire, String message, Date dateEnvoi) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.idDestinataire = idDestinataire;
		this.message = message;
		this.dateEnvoi = dateEnvoi;
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

	public long getIdDestinataire() {
		return idDestinataire;
	}

	public void setIdDestinataire(long idDestinataire) {
		this.idDestinataire = idDestinataire;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", utilisateur=" + utilisateur + ", idDestinataire=" + idDestinataire
				+ ", message=" + message + ", dateEnvoi=" + dateEnvoi + "]";
	}
	
}
