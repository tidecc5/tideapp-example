package com.tidecc.exception.test;

import org.springframework.http.HttpStatus;

public class MyException extends RuntimeException {
	
	
	public HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
	
	
	public MyException(){
		super();
	}
	
	public MyException(String id, String exMessage){
		super(id + exMessage);
	}
	
	
	

}
