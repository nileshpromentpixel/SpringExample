package com.main.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.main.dto.CollegeDto;
import com.main.model.College;


@Component
public interface CollegeService {
	
	public List<CollegeDto> getCollegeList();

}
