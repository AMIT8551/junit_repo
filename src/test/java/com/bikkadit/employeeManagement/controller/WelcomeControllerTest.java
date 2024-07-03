package com.bikkadit.employeeManagement.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.bikkadit.employeeManagement.services.WelcomeServices;

@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {

	@MockBean
	private WelcomeServices welcomeServices;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void welcomemsgtest() throws Exception {

		when(welcomeServices.welcomemsg()).thenReturn("welcome to Bikkadit");
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/welcome");
		
		ResultActions perform = mockMvc.perform(request);
		
		MvcResult mvcresult =perform.andReturn();
		
		int actualstatus = mvcresult.getResponse().getStatus();
		
		int expectedStatus=200;
		
		assertEquals(expectedStatus, actualstatus);
		
		
		
//		String ExpectedString = "welcome to Bikkadit massage";
//		String actualString = response.getContentAsString();
//		System.out.println(actualString);
//		assertEquals(ExpectedString, actualString);
		
		
	}

}
