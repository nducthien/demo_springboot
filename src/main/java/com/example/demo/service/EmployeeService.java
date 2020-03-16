package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
    Iterable<Employee> findAll();

    List<Employee> search(String q);

    Employee findOne(long id);

    void save(Employee emp);

    void delete(Employee emp);
}
