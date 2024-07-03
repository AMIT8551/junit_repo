package com.bikkadit.employeeManagement.repository;

import org.springframework.stereotype.Repository;

@Repository
public class WelcomerepositoryClass implements WelcomeRepository {

	@Override
	public String welcomemsg() {
		String msg = "hello world";
		return msg;
	}

}
