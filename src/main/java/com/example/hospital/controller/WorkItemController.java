package com.example.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.model.WorkItem;
import com.example.hospital.service.WorkItemService;

@RestController

public class WorkItemController {
	@Autowired
	private WorkItemService workItemService ;
	
	//@GetMapping(value="/workItems")
	@RequestMapping(value="/workItems", method=RequestMethod.GET)
	public List<WorkItem> getWorkItem() {
		List<WorkItem> workItem = null ;
		workItem = workItemService.getAllWorkItems();
		return workItem ;
	}
	
	@RequestMapping(value="/NewWorkItems", method=RequestMethod.POST)
	public String createWorkItem(@RequestBody WorkItem workItem ) {
		//List<WorkItem> workItem = null ;
		 workItemService.createWorkItem(workItem);
		 return "Work Item Created" ;
		 
	}


}
