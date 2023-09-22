package com.gl.employee.dao;

import java.util.List;

import com.gl.employee.model.Employee;

public interface IEmployeeDao {

    void insertEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();

    void deleteAllEmployees();
}
