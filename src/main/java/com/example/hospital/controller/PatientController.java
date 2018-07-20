package com.example.hospital.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.model.Patient;
import com.example.hospital.service.PatientService;

@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin
@RestController
public class PatientController {

	
	@Autowired
	private PatientService patientService ;
	
	@RequestMapping(value="/patients", method=RequestMethod.GET)
	public List<Patient> getPatients() {
		
		List<Patient> obj = null ;
		obj = patientService.getAllPatients();		
		return obj ;
	}
	
	@RequestMapping(value="/patients/{id}", method = RequestMethod.GET)
	public Patient getPatientById(@PathVariable int id) {
		
		return patientService.getPatientById(id);
		
		
	}
	
	@RequestMapping(value="/patient",method=RequestMethod.POST)
	public Patient savePatients(@RequestBody Patient patientDto) {
		
		
		return patientService.savePatient(patientDto);
	}
	
	@RequestMapping(value="/patient/{id}", method = RequestMethod.PUT)
	public Patient updatePatient(@RequestBody Patient patient, @PathVariable int id ) {
		
		patient.setPatientId(id);
		return patientService.updatePatient(patient);
	}
	
	@RequestMapping(value="/patient/{id}", method=RequestMethod.DELETE)
	public void deletePatient(@PathVariable int id) {
		patientService.deletePatient(id);
	}
	
	
	
}
