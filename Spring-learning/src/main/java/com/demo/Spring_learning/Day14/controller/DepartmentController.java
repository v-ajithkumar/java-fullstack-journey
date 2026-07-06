package com.demo.Spring_learning.Day14.controller;

import com.demo.Spring_learning.Day14.entity.Department;
import com.demo.Spring_learning.Day14.service.DepartmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department dept){
        return departmentService.saveDept(dept);
    }

}
