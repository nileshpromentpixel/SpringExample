package com.main.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.dao.StudentDao;
import com.main.model.College;
import com.main.model.Student;

@Component
public class ServiceImpl implements Service {

//	private static final Map<Integer, Student> studentList = new HashMap<Integer, Student>();

	@Autowired
	StudentDao studentDao;

@Override
public List getAllStudents() {
	return studentDao.findAll();
}

@Override
public Student getStudent(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Student updateStudent(Student student) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Student addStudent(Student student) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteStudent(int id) {
	// TODO Auto-generated method stub
	
}

	}

	

	
	




