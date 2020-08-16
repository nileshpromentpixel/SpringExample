package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.Dao.LoginDao;
import com.Model.LoginModel;
@Controller
public class LoginController {
	

	@Autowired
	private LoginDao logindao;
	
	@RequestMapping("/Login")
	public String toLogin(@ModelAttribute("Login") LoginModel loginmodel) {
		
		return "Login";
	}
	
	@RequestMapping("/doLogin")
	public   String doLogin(@ModelAttribute("Login")LoginModel loginmodel) {
		
		
	       ;
	       if(!logindao.authenticateUser(loginmodel)) {
	    	   return "welcome";
			} else {
				return "welcome";
			}	
			
		
		
	}
}
