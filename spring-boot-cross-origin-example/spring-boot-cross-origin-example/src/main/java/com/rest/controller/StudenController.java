package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.model.Student;
import com.rest.service.StudentService;

@Controller
public class StudenController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/getStudents", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public List<Student> getStudents() {

		List<Student> listOfStudent = studentService.getAllStudents();

		return listOfStudent;
	}

	@RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public Student getStudentById(@PathVariable int id) {
		Student studentById = studentService.getStudent(id);

		return studentById;
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.PUT, headers = "Accept=application/json")
	@ResponseBody
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);

	}

	@RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	@ResponseBody
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);

	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST, headers = "Accept=application/json")
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

}
