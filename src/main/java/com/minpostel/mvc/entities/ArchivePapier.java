package com.minpostel.mvc.entities;
import javax.persistence.*;

import java.util.Date;
import java.io.Serializable;



@Entity
@Table(name = "archivePapier")
public class ArchivePapier implements Serializable {
	
	@Id
	@GeneratedValue
	private Long archivePapierID;

	private int nbrePage;
	private int nbreFeuille;
	private String objet;
	private String numSignature;
	private Date dateSignature;
	private String signature;
	private String premierNom;
	private String dernierNom;
	private String sort;
	private String motifSort;
	private String numOrdre;
	private String description;
	private String motsCles;
	private String photo;

	@ManyToOne
	@JoinColumn(name = "utilisateurID")
	private Utilisateur utilisateur;

	@ManyToOne
	@JoinColumn(name = "natureID")
	private Nature nature;

	@ManyToOne
	@JoinColumn(name = "dptID")
	private Departement departement;



	public Long getArchivePapierID() {
		return archivePapierID;
	}

	public void setArchivePapierID(Long archivePapierID) {
		this.archivePapierID = archivePapierID;
	}

	public int getNbrePage() {
		return nbrePage;
	}

	public void setNbrePage(int nbrePage) {
		this.nbrePage = nbrePage;
	}

	public int getNbreFeuille() {
		return nbreFeuille;
	}

	public void setNbreFeuille(int nbreFeuille) {
		this.nbreFeuille = nbreFeuille;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getNumSignature() {
		return numSignature;
	}

	public void setNumSignature(String numSignature) {
		this.numSignature = numSignature;
	}

	public Date getDateSignature() {
		return dateSignature;
	}

	public void setDateSignature(Date dateSignature) {
		this.dateSignature = dateSignature;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getPremierNom() {
		return premierNom;
	}

	public void setPremierNom(String premierNom) {
		this.premierNom = premierNom;
	}

	public String getDernierNom() {
		return dernierNom;
	}

	public void setDernierNom(String dernierNom) {
		this.dernierNom = dernierNom;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getMotifSort() {
		return motifSort;
	}

	public void setMotifSort(String motifSort) {
		this.motifSort = motifSort;
	}

	public String getNumOrdre() {
		return numOrdre;
	}

	public void setNumOrdre(String numOrdre) {
		this.numOrdre = numOrdre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMotsCles() {
		return motsCles;
	}

	public void setMotsCles(String motsCles) {
		this.motsCles = motsCles;
	}

	public String getPhoto() {
		return photo;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Nature getNature() {
		return nature;
	}

	public void setNature(Nature nature) {
		this.nature = nature;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
