package com.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Model.CustomerDetial;

public class DepositeDao {
	
JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
public int depositeAmount(CustomerDetial p){   
		
		int rowcount = template.queryForInt("select count(*) from creataccount " +
				" where username = ? and password = ?",p.getUsername(),p.getPassword());
		if(rowcount > 0){
			String sql = "SELECT Amount FROM creataccount WHERE ID=?";

		    String streetName = (String) jdbcTemplate.queryForObject(
		            sql, new Object[] { id }, String.class);
			String sql="update creataccount set amount='"+ p.getAmount() + "' where id='"+p.getAccountno()+"'";    
		    return template.update(sql);
			
		}
		else
		{
			return 0;
		}
		
		
		
	      
	}    


}
