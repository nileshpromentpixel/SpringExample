package com.main.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.dto.StudentDto;
import com.main.model.Student;
@Component
public class StudentMapper {

	@Autowired
	Student student;
	
	@Autowired
	StudentDto studentDto;
	
	public List<Student> getStudentsList(List<Student> studentList) {
		List<Student> listofStudent=new ArrayList<>();
		for(Student st : studentList){
		studentDto.setId(st.getId());
		studentDto.setName(st.getName());
		studentDto.setSchool(st.getName());
		listofStudent.add(st);
		}
		return listofStudent;
	}
	
	
	
	

}
