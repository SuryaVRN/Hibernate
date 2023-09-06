package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Appointment {
	//	ID,DATE,TIME,DOCTOR ID,PERSON ID,TYPE OF APPOINTMENT;
	@Id
	private int id;
	private String date;
	private String time;
	private String typeOfAppointment;
	
	
	@OneToOne(fetch=FetchType.LAZY)
	private Person person;

	public Appointment(Patient patient) {
		super();
		this.patient = patient;
	}

	public Appointment(int id) {
		super();
		this.id = id;
	}

	@OneToOne(fetch=FetchType.LAZY)
	private Doctor doctor;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	private Patient patient;
	public Appointment(int id, String date, String time, String typeOfAppointment, Person person, Doctor doctor) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.typeOfAppointment = typeOfAppointment;
		this.person = person;
		this.doctor = doctor;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTypeOfAppointment() {
		return typeOfAppointment;
	}

	public void setTypeOfAppointment(String typeOfAppointment) {
		this.typeOfAppointment = typeOfAppointment;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	
}
