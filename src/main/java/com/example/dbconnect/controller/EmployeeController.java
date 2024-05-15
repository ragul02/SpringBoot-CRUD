package com.example.dbconnect.controller;

import com.example.dbconnect.config.ApplicationConfig;
//import com.example.dbconnect.model.Employees;
//import com.example.dbconnect.service.EmployeeService;
import com.example.dbconnect.service.PropService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.ExecutorService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
//    @Autowired
//    EmployeeService employeeService;

    @Autowired
    PropService propService;

    // creating a logger
    Logger logger
            = LoggerFactory.getLogger(EmployeeController.class);

//    @GetMapping("/employees")
//    public List<Employees> getAllEmployees() {
//        return employeeService.getAllEmployees();
//    }

    @GetMapping("/")
    public String index() {
        // Logging various log level messages
//        logger.trace("Log level: TRACE");
        //from app.yml print prop > kubernets connect with profiles
        logger.info("********** Log level INFO: Spring boot application docker Demo k8s************** with property :: " + propService.getUserRole());
        logger.error("********** Log level ERROR: ERRO OCCURED MSG **************");
        logger.warn("********** Log level WARN: WARN  MSG **************");
        logger.info("********** Log level INFO:  test ghcr MSG **************");

        return "Greetings from Spring Boot!";
    }

//    @PostMapping("/employees")
//    public Employees saveEmployee(HttpServletRequest requestHeader, @Valid @RequestBody Employees employee) {
//        System.out.println("save employye" + employee.getEmailId() + employee.getFirstName() + employee.getLastName());
//        System.out.println("headers" + requestHeader.getHeader("Content-Type"));
//        return employeeService.createEmployee(employee);
//    }

}
