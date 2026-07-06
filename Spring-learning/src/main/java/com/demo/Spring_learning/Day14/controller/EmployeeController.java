package com.demo.Spring_learning.Day14.controller;

import com.demo.Spring_learning.Day14.entity.Employee;
import com.demo.Spring_learning.Day14.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee emp , @RequestParam int id){
       return employeeService.saveEmployee(emp,id);
    }
}
