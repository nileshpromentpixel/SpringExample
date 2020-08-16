package com.model;

import com.model.Student;

public class Student {

	private int id;
	private String name;
	private String school;
	private College college;

	public Student(int id, String name, String school, College college) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
		this.college = college;
	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Student that = (Student) obj;
		if (this.id != that.id)
			return false;

		return true;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
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

}
