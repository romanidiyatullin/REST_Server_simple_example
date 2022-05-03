package com.idiyrom.rest.api.dao;

import com.idiyrom.rest.api.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return  session.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    @Override
    public int addOrEditEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
        return employee.getId();
    }

    @Override
    public int deleteEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        int id = employee.getId();
        session.delete(employee);
        return id;
    }
}
