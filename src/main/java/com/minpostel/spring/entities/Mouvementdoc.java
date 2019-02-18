package com.minpostel.spring.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;

@Entity
public class Mouvementdoc implements Serializable {
	
	private int mvtID;
	private String nom;
	private String cni;
	private Date dateDelivrance;
	private String lieu;
	private String natureRech;
	private Date dateDebut;
	private String typeRech;
}
