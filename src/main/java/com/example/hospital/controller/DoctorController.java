package com.example.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.model.Doctor;
import com.example.hospital.model.Patient;
import com.example.hospital.service.DoctorService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DoctorController {
	
	@Autowired 
	private DoctorService doctorService ;
	
	/*payload
	 * {      
        "doctorName": "Reema Dixit",
        "doctorSpecilist": "Econology",
        "doctorDegree": "MS"
    }*/
	@RequestMapping(value="/addDoctor", method=RequestMethod.POST)
	public Doctor addDoctor(@RequestBody Doctor doctor) {		
		return doctorService.addDoctor(doctor);		
	}
	@RequestMapping(value="/updateDoctor/{id}", method=RequestMethod.PUT)
	public Doctor updateDoctor(@RequestBody Doctor doctor, @PathVariable int id) {
		//System.out.println(id);
		doctor.setDoctorID(id);
		return doctorService.updateDoctor(doctor);
	}
	@RequestMapping(value="/doctors", method=RequestMethod.GET)
	public List<Doctor> getAllDoctors() {		
		return doctorService.getAllDoctors();		
	}
	
	@RequestMapping(value="/doctor/{id}", method=RequestMethod.DELETE)
	public void deleteDoctor(@PathVariable int id) {
		doctorService.deleteDoctor(id);
		
	}

	
}


