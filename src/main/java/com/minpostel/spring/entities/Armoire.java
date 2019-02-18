package com.minpostel.spring.entities;
import java.util.*;
import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Armoire implements Serializable {
	
	private int armID;
	private Date dateCreation;
	private String description;
	private String nom;
	private String photo;
}
