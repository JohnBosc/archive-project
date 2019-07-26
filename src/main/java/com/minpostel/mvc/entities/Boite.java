package com.minpostel.mvc.entities;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "boite")
public class Boite implements Serializable {

	@Id
	@GeneratedValue
	private Long boiteID;

	private String nom;
	private String description;
	private String photo;

	@ManyToOne
	@JoinColumn(name = "armoireID")
	private Armoire armoire;

	@ManyToOne
	@JoinColumn(name = "utilisateurID")
	private Utilisateur utilisateur;

	@OneToMany(mappedBy = "boite")
	private List<Dossier> dossierList;


	public Long getBoiteID() {
		return boiteID;
	}

	public void setBoiteID(Long boiteID) {
		this.boiteID = boiteID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public Armoire getArmoire() {
		return armoire;
	}

	public void setArmoire(Armoire armoire) {
		this.armoire = armoire;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Dossier> getDossierList() {
		return dossierList;
	}

	public void setDossierList(List<Dossier> dossierList) {
		this.dossierList = dossierList;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
