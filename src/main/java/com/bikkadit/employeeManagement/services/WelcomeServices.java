package com.bikkadit.employeeManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.employeeManagement.repository.WelcomeRepository;

@Service
public class WelcomeServices {

	@Autowired
	public WelcomeRepository welcomeRepository ;
	
	public String welcomemsg() {
		String welcomemsg = welcomeRepository.welcomemsg();
		return welcomemsg;
		
	}
}
