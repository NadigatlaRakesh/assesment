package com.assesment.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.assesment.dto.Yebelo;
import com.assesment.repository.IAssestRepository;

@Service
public class AssestServiceImpl implements IAssestService {

	@Autowired
	IAssestRepository repositary;
	
	public Map<String,Yebelo> fetchNumber(String nextNumber) {
		return repositary.fetchNumber(nextNumber);
		
	}
	public Map<String,Integer> updateNumber(int nextNumber) {
		
		int number=nextNumber-1;
		int updNumber=number+nextNumber;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return repositary.updateNumber(updNumber,nextNumber);
	}
}
