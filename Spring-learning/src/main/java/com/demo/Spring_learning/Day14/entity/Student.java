package com.demo.Spring_learning.Day14.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "student_course",

            joinColumns = @JoinColumn(name = "student_id"),

            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    public Student() {
    }

    public Student(Long id, String name, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}