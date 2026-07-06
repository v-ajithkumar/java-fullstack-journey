package com.demo.Spring_learning.Day14.controller;

import com.demo.Spring_learning.Day14.entity.Student;
import com.demo.Spring_learning.Day14.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student, @RequestParam List<Long> courseId){
        return studentService.saveStudent(student,courseId);
    }
}
