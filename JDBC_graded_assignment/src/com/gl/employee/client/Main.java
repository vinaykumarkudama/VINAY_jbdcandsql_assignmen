package com.gl.employee.client;

import java.util.List;

import com.gl.employee.dao.EmployeeDaoImpl;
import com.gl.employee.model.Employee;
import com.gl.employee.service.EmployeeService;
import com.gl.employee.util.DBUtil;

public class Main {

	public static void main(String[] args) {
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl(); // Assuming EmployeeDao has been implemented
		EmployeeService employeeService = new EmployeeService(employeeDao);

//        a. Insert 5 records.

//		System.out.println("Inserting 5 employee records...");
//		for (int i = 1; i <= 5; i++) {
//			Employee employee = new Employee(i, "Employee" + i, "employee" + i + "@example.com", "123456789" + i);
//			employeeService.addEmployee(employee);
//		}
//		System.out.println("5 employee records inserted successfully.");

		// Modify Email_Id column to varchar(30) NOT NULL

		// c. Insert 2 records and check
//		Employee employee6 = new Employee(6, "Employee6", "employee6@example.com", "9876543210");
//		Employee employee7 = new Employee(7, "Employee7", "employee7@example.com", "8765432109");
//		employeeService.addEmployee(employee6);
//		employeeService.addEmployee(employee7);

		// Display all employees
//		List<Employee> allEmployees = employeeService.getAllEmployees();
//		System.out.println("All Employees:");
//		for (Employee employee : allEmployees) {
//			System.out.println(employee);
//		}

		// d. Update employee record for Id 3
//		Employee employeeToUpdate = employeeService.getEmployeeById(3);
//		if (employeeToUpdate != null) {
//			employeeToUpdate.setName("Karthik");
//			employeeToUpdate.setPhoneNumber("1234567890");
//			employeeService.updateEmployee(employeeToUpdate);
//			System.out.println("\nEmployee with Id 3 updated successfully.");
//		}
		
		// Display all employees after update
//			List<Employee> allEmployees = employeeService.getAllEmployees();
//			System.out.println("\nAll Employees after update:");
//			allEmployees = employeeService.getAllEmployees();
//			for (Employee employee : allEmployees) {
//				System.out.println(employee);
//			}

		// e. Delete employee records 3 and 4
//		List<Employee> allEmployee = employeeService.getAllEmployees();
//        employeeService.deleteEmployee(3);
//        employeeService.deleteEmployee(4);
//			System.out.println("\nEmployee records with Id 3 and 4 deleted successfully.");
//
//			System.out.println("\nAll Employees after deletion:");
//			allEmployee = employeeService.getAllEmployees();
//			for (Employee employee : allEmployee) {
//				System.out.println(employee);
//			}
		
		// f. Remove all records from the table employee
			employeeService.deleteAllEmployees();
			System.out.println("\nAll employee records deleted.");
			
			// Close the DB connection
			DBUtil.close(DBUtil.getConnection());
	}
}
