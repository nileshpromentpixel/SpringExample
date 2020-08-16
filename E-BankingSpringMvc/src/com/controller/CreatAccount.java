package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dao.CreatAccountDao;
import com.Dao.LoginDao;
import com.Model.CustomerDetial;
import com.Model.LoginModel;
@Controller
public class CreatAccount {

	@Autowired
	private CreatAccountDao creataccountdao;
	
	@RequestMapping("/NewAccount")
	public String toLogin(@ModelAttribute("CustomerDeatil") CustomerDetial customerdetial) {
		
		return "NewAccount";
	}
	
	
			
	@RequestMapping("/creataccount")
	 public String save(@ModelAttribute("emp")CustomerDetial customerdetial){    
		creataccountdao.save(customerdetial);    
        return "redirect:/welcome";//will redirect to viewemp request mapping    
    }    
		
	
}
