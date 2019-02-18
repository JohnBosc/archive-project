package com.minpostel.spring.entities;
import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Boite implements Serializable {
	
	private int boiteID;
	private String nom;
	private String description;
	private String photo;

}
