package com.gl.employee.service;

import java.util.List;

import com.gl.employee.model.Employee;

public interface IEmployeeService {

	void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();

    void deleteAllEmployees();
}
