package com.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Model.CustomerDetial;
import com.Model.LoginModel;


public class CreatAccountDao {

	
JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	public int save(CustomerDetial p){    
	    String sql="insert into creataccount(username,password,amount,ph,address) values('"+p.getUsername()+"',"+p.getPassword()+",'"+p.getAmount()+"','"+p.getPhon()+"','"+p.getAddress()+"')";    
	    return template.update(sql);  
	}    
	
}
