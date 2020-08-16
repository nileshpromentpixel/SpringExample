package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Student;
import com.service.*;

@Controller
public class CollegeController {

	@Autowired
	private ServiceImpl studentDetials;

	@RequestMapping(value = "/getStudents", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public String getStudents() {


		return studentDetials.getStudentLIst();

	}

	
}
