package com.tidecc.exception.test;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionTestController{
	
	@Autowired
	ExceptionTestService service;
	
	
	@RequestMapping(value="isay", method=RequestMethod.GET)
	public void executeController(@RequestParam("id") String id, HttpServletResponse response){
		
		System.out.println("=============executeController");
		
		ModelAndView mv = new ModelAndView();

		
		
		switch (Integer.parseInt(id)) {
		case 1:
			System.out.println("====case1");
			throw new MyException("3001", "the 1 controller.");
		case 2:
			throw new MyException("3002", "the 2 controller.");
		case 3:
			throw new MyException("3003", "the 3 controller.");
		case 4:
			throw new MyException("3004", "the 4 controller.");
		case 5:
			throw new MyException("3005", "the 5 controller.");
		case 7:
			System.out.println("===id 7==");
			//response.getWriter().write("00000000000000abc00");

		default:
			throw new ParamException("the param of Controller is error!!");
		}
		
		
	}
	
	@RequestMapping(value="/service", method=RequestMethod.GET)
	public void executeService(@RequestParam int id){
		System.out.println("=============executeService");
		try {
			service.execute(id);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value="/dao", method=RequestMethod.GET)
	public void executeDao(@RequestParam int id)throws Exception{
		System.out.println("=============executeDao");
		service.executeDao(id);
	}
	
	
	@RequestMapping (value="sayHello" )
    public void sayHello( Writer writer, @RequestParam(value="id", required=false) String id) throws Exception {  
		//writer = null;
       writer.write( "Hello " + "abc" + " , Hello " + id);  
       writer.write( "\r" );  
       throw new MyException("9999", "message is error!");
       
	}
	
	@RequestMapping("/gotoResult")
	public String gotoResult()throws Exception{
		System.out.println("=====gotoResult====");
		return "result";
	}
	
	/**
	 * 主页访问
	 */
	@RequestMapping("/")
	public String gotoindex()throws Exception{
		System.out.println("===gotoIndex===");
		return "index";
	}

}
