package com.minpostel.mvc.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "nature")
public class Nature implements Serializable {

	@Id
	@GeneratedValue
	private Long natureID;

	private String nom;
	private int anneeValid;

	@OneToMany(mappedBy = "nature")
	private List<ArchivePapier> archivePapierList;

	@ManyToOne
	@JoinColumn(name = "utilisateurID")
	private Utilisateur utilisateur;

	@ManyToOne
	@JoinColumn(name = "typeID")
	private Type type;


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

	public List<ArchivePapier> getArchivePapierList() {
		return archivePapierList;
	}

	public void setArchivePapierList(List<ArchivePapier> archivePapierList) {
		this.archivePapierList = archivePapierList;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
