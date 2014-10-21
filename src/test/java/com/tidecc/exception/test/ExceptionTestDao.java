package com.tidecc.exception.test;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ExceptionTestDao{
	
	
	public void execute(int i)throws Exception{
		
		switch (i) {
		case 1:
			throw new MyException("1001", "the 1 dao");
		case 2:
			throw new MyException("1002", "the 2 dao");
		case 3:
			throw new MyException("1003", "the 3 dao");
		case 4:
			throw new MyException("1004", "the 4 dao");
		case 5:
			throw new MyException("1005", "the 5 dao");
		default:
			throw new ParamException("the param of DAO is error!!");
		}
		
	}

}
