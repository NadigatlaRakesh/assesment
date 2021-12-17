package com.assesment.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.assesment.dto.Yebelo;

@Service
public interface IAssestService {

	public Map<String,Yebelo> fetchNumber(String nextNumber);
	public void updateNumber(String nextNumber);
}
