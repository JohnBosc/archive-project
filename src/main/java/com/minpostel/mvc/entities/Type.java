package com.minpostel.mvc.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "type")
public class Type implements Serializable {

	@Id
	@GeneratedValue
	private Long typeID;

	private String nom;

	@OneToMany(mappedBy = "type")
	private List<Nature> natureList;

	@ManyToOne
	@JoinColumn(name = "utilisateurID")
	private Utilisateur utilisateur;


	public Long getTypeID() {
		return typeID;
	}

	public void setTypeID(Long typeID) {
		this.typeID = typeID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Nature> getNatureList() {
		return natureList;
	}

	public void setNatureList(List<Nature> natureList) {
		this.natureList = natureList;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}
