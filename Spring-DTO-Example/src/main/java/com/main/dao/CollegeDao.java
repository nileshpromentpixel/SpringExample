package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.College;
@Component
@Transactional
public interface CollegeDao extends JpaRepository<College, Integer>{

}
