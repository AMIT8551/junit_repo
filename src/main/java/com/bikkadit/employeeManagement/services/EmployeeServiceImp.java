package com.bikkadit.employeeManagement.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.employeeManagement.Model.Employee;
import com.bikkadit.employeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeServicesI {

	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImp(EmployeeRepository employeeRepository){
		this.employeeRepository=employeeRepository;
	}

	@Override
	public Employee setEmp(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public Employee getEmp(int eid) {
		Optional<Employee> employee = employeeRepository.findById(eid);
		
		if (employee.isPresent()) {	
			return employee.get();
		}
		else {
			 throw new NoElementFoundException("no data found");
		}
	}

	@Override
	public boolean deleteEmployee(int eid) {
		employeeRepository.deleteById(eid); 
		return employeeRepository.findById(eid).isPresent();
	}

	
}
