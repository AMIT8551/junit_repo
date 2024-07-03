package com.bikkadit.employeeManagement.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.easymock.EasyMock;
import org.easymock.IExpectationSetters;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.bikkadit.employeeManagement.repository.WelcomeRepository;

class WelcomeServicesTest {

	
	public WelcomeServices welcomeServices;
	public WelcomeRepository welcomeRepository;

	@Test
	public void welcomemsgtest() {

		//create Proxy object of dependency object
		WelcomeRepository welcomeRepositoryMock = EasyMock.createMock(WelcomeRepository.class);
		
		//inject proxy object into original dependency variable
		WelcomeServices welcomeServices = new WelcomeServices(welcomeRepositoryMock);
		
		//if we call dependency method then we get return something as per method return
		IExpectationSetters<String> andReturn = EasyMock.expect(welcomeRepositoryMock.welcomemsg()).andReturn("hello world");
		
		 
		//Activate the mock
		EasyMock.replay(welcomeRepositoryMock);
		
		//call original method
		String Actual_welcomemsg = welcomeServices.welcomemsg();
		
		System.out.println(Actual_welcomemsg);
		
		//verify expected interaction took place
		EasyMock.verify(welcomeRepositoryMock);
		
		//Compare with actual and expected
		assertEquals("hello world", Actual_welcomemsg);
	
	}

}
