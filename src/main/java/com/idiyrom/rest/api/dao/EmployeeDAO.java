package com.idiyrom.rest.api.dao;

import com.idiyrom.rest.api.entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public int addOrEditEmployee(Employee employee);
    public int deleteEmployee(Employee employee);
}
