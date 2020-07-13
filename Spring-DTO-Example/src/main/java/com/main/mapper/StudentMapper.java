package com.main.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.dto.StudentDto;
import com.main.model.Student;
@Component
public class StudentMapper {

	
	
	public List<StudentDto> getStudentsList(List<Student> studentList) {
		StudentDto studentDto=new StudentDto();
		List<StudentDto> listofStudent=new ArrayList<>();
		for(Student st : studentList){
		studentDto.setId(st.getId());
		studentDto.setName(st.getName());
		studentDto.setSchool(st.getSchool());
		listofStudent.add(studentDto);
		}
		return listofStudent;
	}
	
	
	
	

}
