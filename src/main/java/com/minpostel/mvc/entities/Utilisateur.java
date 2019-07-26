package com.minpostel.mvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import lombok.Data;



@Entity
@Table(name = "utilisateur")
public @Data class Utilisateur implements Serializable {
	
	@Id
	@GeneratedValue
	private Long utilisateurID;

	private String nom;
	private String prenom;
	private String nomUtilisateur;
	private String motPasse;
	private String telephone;
	private String civilite;
	private String poste;
	private String adresse;
	private String email;

	@OneToMany(mappedBy = "utilisateur")
	private List<Armoire> armoireList;

	@OneToMany(mappedBy = "utilisateur")
	private List<Boite> boiteList;

	@OneToMany(mappedBy = "utilisateur")
	private List<Dossier> dossierList;

	@OneToMany(mappedBy = "utilisateur")
	private List<ArchivePapier> archivePapierList;

	@OneToMany(mappedBy = "utilisateur")
	private List<MouvementDoc> mouvementDocList;

	@OneToMany(mappedBy = "utilisateur")
	private List<Nature> natureList;

	@OneToMany(mappedBy = "utilisateur")
	private List<Type> typeList;

	@ManyToOne
	@JoinColumn(name = "profilID")
	private Profile profile;


	public Long getUtilisateurID() {
		return utilisateurID;
	}

	public void setUtilisateurID(Long utilisateurID) {
		this.utilisateurID = utilisateurID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Armoire> getArmoireList() {
		return armoireList;
	}

	public void setArmoireList(List<Armoire> armoireList) {
		this.armoireList = armoireList;
	}

	public List<Boite> getBoiteList() {
		return boiteList;
	}

	public void setBoiteList(List<Boite> boiteList) {
		this.boiteList = boiteList;
	}

	public List<Dossier> getDossierList() {
		return dossierList;
	}

	public void setDossierList(List<Dossier> dossierList) {
		this.dossierList = dossierList;
	}

	public List<ArchivePapier> getArchivePapierList() {
		return archivePapierList;
	}

	public void setArchivePapierList(List<ArchivePapier> archivePapierList) {
		this.archivePapierList = archivePapierList;
	}

	public List<MouvementDoc> getMouvementDocList() {
		return mouvementDocList;
	}

	public void setMouvementDocList(List<MouvementDoc> mouvementDocList) {
		this.mouvementDocList = mouvementDocList;
	}

	public List<Nature> getNatureList() {
		return natureList;
	}

	public void setNatureList(List<Nature> natureList) {
		this.natureList = natureList;
	}

	public List<Type> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Type> typeList) {
		this.typeList = typeList;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}
