package com.tidecc.exception.test;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler{
	
	/**
	 * 处理RestException.
	 */
	@ExceptionHandler(value = { MyException.class })
	public final ResponseEntity<?> handleException(MyException ex, WebRequest request) {
		HttpHeaders headers = new HttpHeaders();
		//headers.setContentType(MediaType.parseMediaType(MediaTypes.TEXT_PLAIN_UTF_8));
		System.out.println("=========ExceptionHandler====");
		return handleExceptionInternal(ex, ex.getMessage(), headers, ex.status, request);
	}

}
