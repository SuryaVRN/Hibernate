package com.project.service;

import com.project.entity.Appointment;
import com.project.entity.Doctor;
import com.project.entity.MedicalRecords;
import com.project.entity.Patient;
import com.project.entity.Person;

public interface HospitalService {
	public int createPerson(Person person);
	public int createDoctor(Doctor doctor);
	public int createAppointment(Appointment appointment);
	public int createPatient(Patient patient) ;
	public int updateAppointment(Patient patient,int id);
	public int createMedicalRecord(MedicalRecords medicalRecord) ;
	public MedicalRecords getMedicalRecord(int id) ;
	public Appointment getAppointment(int id) ;
	public Person getPerson(int id) ;
	public Doctor getDoctor(int id) ;


	

}
