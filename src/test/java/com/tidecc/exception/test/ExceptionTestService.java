package com.tidecc.exception.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionTestService {
	
	@Autowired
	ExceptionTestDao dao;
	
	public void execute(int i) throws Exception{
		
		switch (i) {
		case 1:
			throw new MyException("2001", "the 1 service.");
		case 2:
			throw new MyException("2002", "the 2 service.");
		case 3:
			throw new MyException("2003", "the 3 service.");
		case 4:
			throw new MyException("2004", "the 4 service.");
		case 5:
			throw new MyException("2005", "the 5 service");
		default:
			throw new ParamException("the param of service is error!!");
		}
		
	}
	
	public void executeDao(int i)throws Exception{
		dao.execute(i);
	}

}
