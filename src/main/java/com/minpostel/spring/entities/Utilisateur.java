package com.minpostel.spring.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;



@Entity
public @Data class Utilisateur implements Serializable {
	
	@Id
	@GeneratedValue
	private Long utilID;
	private String nom;
	private String prenom;
	private String nomUtilisateur;
	private String motPasse;
	private String telephone;
	private String civilite;
	private String poste;
	private String adresse;
	private String email;
	private Profil profil;
	private List<Type> types;
	private List<ArchivePapier> archives;
	private List<Dossier> dossiers;
	private List<Armoire> armoires;
	private List<Boite> boites;
	private List<Mouvementdoc> consultations;
	
	
	
	public Long getUtilID() {
		return utilID;
	}
	public void setUtilID(Long utilID) {
		this.utilID = utilID;
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
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public List<ArchivePapier> getArchives() {
		return archives;
	}
	public void setArchives(List<ArchivePapier> archives) {
		this.archives = archives;
	}
	public List<Dossier> getDossiers() {
		return dossiers;
	}
	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}
	public List<Armoire> getArmoires() {
		return armoires;
	}
	public void setArmoires(List<Armoire> armoires) {
		this.armoires = armoires;
	}
	public List<Boite> getBoites() {
		return boites;
	}
	public void setBoites(List<Boite> boites) {
		this.boites = boites;
	}
	public List<Mouvementdoc> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Mouvementdoc> consultations) {
		this.consultations = consultations;
	}
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Utilisateur(Long utilID, String nom, String prenom, String nomUtilisateur, String motPasse, String telephone,
			String civilite, String poste, String adresse, String email, Profil profil, List<Type> types,
			List<ArchivePapier> archives, List<Dossier> dossiers, List<Armoire> armoires, List<Boite> boites,
			List<Mouvementdoc> consultations) {
		super();
		this.utilID = utilID;
		this.nom = nom;
		this.prenom = prenom;
		this.nomUtilisateur = nomUtilisateur;
		this.motPasse = motPasse;
		this.telephone = telephone;
		this.civilite = civilite;
		this.poste = poste;
		this.adresse = adresse;
		this.email = email;
		this.profil = profil;
		this.types = types;
		this.archives = archives;
		this.dossiers = dossiers;
		this.armoires = armoires;
		this.boites = boites;
		this.consultations = consultations;
	}
	
	
	
	
	
	
	
}
