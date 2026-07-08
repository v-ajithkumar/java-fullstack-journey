package com.demo.Spring_learning.Day16.controller;

import com.demo.Spring_learning.Day16.DTO.EmployeeDTO;
import com.demo.Spring_learning.Day16.entity.Employee;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @PostMapping("/add")
    public String createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setSalary(employeeDTO.getSalary());
        return "emp created sucessfully";
    }
}
