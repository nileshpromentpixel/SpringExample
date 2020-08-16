package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Session {

	String name;

	static int count = 0;

	public Session() {
		System.out.print("new Bean is created " + count++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
