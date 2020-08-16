package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Request {

	private static int currentdate;

	public Request() {

		System.out.print(currentdate++);
	}

	void getDate() {

		System.out.print("metod called");
	}

}
