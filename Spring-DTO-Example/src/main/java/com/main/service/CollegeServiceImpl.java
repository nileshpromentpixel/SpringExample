package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.dao.CollegeDao;
import com.main.dto.CollegeDto;
import com.main.mapper.CollegeMapper;
import com.main.model.College;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService{

	@Autowired
	CollegeDao collegeDao;
	@Autowired
	CollegeMapper collegeMapper;
	
	@Override
	public List<CollegeDto> getCollegeList() {
	List<College>	modelList=collegeDao.findAll();
	System.out.print(modelList.get(1));
		return collegeMapper.getMappedData(modelList);
	}

}
