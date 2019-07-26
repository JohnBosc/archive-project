package com.minpostel.mvc.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nature")
public class Nature implements Serializable {

	@Id
	@GeneratedValue
	private Long natureID;

	private String nom;
	private int anneeValid;


	public Long getNatureID() {
		return natureID;
	}

	public void setNatureID(Long natureID) {
		this.natureID = natureID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnneeValid() {
		return anneeValid;
	}

	public void setAnneeValid(int anneeValid) {
		this.anneeValid = anneeValid;
	}
}
