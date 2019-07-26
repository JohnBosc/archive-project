package com.minpostel.mvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "dossier")
public class Dossier implements Serializable {

	@Id
	@GeneratedValue
	private Long dossierID;

	private String nom;

	public Long getDossierID() {
		return dossierID;
	}

	public void setDossierID(Long dossierID) {
		this.dossierID = dossierID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
