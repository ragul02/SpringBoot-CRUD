package com.example.dbconnect.repository;

import com.example.dbconnect.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends  JpaRepository<Employees, Long>{
}
