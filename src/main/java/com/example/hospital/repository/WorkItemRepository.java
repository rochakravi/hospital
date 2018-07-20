package com.example.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.model.Patient;
import com.example.hospital.model.WorkItem;

@Repository
public interface WorkItemRepository extends JpaRepository<WorkItem, Integer> {
	
	

}
