package com.demo.Spring_learning.Day14.repository;

import com.demo.Spring_learning.Day14.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
