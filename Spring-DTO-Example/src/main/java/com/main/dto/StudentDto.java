package com.main.dto;

import javax.persistence.Column;

import org.springframework.stereotype.Component;

import com.main.model.College;
@Component
public class StudentDto {
	private int id;
	private String name;
	private String school;
    private CollegeDto collegeDto;
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDto(int id, String name, String school, CollegeDto collegeDto) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
		this.collegeDto = collegeDto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public CollegeDto getCollegeDto() {
		return collegeDto;
	}
	public void setCollegeDto(CollegeDto collegeDto) {
		this.collegeDto = collegeDto;
	}
	
	

	
	

}
