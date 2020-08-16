package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dao.DepositeDao;
import com.Model.CustomerDetial;
@Controller
public class DepositeController {
	
@Autowired	
public DepositeDao depositedao;
	
	@RequestMapping("/Deposite")
	public String toLogin(@ModelAttribute("Deposite") CustomerDetial customerdetial) {
		
		return "DepositeAmount";
	}

	@RequestMapping("/DepositeAmount")
	 public String deposite(@ModelAttribute("Deposite")CustomerDetial customerdetial){    
		int status=depositedao.depositeAmount(customerdetial);
		if(status==0)
		{
		return "welcome";
		}
		else
		{
			return "welcome";
		}
         
   } 
}
