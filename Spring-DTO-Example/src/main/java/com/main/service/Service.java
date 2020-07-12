package com.main.service;

import java.util.List;

import com.main.model.Student;

public interface Service {

	public List getAllStudents();

	public Student getStudent(int id);

	public Student updateStudent(Student student);

	public Student addStudent(Student student);

	public void deleteStudent(int id);
}
