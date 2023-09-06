package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MedicalRecords {
	@Id
	private int id;
	private String prescription;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Doctor doctor;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Patient patient ;


	public MedicalRecords(int id, String prescription, Doctor doctor, Patient patient) {
		super();
		this.id = id;
		this.prescription = prescription;
		this.doctor = doctor;
		this.patient = patient;
	}


	public MedicalRecords() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrescription() {
		return prescription;
	}


	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
}



