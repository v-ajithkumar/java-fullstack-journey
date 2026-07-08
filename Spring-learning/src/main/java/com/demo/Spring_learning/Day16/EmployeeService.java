package com.demo.Spring_learning.Day16;
import com.demo.Spring_learning.Day16.customException.EmployeeNotFound;
import com.demo.Spring_learning.Day16.entity.Employee;
import com.demo.Spring_learning.Day16.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployee(int id){
        return employeeRepository.findById(id).
                orElseThrow( ()->
                        new EmployeeNotFound("Employee not found in db with this id " + id));
    }
}
