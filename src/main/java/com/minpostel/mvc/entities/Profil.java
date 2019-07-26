package com.minpostel.mvc.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profil")
public class Profil implements Serializable {

	@Id
	@GeneratedValue
	private Long profilID;

	private String nom;


	public Long getProfilID() {
		return profilID;
	}

	public void setProfilID(Long profilID) {
		this.profilID = profilID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
