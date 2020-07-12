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
	CollegeDto collegeDto;
	
	@Autowired
	College college;
	
	@Autowired
	StudentMapper studentMapper;
	
	public List<CollegeDto> getMappedData(List<College> collegeList) {
		List<CollegeDto> collegeData=new ArrayList<>();
		for(College college :collegeList)
		{
		collegeDto.setId(college.getId());
		collegeDto.setCname(college.getCname());
		collegeDto.setAddress(college.getAddress());
		collegeDto.setStudent(studentMapper.getStudentsList(college.getStudent()));
		collegeData.add(collegeDto);
		}
		return collegeData;
	}

}
