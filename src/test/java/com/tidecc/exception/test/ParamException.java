package com.tidecc.exception.test;

public class ParamException extends RuntimeException{
	
	public ParamException(){
		super();
	}

	public ParamException(String exMessage){
		super(exMessage);
	}
}
