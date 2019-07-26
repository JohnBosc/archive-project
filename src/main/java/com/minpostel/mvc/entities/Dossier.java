package com.minpostel.mvc.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "dossier")
public class Dossier implements Serializable {

	@Id
	@GeneratedValue
	private Long dossierID;

	private String nom;

	@ManyToOne
	@JoinColumn(name = "boiteID")
	private Boite boite;

	@ManyToOne
	@JoinColumn(name = "utilisateurID")
	private Utilisateur utilisateur;

	@ManyToMany
	@JoinTable(
			name = "Dossier_ArchivePapier",
			joinColumns = {@JoinColumn(name = "Dossier_dossierID", referencedColumnName = "dossierID")},
			inverseJoinColumns = {@JoinColumn(name = "ArchivePapier_archivePapierID", referencedColumnName = "archivePapierID")}
	)
	private Collection<ArchivePapier> archivePapierCollection;



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

	public Boite getBoite() {
		return boite;
	}

	public void setBoite(Boite boite) {
		this.boite = boite;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Collection<ArchivePapier> getArchivePapierCollection() {
		return archivePapierCollection;
	}

	public void setArchivePapierCollection(Collection<ArchivePapier> archivePapierCollection) {
		this.archivePapierCollection = archivePapierCollection;
	}
}
