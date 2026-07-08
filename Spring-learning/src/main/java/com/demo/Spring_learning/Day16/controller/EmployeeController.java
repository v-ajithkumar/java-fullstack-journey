package com.demo.Spring_learning.Day16.controller;

import com.demo.Spring_learning.Day16.DTO.ApiResponse;
import com.demo.Spring_learning.Day16.DTO.EmployeeDTO;
import com.demo.Spring_learning.Day16.EmployeeService;
import com.demo.Spring_learning.Day16.entity.Employee;
import com.demo.Spring_learning.Day16.interfaces.createEmloyee;
import com.demo.Spring_learning.Day16.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService ){
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ApiResponse<Employee> createEmployee(@Validated(createEmloyee.class)
                                     @RequestBody EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employee.setEmail(employeeDTO.getEmail());
        return new ApiResponse<>(
                true,
                "Employee saved succesfully",
                employee
        );
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }
}
