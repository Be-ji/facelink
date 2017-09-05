package be.bt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Experience {
	@Id
	@Column(name="id")
	private long id;
	private Date dateDebut;
	private Date dateFin;
	private String titre;
	private String description;
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	public Experience() {
		super();
	}

	public Experience(long id, Date dateDebut, Date dateFin, String titre, String description) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.titre = titre;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Experience [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", titre=" + titre
				+ ", description=" + description + "]";
	}
	
}
