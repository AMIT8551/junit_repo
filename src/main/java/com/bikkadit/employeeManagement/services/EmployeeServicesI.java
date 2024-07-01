package com.bikkadit.employeeManagement.services;

import org.springframework.stereotype.Service;

import com.bikkadit.employeeManagement.Model.Employee;

@Service
public interface EmployeeServicesI {

	public Employee setEmp(Employee emp);
	
	public Employee getEmp(int eid);
	
	public boolean deleteEmployee(int eid); 
}
