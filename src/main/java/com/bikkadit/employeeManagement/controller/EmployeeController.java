package com.bikkadit.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.employeeManagement.Model.Employee;
import com.bikkadit.employeeManagement.services.EmployeeServicesI;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeServicesI employeeServicesImp;


	@PostMapping(value = "/setEmp", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<Employee> setEmp(@RequestBody Employee emp) {

		Employee setEmp = employeeServicesImp.setEmp(emp);

		return new ResponseEntity<Employee>(setEmp, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getEmp", produces = { "application/json", "application/xml" })
	public ResponseEntity<Employee> setEmp(@RequestParam int id) {

		Employee employee = employeeServicesImp.getEmp(id);

		if (employee != null) {
			return new ResponseEntity<>(employee, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		employeeServicesImp.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
