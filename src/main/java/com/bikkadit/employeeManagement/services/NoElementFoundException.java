package com.bikkadit.employeeManagement.services;

public class NoElementFoundException extends RuntimeException {

	public NoElementFoundException (String msg){
		System.out.println(msg);
	}
}
