package com.minpostel.mvc.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mouvementDoc")
public class MouvementDoc implements Serializable {

	@Id
	@GeneratedValue
	private Long mvtID;

	private String nom;
	private String cni;
	private Date dateDelivrance;
	private String lieu;
	private String natureRech;
	private Date dateDebut;
	private String typeRech;


	public Long getMvtID() {
		return mvtID;
	}

	public void setMvtID(Long mvtID) {
		this.mvtID = mvtID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	public Date getDateDelivrance() {
		return dateDelivrance;
	}

	public void setDateDelivrance(Date dateDelivrance) {
		this.dateDelivrance = dateDelivrance;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getNatureRech() {
		return natureRech;
	}

	public void setNatureRech(String natureRech) {
		this.natureRech = natureRech;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getTypeRech() {
		return typeRech;
	}

	public void setTypeRech(String typeRech) {
		this.typeRech = typeRech;
	}
}
