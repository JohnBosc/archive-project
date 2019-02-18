package com.minpostel.spring.entities;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Type implements Serializable {
	
	private int typeID;
	private String nom;
}
