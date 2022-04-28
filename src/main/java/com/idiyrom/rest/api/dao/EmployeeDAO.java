package com.idiyrom.rest.api.dao;

import com.idiyrom.rest.api.entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void addOrEditEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
}
