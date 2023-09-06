package com.project.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Doctor {
	@Id
	private int id;
	private String specialization;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Person person;
	
	
	
	@OneToMany(mappedBy="doctor",fetch=FetchType.LAZY)
	private Set<MedicalRecords> medicalRecords;
	
	public Doctor(int id) {
		super();
		this.id = id;
	}


	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(int id, String specialization, Person person) {
		super();
		this.id = id;
		this.specialization = specialization;
		this.person = person;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public Set<MedicalRecords> getMedicalRecords() {
		return medicalRecords;
	}


	public void setMedicalRecords(Set<MedicalRecords> medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

}
