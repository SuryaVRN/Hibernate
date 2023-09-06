package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
	@Id
	int id;
	String name;
	int age;
	String dob;
	long contact;
	String bloodGroup;
	
	
	@OneToOne(mappedBy="person",fetch=FetchType.LAZY)
	private Doctor doctor;
	
	public Person(int id) {
		super();
		this.id = id;
	}
	public Person(int id, String name, int age, String dob, long contact, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.contact = contact;
		this.bloodGroup = bloodGroup;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	

}
