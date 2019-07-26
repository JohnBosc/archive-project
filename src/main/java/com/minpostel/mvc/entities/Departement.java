package com.minpostel.mvc.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "departement")
public class Departement implements Serializable {

	@Id
	@GeneratedValue
	private Long dptID;

	private String nom;

	@OneToMany(mappedBy = "departement")
	private List<ArchivePapier> archivePapierList;

	public Long getDptID() {
		return dptID;
	}

	public void setDptID(Long dptID) {
		this.dptID = dptID;
	}

	public String getNom() {
		return nom;
	}

	public void setNo(String no) {
		this.nom = nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<ArchivePapier> getArchivePapierList() {
		return archivePapierList;
	}

	public void setArchivePapierList(List<ArchivePapier> archivePapierList) {
		this.archivePapierList = archivePapierList;
	}
}
