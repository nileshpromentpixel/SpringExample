package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.StudentDao;
import com.model.College;
import com.model.Student;

@Component
public class ServiceImpl implements Service {

	
	
	
	@Override
	public String getStudentLIst() {
		return "helloe";
	}



	
}
