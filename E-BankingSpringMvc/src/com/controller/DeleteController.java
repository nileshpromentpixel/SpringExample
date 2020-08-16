package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dao.DeleteDao;
import com.Dao.LoginDao;
import com.Model.CustomerDetial;
import com.Model.LoginModel;

@Controller
public class DeleteController {
	
	@Autowired
	private DeleteDao deletedao;
	
	@RequestMapping("/DeleteAccount")
	public String toDelete(@ModelAttribute("delete") CustomerDetial customerdetial) {
		
		return "DeleteAccount";
	}
	
	@RequestMapping("/deleteaccount")
 public String deletex(@ModelAttribute("delete") CustomerDetial customerdetial){    
		System.out.print(customerdetial.getAccountno());
		
		int status=deletedao.de(customerdetial);
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
