package com.bikkadit.employeeManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.employeeManagement.Model.Employee;
import com.bikkadit.employeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeServicesI {

	@Autowired
	public EmployeeRepository employeeRepository;
	

	@Override
	public Employee setEmp(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public Employee getEmp(int eid) {
		return employeeRepository.findById(eid).get();
	}

	@Override
	public boolean deleteEmployee(int eid) {
		employeeRepository.deleteById(eid);
		return employeeRepository.findById(eid).isPresent();
	}

	
}
