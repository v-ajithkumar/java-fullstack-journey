package com.demo.Spring_learning.Day14.service;
import com.demo.Spring_learning.Day14.entity.Department;
import com.demo.Spring_learning.Day14.entity.Employee;
import com.demo.Spring_learning.Day14.repository.DepartmentRepository;
import com.demo.Spring_learning.Day14.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository,DepartmentRepository departmentRepository){
        this.employeeRepository = employeeRepository;
        this.departmentRepository =departmentRepository;
    }

    public Employee saveEmployee(Employee emp , int departmentId){
        Department dept = departmentRepository
                .findById(departmentId)
                .orElseThrow(() -> new RuntimeException("dept not found"));
        emp.setDepartment(dept);
        return employeeRepository.save(emp);
    }
}
