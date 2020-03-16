package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> search(String q) {
        return employeeRepository.findByNameContaining(q);
    }

    @Override
    public Employee findOne(long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public void save(Employee contact) {
    	employeeRepository.save(contact);
    }

    @Override
    public void delete(Employee emp) {
    	employeeRepository.delete(emp);
    }
}	
