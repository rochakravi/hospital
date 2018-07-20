package com.example.hospital.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="WORKITEM")
public class WorkItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="WORK_ITEM_ID")
	private Integer workItemId ;
	

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="PATIENT_ID")
	//private Integer patientId ;
	private Patient patient ;	
	
	
	
	//@Column(name="DOCTOR_ID")
	//private Integer doctorId ;
	
	@Column(name="CATOGORY")
	private String category ;
	
	@Column(name="PATIENT_STATUS")
	private String patientStatus ;
	
	@Column(name="START_DATE")
	private Date startDate ;
	
	@Column(name="END_DATE")
	private Date endDate ;
	
	@Column(name="DIESES")
	private String dieses ;

	public Integer getWorkItemId() {
		return workItemId;
	}

	public void setWorkItemId(Integer workItemId) {
		this.workItemId = workItemId;
	}

	public Patient getPatientDetailsId() {
		return patient;
	}

	public void setPatientDetailsId(Patient patient) {
		this.patient = patient;
	}

	

	/*public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}*/

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDieses() {
		return dieses;
	}

	public void setDieses(String dieses) {
		this.dieses = dieses;
	}
	
	
	
	
	


}
