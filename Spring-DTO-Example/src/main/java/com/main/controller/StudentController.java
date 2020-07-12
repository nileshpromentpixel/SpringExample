package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.model.Student;
import com.main.service.*;

@Controller
public class StudentController {

	@Autowired
	private ServiceImpl studentDetials;

	@RequestMapping(value = "/getStudents", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public List getStudents() {

		List listOfStudent = studentDetials.getAllStudents();

		return listOfStudent;
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		return studentDetials.addStudent(student);
	}

	@RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody
	public void deleteStudent(@PathVariable("id") int id) {
		studentDetials.deleteStudent(id);

	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.PUT, headers = "Accept=application/json")
	@ResponseBody
	public Student updateStudent(@RequestBody Student student) {

		return studentDetials.updateStudent(student);

	}
}
