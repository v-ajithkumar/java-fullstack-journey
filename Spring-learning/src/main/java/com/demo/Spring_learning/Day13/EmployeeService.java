package com.demo.Spring_learning.Day13;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class EmployeeService {
    private final Employeerepository employeerepository;

    public EmployeeService(Employeerepository employeerepository){
        this.employeerepository=employeerepository;
    }


    public Employee createEmployee(Employee employee) {
        return employeerepository.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeerepository.findAll();
    }

    public Optional<Employee> getById(int id) {
        return employeerepository.findById(id);
    }

    public void deleteById(Integer id) {
        employeerepository.deleteById(id);
    }
}
