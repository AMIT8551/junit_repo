package com.bikkadit.employeeManagement.repository;

import org.springframework.stereotype.Repository;

@Repository
public class WelcomeRepository {

	public String welcomemsg() {
		String  msg="Welcome to bikkadit";
		return msg; 
	}
}
