package com.project.service.impl;

import com.project.entity.Appointment;
import com.project.entity.Doctor;
import com.project.entity.MedicalRecords;
import com.project.entity.Patient;
import com.project.entity.Person;
import com.project.service.HospitalService;
import com.project.dao.impl.*;
import com.project.dao.*;

public class HospitalServiceImpl implements HospitalService {
	
	HospitalDAO hospitalDAO=new HospitalDAOImpl();
	

	@Override
	public int createPerson(Person person) {
		return hospitalDAO.createPerson(person);
	}


	@Override
	public int createDoctor(Doctor doctor) {
		return hospitalDAO.createDoctor(doctor);
		 
	}


	@Override
	public int createAppointment(Appointment appointment) {
		return hospitalDAO.createAppointment(appointment);
		// TODO Auto-generated method stub
		
	}


	@Override
	public int createPatient(Patient patient) {
		hospitalDAO.createPatient(patient);
		
		return 0;
	}


	@Override
	public int updateAppointment(Patient patient, int id) {
		// TODO Auto-generated method stub
		hospitalDAO.updateAppointment(patient, id);
		
		return 0;
	}


	@Override
	public int createMedicalRecord(MedicalRecords medicalRecord) {
		hospitalDAO.createMedicalRecord(medicalRecord);
	
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public MedicalRecords getMedicalRecord(int id) {
		MedicalRecords medicalRecords=hospitalDAO.getMedicalRecord(id);
		
		return medicalRecords;
	}
	@Override
	public Appointment getAppointment(int id) {
		Appointment appointment=hospitalDAO.getAppointment(id);
		
		return appointment;
	}


	@Override
	public Person getPerson(int id) {
		
		return hospitalDAO.getPerson(id);
		// TODO Auto-generated method stub
		//return null;
	}


	@Override
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		return hospitalDAO.getDoctor(id);
	}
	
	
}
