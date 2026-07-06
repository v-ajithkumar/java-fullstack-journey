package com.demo.Spring_learning.Day14.controller;

import com.demo.Spring_learning.Day14.entity.Course;
import com.demo.Spring_learning.Day14.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private final CourseService courseService;

   public CourseController(CourseService courseService){
        this.courseService = courseService;
   }

   @PostMapping("/add")
   public Course addCourse(@RequestBody Course course){
       return courseService.addCourseInDb(course);
   }

}
