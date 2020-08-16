package com.Dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import org.springframework.dao.DataAccessException;
import com.Model.LoginModel;

public class LoginDao {
JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	
	public boolean authenticateUser(LoginModel loginmodel){
		boolean userExists = false;
		int rowcount = template.queryForInt("select count(*) from login " +
				" where email = ? and password = ?",loginmodel.getEmail(),loginmodel.getPassword());
		System.out.print(rowcount);
		if(rowcount == 1){
			userExists = true;
		}
		return userExists;
	}  
}
