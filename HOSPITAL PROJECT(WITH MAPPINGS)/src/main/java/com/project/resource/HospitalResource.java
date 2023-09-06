package com.project.resource;

import com.project.service.impl.*;
import com.project.service.impl.HospitalServiceImpl;
import com.project.entity.Appointment;
import com.project.entity.Doctor;
import com.project.entity.MedicalRecords;
import com.project.entity.Patient;
import com.project.entity.Person;
import com.project.service.*;

public class HospitalResource {
	
	HospitalServiceImpl hospitalService=new HospitalServiceImpl();

	public int createPerson(Person person) {
		return hospitalService.createPerson(person);
		
		// TODO Auto-generated method stub
		
	}

	public int createDoctor(Doctor doctor) {
		return hospitalService.createDoctor(doctor);
		// TODO Auto-generated method stub
		//return 0;
	}
	
	public int createAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return hospitalService.createAppointment(appointment);
	}
	
	public int createPatient(Patient patient) {
		hospitalService.createPatient(patient);
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateAppointment(Patient patient, int id) {
		// TODO Auto-generated method stub
		hospitalService.updateAppointment(patient, id);
		return 0;
	}
	
	public int createMedicalRecord(MedicalRecords medicalRecord) {
		hospitalService.createMedicalRecord(medicalRecord);
		// TODO Auto-generated method stub
		return 0;
	}
	
	public MedicalRecords getMedicalRecord(int id) {
		return hospitalService.getMedicalRecord(id);
		
		//return null;
	}
	public Appointment getAppointment(int id) {
		Appointment appointment=hospitalService.getAppointment(id);
		return appointment;
	}
	public Person getPerson(int id) {
		
		return hospitalService.getPerson(id);
		// TODO Auto-generated method stub
		//return null;
	}
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		return hospitalService.getDoctor(id);
	}
	

}
