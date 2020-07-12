package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.dto.CollegeDto;
import com.main.model.College;
import com.main.service.CollegeServiceImpl;

@Controller
public class CollegeController {
	
	@Autowired
	CollegeServiceImpl collegeServieImpl;
	@RequestMapping(value = "/getCollege", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public List<CollegeDto> getCollege() {

		List<CollegeDto> listOfCollege = collegeServieImpl.getCollegeList();

		return listOfCollege;
	}

}
