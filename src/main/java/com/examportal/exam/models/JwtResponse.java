package com.examportal.exam.models;

public class JwtResponse {

	String token;

	public JwtResponse(String token) {

		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public JwtResponse() {

		// TODO Auto-generated constructor stub
	}
	
	
}
