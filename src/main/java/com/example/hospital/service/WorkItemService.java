package com.example.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.model.WorkItem;
import com.example.hospital.repository.WorkItemRepository;

@Service
public class WorkItemService {

	@Autowired
	private WorkItemRepository 	workItemRepository ;
	public List<WorkItem> getAllWorkItems() {
		// TODO Auto-generated method stub
		List<WorkItem> workItemList = null ;
		workItemList = workItemRepository.findAll();
		return workItemList ;
		
	}
	public void createWorkItem(WorkItem workItem) {
		// TODO Auto-generated method stub
		 workItemRepository.save(workItem);
		
	}

}
