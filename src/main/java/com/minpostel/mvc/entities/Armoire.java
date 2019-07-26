package com.minpostel.mvc.entities;
import java.util.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "armoire")
public class Armoire implements Serializable {

	@Id
	@GeneratedValue
	private Long armoireID;

	private Date dateCreation;
	private String description;
	private String nom;
	private String photo;

	@OneToMany(mappedBy = "armoire")
	private List<Boite> boiteList;

	@ManyToOne
	@JoinColumn(name = "utilisateurID")
	private Utilisateur utilisateur;

	public Long getArmoireID() {
		return armoireID;
	}

	public void setArmID(Long armID) {
		this.armoireID = armoireID;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPhoto() {
		return photo;
	}

	public void setArmoireID(Long armoireID) {
		this.armoireID = armoireID;
	}

	public List<Boite> getBoiteList() {
		return boiteList;
	}

	public void setBoiteList(List<Boite> boiteList) {
		this.boiteList = boiteList;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
