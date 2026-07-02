package com.demo.Spring_learning.Day12;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee>  getAllEmployee(){
        return employees;
    }

    public Employee addEmployee(Employee emp){
        employees.add(emp);
        return emp;
    }

    public Employee getEmployeeByID(int empId) {
        for(Employee emp : employees){
            if(emp.getId() == empId){
                return emp;
            }
        }
        return null;
    }

    public Employee updateAllDetails(int id, Employee updatedemployee) {
        for (Employee emp : employees){
            if(emp.getId() ==  id){
                emp.setName(updatedemployee.getName());
                emp.setDepartment(updatedemployee.getDepartment());
                emp.setSalary(updatedemployee.getSalary());
            }
        }
        return null;
    }


    public void deleteEmployee(int id) {
        for(Employee emp : employees){
            if(emp.getId() == id){
                employees.remove(emp);
            }
        }

    }
}
