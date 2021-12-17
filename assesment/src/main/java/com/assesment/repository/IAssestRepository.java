package com.assesment.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.assesment.dto.Yebelo;

@Repository
public interface IAssestRepository {

	public Map<String,Yebelo> fetchNumber(String nextNumber);
	public Map<String,Integer> updateNumber(int updNumber,int nextNumber);
}
