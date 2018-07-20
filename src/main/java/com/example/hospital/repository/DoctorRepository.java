package com.example.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

	
	
}
