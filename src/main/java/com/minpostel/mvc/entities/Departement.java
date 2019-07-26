package com.minpostel.mvc.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "departement")
public class Departement implements Serializable {

	@Id
	@GeneratedValue
	private Long dptID;

	private String no;

	public Long getDptID() {
		return dptID;
	}

	public void setDptID(Long dptID) {
		this.dptID = dptID;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
}
