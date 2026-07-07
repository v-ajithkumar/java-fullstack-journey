package com.demo.Spring_learning.Day14.entity;

import jakarta.persistence.*;
import org.hibernate.sql.results.graph.Fetch;

@Entity
public class Employee {
    @Id
    private int id;

    @Column
    private String name;

    @ManyToOne(fetch =  FetchType.EAGER)
    @JoinColumn(name = "department_id" )
    private Department department;

    public Employee(){

    }
    public Employee(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department=department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }
}
