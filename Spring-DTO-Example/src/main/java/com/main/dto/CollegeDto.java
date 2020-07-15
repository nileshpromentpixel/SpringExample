package com.main.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.model.Student;

public class CollegeDto {

	private int id;
	private String cname;
	private String address;
	private List<StudentDto> studentDto;
	public CollegeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CollegeDto(int id, String cname, String address, List<StudentDto> studentDto) {
		super();
		this.id = id;
		this.cname = cname;
		this.address = address;
		this.studentDto = studentDto;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<StudentDto> getStudentDto() {
		return studentDto;
	}
	public void setStudentDto(List<StudentDto> studentDto) {
		this.studentDto = studentDto;
	}
	


}
