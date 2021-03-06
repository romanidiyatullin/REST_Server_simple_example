package com.idiyrom.rest.api.services;

import com.idiyrom.rest.api.dao.EmployeeDAO;
import com.idiyrom.rest.api.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public int addOrEditEmployee(Employee employee) {
        return employeeDAO.addOrEditEmployee(employee);
    }

    @Override
    @Transactional
    public int deleteEmployee(Employee employee) {
        return employeeDAO.deleteEmployee(employee);
    }
}
