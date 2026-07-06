package com.demo.Spring_learning.Day14.service;

import com.demo.Spring_learning.Day14.entity.Department;
import com.demo.Spring_learning.Day14.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository=departmentRepository;
    }

    public  Department saveDept(Department dept) {
        return departmentRepository.save(dept);
    }
}
