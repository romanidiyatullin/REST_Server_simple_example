package com.idiyrom.rest.api.controllers;

import com.idiyrom.rest.api.entities.Employee;
import com.idiyrom.rest.api.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class RESTController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("employees/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        int id = employeeService.addOrEditEmployee(employee);
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("employees/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        int deleted_id = employeeService.deleteEmployee(employee);
        return "Employee with id " + deleted_id + " was deleted";
    }
}