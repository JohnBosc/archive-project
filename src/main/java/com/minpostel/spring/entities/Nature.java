package com.minpostel.spring.entities;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Nature implements Serializable {
	
	private int natureID;
	private String nom;
	private int anneeValid;
}
