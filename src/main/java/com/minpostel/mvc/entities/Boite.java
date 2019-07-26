package com.minpostel.mvc.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boite")
public class Boite implements Serializable {

	@Id
	@GeneratedValue
	private Long boiteID;

	private String nom;
	private String description;
	private String photo;

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

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
