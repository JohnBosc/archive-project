package com.minpostel.spring.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 * @author jMENGUE
 *
 */
@Entity
public class Departement implements Serializable {
	
	private int dptID;
	private String nom;
}
