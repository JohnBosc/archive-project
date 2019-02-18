package com.minpostel.spring.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;
import java.io.Serializable;



@Entity
public class ArchivePapier implements Serializable {
	
	@Id
	@GeneratedValue
	private int archID;
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

}
