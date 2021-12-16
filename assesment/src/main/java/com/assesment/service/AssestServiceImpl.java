package com.assesment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.repository.IAssestRepository;

@Service
public class AssestServiceImpl implements IAssestService {

	@Autowired
	IAssestRepository repositary;
	
	public void fetchNumber() {
		repositary.fetchNumber();
	}
}
