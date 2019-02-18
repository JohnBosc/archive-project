package com.minpostel.spring.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Dossier implements Serializable {
	
	private int dossierID;
	private String nom;
}
