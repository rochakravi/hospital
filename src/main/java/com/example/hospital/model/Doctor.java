package com.example.hospital.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="DOCTOR")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DOCTOR_ID")
	private int doctorID ;
	
	@Column(name="name")
	private String doctorName ;
	
	@Column(name="specilist")
	private String doctorSpecilist ;
	
	@Column(name="degree")
	private String doctorDegree ;
	
	/*@ManyToOne(targetEntity=Patient.class, fetch = FetchType.EAGER)
	@JoinColumn(name="PATIENT_ID")
	private List<Patient> patient ;	
	
	@OneToMany(mappedBy="doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		private List<Patient> patient;	
	
	public List<Patient> getPatient() {
		return patient;
	}
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}*/
	public Doctor() {
		super();
	}
	/*
	public void setPatient(Set<Patient> patient) {
		this.patient = patient;
	}*/
	
	
	public String getDoctorSpecilist() {
		return doctorSpecilist;
	}
	public Doctor(int doctorID, String doctorName, String doctorSpecilist, String doctorDegree/*, List<Patient> patient*/) {
		super();
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.doctorSpecilist = doctorSpecilist;
		this.doctorDegree = doctorDegree;
		//this.patient = patient;
	}
	


	public void setDoctorSpecilist(String doctorSpecilist) {
		this.doctorSpecilist = doctorSpecilist;
	}
	public String getDoctorDegree() {
		return doctorDegree;
	}
	public void setDoctorDegree(String doctorDegree) {
		this.doctorDegree = doctorDegree;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
}
