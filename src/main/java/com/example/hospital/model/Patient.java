package com.example.hospital.model;

import java.util.Set;

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
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name="PATIENTS")
//@Table
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PATIENT_ID")
	private Integer patientId ;
	
	@Column(name="PATIENT_NAME")
	private String patientName ;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="DOCTOR_ID")
	private Doctor doctor ;	

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor =  doctor;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Patient() {
		super();
	}
	
	public Patient(Integer patientId, String patientName, Doctor doctor) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctor = doctor;
	}
	

}
