package com.gl.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gl.employee.model.Employee;
import com.gl.employee.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao {

	public void insertEmployee(Employee employee) {
		String sql = "INSERT INTO employee (Id, Name, Email_Id, Phone_Number) VALUES (?, ?, ?, ?)";

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setString(3, employee.getEmail());
			preparedStatement.setString(4, employee.getPhoneNumber());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateEmployee(Employee employee) {
		String sql = "UPDATE employee SET Name=?, Email_Id=?, Phone_Number=? WHERE Id=?";

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setString(1, employee.getName());
			preparedStatement.setString(2, employee.getEmail());
			preparedStatement.setString(3, employee.getPhoneNumber());
			preparedStatement.setInt(4, employee.getId());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteEmployee(int id) {
		String sql = "DELETE FROM employee WHERE Id=?";

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Employee getEmployeeById(int id) {
		String sql = "SELECT * FROM employee WHERE Id=?";
		Employee employee = null;

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setInt(1, id);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.next()) {
					employee = new Employee();
					employee.setId(resultSet.getInt("Id"));
					employee.setName(resultSet.getString("Name"));
					employee.setEmail(resultSet.getString("Email_Id"));
					employee.setPhoneNumber(resultSet.getString("Phone_Number"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM employee";
		List<Employee> employees = new ArrayList<>();

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery()) {

			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt("Id"));
				employee.setName(resultSet.getString("Name"));
				employee.setEmail(resultSet.getString("Email_Id"));
				employee.setPhoneNumber(resultSet.getString("Phone_Number"));
				employees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;
	}

	public void deleteAllEmployees() {
		String sql = "DELETE FROM employee";

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}