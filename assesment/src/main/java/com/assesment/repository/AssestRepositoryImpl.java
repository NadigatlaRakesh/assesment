package com.assesment.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;

import com.assesment.dto.Yebelo;

@Repository
public class AssestRepositoryImpl implements IAssestRepository{
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

public Map<String,Yebelo> fetchNumber(String nextNumber) {
	MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	namedParameters.addValue("nextNumber",nextNumber);
	String query="select CategoryCode from yebola.fetchnumb where CategoryCode=:nextNumber";
	List<Yebelo> query2 = namedParameterJdbcTemplate.query(query, namedParameters,
			new BeanPropertyRowMapper<Yebelo>(Yebelo.class));
	if(CollectionUtils.isEmpty(query2)) {
		
	}
	Map<String,Yebelo> assign=new HashMap<>();
	assign.put("result",query2.get(0));
	return assign;
	}
public void updateNumber(String nextNumber) {
	
}
}
