package com.bikkadit.employeeManagement.services;

import org.springframework.stereotype.Service;

import com.bikkadit.employeeManagement.repository.WelcomeRepository;

@Service
public class WelcomeServices {

	
	private WelcomeRepository welcomeRepository ;
	
	public WelcomeServices(WelcomeRepository welcomeRepository) {
		this.welcomeRepository=welcomeRepository;
		
	}
	
	public String welcomemsg() {
		String welcomemsg = welcomeRepository.welcomemsg();
		return welcomemsg;
		
	}
}
