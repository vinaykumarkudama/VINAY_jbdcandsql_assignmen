package com.gl.employee.service;

import java.util.List;

import com.gl.employee.dao.IEmployeeDao;
import com.gl.employee.model.Employee;

public class EmployeeService implements IEmployeeService {

	private IEmployeeDao employeeDao;
	
    public EmployeeService(IEmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.insertEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		  employeeDao.updateEmployee(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
//		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployees();
//		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method 
		employeeDao.deleteAllEmployees();
		
	}

}
