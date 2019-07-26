package com.minpostel.mvc.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "profil")
public class Profile implements Serializable {

	@Id
	@GeneratedValue
	private Long profileID;

	private String nom;

	@OneToMany(mappedBy = "profile")
	private List<Utilisateur> utilisateurList;


	public Long getProfileID() {
		return profileID;
	}

	public void setProfileID(Long profileID) {
		this.profileID = profileID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Utilisateur> getUtilisateurList() {
		return utilisateurList;
	}

	public void setUtilisateurList(List<Utilisateur> utilisateurList) {
		this.utilisateurList = utilisateurList;
	}
}
