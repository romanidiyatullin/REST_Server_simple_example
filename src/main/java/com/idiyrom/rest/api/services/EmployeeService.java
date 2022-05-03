package com.idiyrom.rest.api.services;

import com.idiyrom.rest.api.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public int addOrEditEmployee(Employee employee);
    public int deleteEmployee(Employee employee);
}
