package com.main.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.dto.CollegeDto;
import com.main.model.College;

@Component
public class CollegeMapper {

	

	
	
	@Autowired
	StudentMapper studentMapper;
	List<CollegeDto> collegeData=new ArrayList<>();

	public List<CollegeDto> getMappedData(List<College> collegeList) {
		for(College college :collegeList)
		{
	   CollegeDto collegeDto=new CollegeDto();
		collegeDto.setId(college.getId());
		collegeDto.setCname(college.getCname());
		collegeDto.setAddress(college.getAddress());
		collegeDto.setStudentDto(studentMapper.getStudentsList(college.getStudent()));
		
		collegeData.add(collegeDto);
		}
		
		return collegeData;
	}

}
