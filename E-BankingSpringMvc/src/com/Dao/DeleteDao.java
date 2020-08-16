package com.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Model.CustomerDetial;

public class DeleteDao {
	
JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	
	
	public int de(CustomerDetial p){   
		
		System.out.print("dao call");
		int rowcount = template.queryForInt("select count(*) from creataccount " +
				" where username = ? and password = ?",p.getUsername(),p.getPassword());
		if(rowcount > 0){
			System.out.print("dao inside call");
			String sql="delete from creataccount where id='"+p.getAccountno()+"'";    
		    return template.update(sql);
			
		}
		else
		{
			return 0;
		}
		
		
		
	      
	}    

}
