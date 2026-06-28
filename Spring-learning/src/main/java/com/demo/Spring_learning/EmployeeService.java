package com.demo.Spring_learning;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public void showEmployee(){
        String data = employeeRepository.getEmployee();
        System.out.println(data);
    }
}
