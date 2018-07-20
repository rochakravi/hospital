package com.example.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.model.Patient;
import com.example.hospital.model.PatientDto;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	//Patient save(PatientDto patientDto);
	public Patient findBypatientId(int id);
	//Patient findById(Patient patientId);

	//Patient findAllById(Patient patientId);


}
