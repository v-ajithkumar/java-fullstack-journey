package com.demo.Spring_learning.Day14.service;

import com.demo.Spring_learning.Day14.entity.Course;
import com.demo.Spring_learning.Day14.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public  Course addCourseInDb(Course course) {
        return courseRepository.save(course);
    }
}
