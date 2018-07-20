package com.example.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.model.Doctor;
import com.example.hospital.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired 
	private DoctorRepository doctorRepository ;
	
	public Doctor addDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	public Doctor updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}
	public List<Doctor> getAllDoctors(){
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
		
	}

	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
	}
}
