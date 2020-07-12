package com.main.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.main.model.Student;

public class CollegeDto {

	private int id;
	private String cname;
	private String address;
	private List<Student> student;
	public CollegeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CollegeDto(int id, String cname, String address, List<Student> student) {
		super();
		this.id = id;
		this.cname = cname;
		this.address = address;
		this.student = student;
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
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	

}
