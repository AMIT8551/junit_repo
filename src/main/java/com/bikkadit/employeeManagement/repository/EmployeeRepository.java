package com.bikkadit.employeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadit.employeeManagement.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
