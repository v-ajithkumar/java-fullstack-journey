package com.demo.Spring_learning.Day14.repository;

import com.demo.Spring_learning.Day14.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
