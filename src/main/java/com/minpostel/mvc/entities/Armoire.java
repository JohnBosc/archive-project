package com.minpostel.mvc.entities;
import java.util.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "armoire")
public class Armoire implements Serializable {

	@Id
	@GeneratedValue
	private Long armID;

	private Date dateCreation;
	private String description;
	private String nom;
	private String photo;

	public Long getArmID() {
		return armID;
	}

	public void setArmID(Long armID) {
		this.armID = armID;
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

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
