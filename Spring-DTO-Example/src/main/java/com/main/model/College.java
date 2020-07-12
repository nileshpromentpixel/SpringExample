package com.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="college")
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "cname")
	private String cname;
	@Column(name = "address")
	private String address;
	 @OneToMany(mappedBy = "college", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	    private List<Student> student;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}


	public College(int id, String cname, String address, List<Student> student) {
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
