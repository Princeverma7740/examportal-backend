package com.examportal.exam.exception;

public class UserFoundException  extends Exception{

	 public UserFoundException() {
	        super("User with this username already in the  database !!");
	    }

	    public UserFoundException(String msg) {
	        super(msg);
	    }

}
