package com.assesment.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.dto.Yebelo;
import com.assesment.service.IAssestService;

@RestController
public class AssestController {

	@Autowired
	IAssestService service;
	
	@GetMapping(value="FetchNextNumber/{nextNumber}")
	public ResponseEntity< Map<String,Yebelo>> fetchNumber(@PathVariable("nextNumber") String nextNumber) {
		
		return new ResponseEntity<>(service.fetchNumber(nextNumber), HttpStatus.OK);
		
	}
	
	@PostMapping(value="updateNumber/{nextNumber}")
	public ResponseEntity< Map<String,Integer>> updateNumber(@PathVariable("nextNumber") int nextNumber) {
		
		return new ResponseEntity<>(service.updateNumber(nextNumber), HttpStatus.OK);
	}
}
