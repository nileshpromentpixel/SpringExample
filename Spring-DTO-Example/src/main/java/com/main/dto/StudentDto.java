package com.main.dto;

import javax.persistence.Column;

import org.springframework.stereotype.Component;

import com.main.model.College;
@Component
public class StudentDto {
	private int id;
	private String name;
	private String school;
    private College college;
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentDto(int id, String name, String school, College college) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
		this.college = college;
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
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}

	
	

}
