package com.example.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospital.model.Patient;
import com.example.hospital.model.PatientDto;
import com.example.hospital.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository ;
	public List<Patient> getAllPatients() {
		
		List<Patient> patientList = null ;
		patientList = patientRepository.findAll();
		
		return patientList ;
	}

	public Patient updatePatient(Patient patient) {
		return patientRepository.save(patient);
		
	}

	public Patient savePatient(Patient patientDto) {
		// TODO Auto-generated method stub
		return patientRepository.save(patientDto);
	}

	public Patient getPatientById(int id) {
		// TODO Auto-generated method stub
		
		return patientRepository.findBypatientId(id);
		
	}

	public void deletePatient(int id) {
		patientRepository.deleteById(id);
		
	}

	
}
