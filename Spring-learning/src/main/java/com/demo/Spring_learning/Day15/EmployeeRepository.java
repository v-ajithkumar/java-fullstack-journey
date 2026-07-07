package com.demo.Spring_learning.Day15;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public Employee findByName(String name);
    public List<Employee> findByNameAndDepartment(String name, String Department);
    public List<Employee> findByDepartmentOrAge(String department,int age);
    public List<Employee> findBySalaryBetween(int min,int max);
    public List<Employee> findBySalaryLessThan(int salary);
    public List<Employee> findByNameLike(String pattern);
    public List<Employee> findByNameContaining(String word);
    public List<Employee> findByDepartmentIn(List<String> dept);
    public List<Employee> findByDepartmentOrderBySalary(String dept);
}
