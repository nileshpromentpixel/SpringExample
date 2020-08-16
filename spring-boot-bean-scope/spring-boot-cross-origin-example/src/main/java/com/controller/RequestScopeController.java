package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestScopeController {

	@Autowired
	private Request request;

	@RequestMapping("/request")
	@ResponseBody
	public String getRequestScopeMessage() {
		request.getDate();
		return "welcome";

	}

}
