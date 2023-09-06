package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	@Id
	private int id;
	private String Diagonsis;
	
	public Patient(int id, int i) {
		super();
		this.id = id;
		
	}
	
	public Patient(int id) {
		super();
		this.id = id;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiagonsis() {
		return Diagonsis;
	}

	public void setDiagonsis(String diagonsis) {
		Diagonsis = diagonsis;
	}

}
