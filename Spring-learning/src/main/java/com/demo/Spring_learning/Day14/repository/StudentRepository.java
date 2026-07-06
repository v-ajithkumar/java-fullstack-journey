package com.demo.Spring_learning.Day14.repository;

import com.demo.Spring_learning.Day14.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
