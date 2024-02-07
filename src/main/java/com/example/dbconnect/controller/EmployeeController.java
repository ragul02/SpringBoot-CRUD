package com.example.dbconnect.controller;

import com.example.dbconnect.model.Employees;
import com.example.dbconnect.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employees> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/employees")
    public Employees saveEmployee(@Valid @RequestBody Employees employee) {
        System.out.println("save employye" + employee.getEmailId() + employee.getFirstName() + employee.getLastName());

        return employeeService.createEmployee(employee);
    }

}
