package com.demo.Spring_learning.Day12;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/employess")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/addEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
           return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeByID(id);
    }

    @PutMapping("/employee/{id}")
    public Employee updateAll(@RequestBody Employee employee,@PathVariable int id){
        return employeeService.updateAllDetails(id,employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
