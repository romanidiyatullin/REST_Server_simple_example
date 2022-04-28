package com.idiyrom.rest.api.services;

import com.idiyrom.rest.api.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void addOrEditEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
}
