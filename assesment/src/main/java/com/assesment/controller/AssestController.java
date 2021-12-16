package com.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.service.IAssestService;

@RestController
public class AssestController {

	@Autowired
	IAssestService service;
	
	@GetMapping("FetchNextNumber")
	public void fetchNumber() {
		service.fetchNumber();
	}
}
