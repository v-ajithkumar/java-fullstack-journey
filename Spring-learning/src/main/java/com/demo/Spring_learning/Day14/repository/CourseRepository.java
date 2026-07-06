package com.demo.Spring_learning.Day14.repository;

import com.demo.Spring_learning.Day14.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
