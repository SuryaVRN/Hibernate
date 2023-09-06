package com.project.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.config.Utility;
import com.project.dao.HospitalDAO;
import com.project.entity.Appointment;
import com.project.entity.Doctor;
import com.project.entity.MedicalRecords;
import com.project.entity.Patient;
import com.project.entity.Person;

public class HospitalDAOImpl implements HospitalDAO{
	
	SessionFactory sessionFactory=Utility.utility();

	@Override
	public int createPerson(Person person) {
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(person);
		t.commit();
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int createDoctor(Doctor doctor) {
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(doctor);
		t.commit();
		
		return 0;
	}

	@Override
	public int createAppointment(Appointment appointment) {
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(appointment);
		t.commit();
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int createPatient(Patient patient) {
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(patient);
		t.commit();
		return 0;
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public int updateAppointment(Patient patient,int id) {
		Session session=sessionFactory.openSession();
		Appointment appointment=session.get(Appointment.class, id);
		appointment.setPatient(patient);
		Transaction t=session.beginTransaction();

		session.update(appointment);
		t.commit();
	
		return 1;
		
	}

	@Override
	public int createMedicalRecord(MedicalRecords medicalRecord) {
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(medicalRecord);
		t.commit();
		return 0;
		
		
	}

	@Override
	public MedicalRecords getMedicalRecord(int id) {
		Session session=sessionFactory.openSession();
		MedicalRecords medicalRecord=session.get(MedicalRecords.class, id);
		return medicalRecord;
	}
	@Override
	public Appointment getAppointment(int id) {
		Session session=sessionFactory.openSession();
		Appointment appointment=session.get(Appointment.class, id);
		
		return appointment;
	}

	@Override
	public Person getPerson(int id) {
		Session session=sessionFactory.openSession();
		return session.get(Person.class, id);
		
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public Doctor getDoctor(int id) {
		Session session=sessionFactory.openSession();
		return session.get(Doctor.class, id);
		
		
	}
	
	

}
