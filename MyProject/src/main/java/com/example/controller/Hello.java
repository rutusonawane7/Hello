package com.example.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/")
	public String getRequest(@RequestParam (value="text" ,required = false)String Text )	        

	{
		String responseString = "Hello"+" "+getCurrentFormattedDateTime()+" "+Text;
		return responseString;
	}
	
	private String getCurrentFormattedDateTime()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return dateFormat.format(Calendar.getInstance().getTime()); 
	}
	
	
		
	

}
