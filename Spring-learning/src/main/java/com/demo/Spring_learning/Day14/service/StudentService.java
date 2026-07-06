package com.demo.Spring_learning.Day14.service;

import com.demo.Spring_learning.Day14.entity.Course;
import com.demo.Spring_learning.Day14.entity.Student;
import com.demo.Spring_learning.Day14.repository.CourseRepository;
import com.demo.Spring_learning.Day14.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository,CourseRepository courseRepository){
        this.studentRepository =studentRepository;
        this.courseRepository = courseRepository;
    }

    public Student saveStudent(Student student, List<Long> courseIds) {

        List<Course> courses = courseRepository.findAllById(courseIds);
        student.setCourses(courses);
        return studentRepository.save(student);
    }
}
