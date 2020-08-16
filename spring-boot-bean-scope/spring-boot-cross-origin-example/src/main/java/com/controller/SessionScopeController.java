package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionScopeController {

	@Autowired
	Session session;

	@RequestMapping("/session1")
	@ResponseBody
	public String getSessionScopeMessage() {
		session.setName("nilesh");

		return session.getName();

	}

	@RequestMapping("/session2")
	@ResponseBody
	public String getUpdateSessuonScopeMessage() {
		session.setName("mayur");

		return session.getName();

	}

}
