package com.bikkadit.employeeManagement.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.bikkadit.employeeManagement.Model.Employee;
import com.bikkadit.employeeManagement.repository.EmployeeRepository;

class EmployeeServiceImpTest {

	public EmployeeServiceImp employeeServiceImp;

	public EmployeeRepository employeeRepository;

	@Test
	public void setEmpTest() {

		EmployeeRepository EmployeeRepositoryMock = EasyMock.createMock(EmployeeRepository.class);
		EmployeeServiceImp employeeServiceImp = new EmployeeServiceImp(EmployeeRepositoryMock);

		Employee employee = new Employee(4, "pankaj", "Aero", "Pune");

		EasyMock.expect(EmployeeRepositoryMock.save(employee)).andReturn(employee);

		EasyMock.replay(EmployeeRepositoryMock);

		Employee Actual_setEmp = employeeServiceImp.setEmp(employee);

		EasyMock.verify(EmployeeRepositoryMock);

		assertEquals(4, Actual_setEmp.getEid());
		assertEquals("pankaj", Actual_setEmp.getEname());
		assertEquals("Aero", Actual_setEmp.getEdept());
		assertEquals("Pune", Actual_setEmp.getEcity());

	}

	@Test
	public void getEmpTest() {

		EmployeeRepository EmployeeRepositoryMock = EasyMock.createMock(EmployeeRepository.class);
		EmployeeServiceImp employeeServiceImp = new EmployeeServiceImp(EmployeeRepositoryMock);

		int id = 4;
		Employee employee1 = new Employee(4, "pankaj", "Aero", "Pune");

		EasyMock.expect(EmployeeRepositoryMock.findById(id)).andReturn(Optional.of(employee1));

		EasyMock.replay(EmployeeRepositoryMock);

		Employee Actual_Emp = employeeServiceImp.getEmp(id);

		EasyMock.verify(EmployeeRepositoryMock);

		assertEquals(4, Actual_Emp.getEid());
		assertEquals("pankaj", Actual_Emp.getEname());
		assertEquals("Aero", Actual_Emp.getEdept());
		assertEquals("Pune", Actual_Emp.getEcity());

	}

	@Test 
	public void TestgetEmpNoElementFoundException() {

		EmployeeRepository employeeRepositoryMock = EasyMock.createMock(EmployeeRepository.class);
		EmployeeServiceImp employeeServiceImp = new EmployeeServiceImp(employeeRepositoryMock);

		EasyMock.expect(employeeRepositoryMock.findById(5)).andReturn(Optional.empty());

		EasyMock.replay(employeeRepositoryMock);

		// Call the method to be tested and expect an exception
		assertThrows(NoElementFoundException.class, () -> {
			employeeServiceImp.getEmp(5);
		});

		EasyMock.verify(employeeRepositoryMock);
	}
}
