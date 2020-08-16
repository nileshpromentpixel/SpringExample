package com.application;

public class SingleTone {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Your Message : " + message);

	}

}
