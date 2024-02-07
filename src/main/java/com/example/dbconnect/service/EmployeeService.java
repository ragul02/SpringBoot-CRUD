package com.example.dbconnect.service;

import com.example.dbconnect.model.Employees;
import com.example.dbconnect.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    //getting all employees record by using the method findaAll() of CrudRepository
    public List<Employees> getAllEmployees()
    {
        List<Employees> employees = new ArrayList<Employees>();
        employeeRepository.findAll().forEach(books1 -> employees.add(books1));
        return employees;
    }

    public Employees createEmployee(Employees employee) {
        System.out.println(employee.getEmailId() + employee.getFirstName() + employee.getLastName());
        return employeeRepository.save(employee);
    }
}
