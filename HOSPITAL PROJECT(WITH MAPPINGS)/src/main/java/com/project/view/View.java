

package com.project.view;

import java.util.Set;

import com.project.entity.Appointment;
import com.project.entity.Doctor;
import com.project.entity.MedicalRecords;
import com.project.entity.Patient;
import com.project.entity.Person;
import com.project.resource.HospitalResource;

public class View {
	
	public static void main(String[] args) {
		
		HospitalResource hospitalResource =new HospitalResource ();
	/*	
		hospitalResource.createPerson(new Person(1,"ramya",32,"1/feb",964252358L,"o+") );
		hospitalResource.createPerson(new Person(2,"narasimha",62,"15/dec",42536322L,"ab+") );
		hospitalResource.createPerson(new Person(3,"praveen",75,"18/oct",94152358L,"a+") );
		hospitalResource.createPerson(new Person(4,"sandeep",42,"27/april",964412533L,"o+") );
		hospitalResource.createPerson(new Person(5,"raju",35,"19/jan",9128362358L,"a+") );

		hospitalResource.createDoctor(new Doctor(1,"Heart",new Person(1)));
		hospitalResource.createDoctor(new Doctor(2,"lungs",new Person(2)));
		hospitalResource.createDoctor(new Doctor(3,"eyes",new Person(3)));
		hospitalResource.createDoctor(new Doctor(4,"bones",new Person(4)));
		hospitalResource.createDoctor(new Doctor(5,"kidneys",new Person(5)));

		
//	public Person(int id, String name, int age, String dob, long contact, String bloodGroup) {
//	public Doctor(int id, String specialization, Person person) {
//	public Appointment(int id, String date, String time, String typeOfAppointment, Person person, Doctor doctor) {
		hospitalResource.createAppointment(new Appointment(1,"5/jun","5:30","fast",new Person(1),new Doctor(1)));
		hospitalResource.createAppointment(new Appointment(2,"9/jul","5:30","superFast",new Person(1),new Doctor(1)));
		hospitalResource.createAppointment(new Appointment(3,"29/sep","5:30","general",new Person(1),new Doctor(1)));
		hospitalResource.createAppointment(new Appointment(4,"14/mar","5:30","premium",new Person(1),new Doctor(1)));
		hospitalResource.createAppointment(new Appointment(5,"30/dec","5:30","genral",new Person(1),new Doctor(1)));
	*/
		//	public Patient(int id, String diagonsis, Appointment appointment, Person person) {

	//	hospitalResource.createPatient(new Patient(1,"knee pain"));
//	public int updateAppointment(Patient patient,int id);
		
	//	hospitalResource.updateAppointment(new Patient( 1 ),1 );
//	public MedicalRecords(int id, String prescription, Doctor doctor, Patient patient) {
		
	//	hospitalResource.createMedicalRecord(new MedicalRecords(1,"Give tablets",new Doctor(1),new Patient(1)) );
		
	//	MedicalRecords medicalRecord=hospitalResource.getMedicalRecord(1);
	//	System.out.println(medicalRecord.getPatient();
		
	//	Appointment appointment=hospitalResource.getAppointment(1);
	//	System.out.println(appointment.getPerson().getName()+ " \t"+appointment.getDoctor().getPerson().getName());
		
	//	Person person=hospitalResource.getPerson(1);
	//	System.out.println(person.getDoctor().getSpecialization());
		
		Doctor doctor=hospitalResource.getDoctor(1);
		Set<MedicalRecords> medicalRecords= doctor.getMedicalRecords();
		for (  MedicalRecords medicalRecord:  medicalRecords    )
			System.out.println(medicalRecord.getId()+"\t"+medicalRecord.getPatient().getDiagonsis()+"\t"+medicalRecord.getPrescription());
			
	}

}
