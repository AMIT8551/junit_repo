package com.bikkadit.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.employeeManagement.services.WelcomeServices;
@RestController
public class WelcomeController {

	
	@Autowired
	public WelcomeServices welcomeServices ;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomemsg(){
		
		String msg = welcomeServices.welcomemsg();
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
}
